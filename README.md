# mondrian-dsp
A simple ant project to create a custom Mondrian Schema DSP (DynamicSchemaProcessor) for Pentaho, following suggestion from
this how-to http://thejavatar.com/dynamic-schema-processor-modify-mondrian-schema-in-run-time/ for the how-to. Thanks very much
to this guys.

A dynamic schema processor (DSP) is a custom processor that’s run whenever Mondrian makes a connection. Prior to Mondrian using the schema, the DSP can modify the schema. 
There are no restrictions on what modifications can be made, but the two most common uses of a DSP are to support localization and to restrict access to data in multi-tenanted environments. 

THE DSP IS A MONDRIAN FEATURE 
=============================
The DSP is not specific to Pentaho, although the way we’ll configure it here is. Any system that includes Mondrian as the analytics engine can use dynamic schema processors (DSP).

##Compilation

To make it simpler, needed external libraries are included into embedded lib directory. 
All other dependences are related to Pentaho and Java, and are available in assembled Pentaho platform. 

Compilation requires the following packages coming with Pentaho: 

	- mondrian-3.10.0.1-130.jar
    - log4j-1.2.17.jar
    - slf4j-api-1.7.3.jar 
    - pentaho-platform-core-5.4.0.1-130.jar
	- pentaho-platform-api-5.4.0.1-130.jar
	- ServletAPI (**servlet-api.jar** - is the only jar which is not available in Pentaho lib, but it is always coming with any Java Container)

Use ant in your source project main folder. 

1. Compile com.arenacube.mondrian.dsp with custom code (e.g. "USERNAME") using same java version running pentaho server

##Deployment

2. Ant script releases **com.arenacube.mondrian.dsp-1.x.jar** file in the dist directory. To deploy the extension, the jar file from **dist** directory should be simply copied into Pentaho lib directory (tomcat/webapps/pentaho/WEB-INF/lib). 

3. Define in XML Schema the follow role grant type using your custom code to replace, enclosed in % (e.g. %USER_NAME%)
	!TBD
		
4. Define in Pentaho a startup action that set "USERNAME" at user login (using a sample ktr job with Startup Rule Engine plugin)
   see $PENTAHO_HOME\pentaho-solutions\system\startupRules\rules\avacspro\ap_setSessionVariable.ktr
	
5. Configuring the DSP in pentaho connection
	The last step required to get a DSP to work is to tell Mondrian to use the dynamic schema processor for this schema.
	In Pentaho 5.0, you will no longer use the "datasources.xml" file to configure Mondrian catalogs. Instead, you will set 
	the properties when importing a Mondrian schema into the Pentaho repository.

