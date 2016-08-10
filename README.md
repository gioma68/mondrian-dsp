# mondrian-dsp
A simple ant project to create a custom Mondrian Schema DSP (DynamicSchemaProcessor) for Pentaho, following suggestion from
this how-to http://thejavatar.com/dynamic-schema-processor-modify-mondrian-schema-in-run-time/ .
Thanks very much to this guys.

"A dynamic schema processor (DSP) is a custom processor that’s run whenever Mondrian makes a connection. Prior to Mondrian using the schema, the DSP can modify the schema. 
There are no restrictions on what modifications can be made, but the two most common uses of a DSP are to support localization and to restrict access to data in multi-tenanted environments." (from official Mondrian documentation) 

The DSP is a mondrian feature 
=============================
"The DSP is not specific to Pentaho, although the way we’ll configure it here is. Any system that includes Mondrian as the analytics engine can use dynamic schema processors (DSP)." (from official Mondrian documentation)

##The requirements 
My company want to filter sales data for Agent Dimension. One Agent can log in Pentaho and **see only his data and related sub-agent** (hierarchy agent-sub agent is defined in a closure table). I can't do a Role for every Agent because the dimension is SCD type 2 (so the structure/relation between agent/sub-agent can vary in time).

##Compilation

Use `ant` in your source project main folder. 

1. Compile **com.mysample.mondrian.dsp** where you **set the session var to use as value for the XML Schema placeolder** (in my example "USERNAME", change it in the main class as you need), and - to compile - use the same java version running pentaho server.

##Deployment

2. Ant script releases **com.mysample.mondrian.dsp-1.x.jar** file in the dist directory. To deploy the extension, the jar file from **dist** directory should be simply copied into Pentaho lib directory (tomcat/webapps/pentaho/WEB-INF/lib). 

3. Define in Mondrian XML Schema, a role grant type using your custom code to be replaced by session var value, enclosed in % (e.g. %USER_NAME%). My working example (the Agent can see only his/her commission amount and all related his/her sub-agents, defined with a parent-child relation using closure table):
```xml
  <Role name="Agents Role">
    <SchemaGrant access="none">
        <CubeGrant cube="Agency Commission" access="all">
            <HierarchyGrant hierarchy="[Agents]" rollupPolicy="partial" access="custom">
                <MemberGrant member="[Agents].CurrentMember.Parent" access="none">
                </MemberGrant>
                <MemberGrant member="[Agents].[%USER_NAME%]" access="all">
                </MemberGrant>
            </HierarchyGrant>
        </CubeGrant>
    </SchemaGrant>
   </Role>
```

4. Define in Pentaho a startup action that set "USERNAME" at user login (using a sample ktr job with Startup Rule Engine plugin).
   Put the ktr file in $PENTAHO_HOME/pentaho-solutions/system/startupRules/rules/{your kettle file}.ktr
	
5. Configuring the DSP in pentaho connection.
   The last step required to get a DSP to work is to tell Mondrian to use the dynamic schema processor for this schema.
   In Pentaho 5.0, you will no longer use the "datasources.xml" file to configure Mondrian catalogs. Instead, you will set 
   the properties when importing a Mondrian schema into the Pentaho repository (see the referenced how-to).

6. Login in pentaho with different user/role and see how it works (**work well with Pivot4J plugin for Pentaho CE 5.4.0**, JPivot seems to be indifferent to role definitions because don't use Pentaho connections definition).

**NOTE**
If modify the source java code for DSP and rebuild jar lib, you must first stop Pentaho, redeploy the jar in the Pentaho lib (overwriting, or removing the older) and restart pentaho

**UPDATE**
If you need only the default Pentaho `username` session value, you can change the line of code where get the session `username` var with `String usercode = session.getName().toString();`, this permit to avoid using a startup kettle job to set the session var.


