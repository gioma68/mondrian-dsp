# mondrian-dsp
a simple ant project to create a custom Mondrian Schema DSP (DynamicSchemaProcessor) for Pentaho

A dynamic schema processor (DSP) is a custom processor that’s run whenever Mondrian makes a connection. Prior to Mondrian using the schema, the DSP can modify the schema. 
There are no restrictions on what modifications can be made, but the two most common uses of a DSP are to support localization and to restrict access to data in multi-tenanted environments. 

THE DSP IS A MONDRIAN FEATURE 
=============================
The DSP is not specific to Pentaho, although the way we’ll configure it here is. Any system that includes Mondrian as the analytics engine can use dynamic schema processors (DSP).
