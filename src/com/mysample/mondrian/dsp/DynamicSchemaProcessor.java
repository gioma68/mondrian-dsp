/*
*
* Custom Schema processor which helps to implement dynamic security roles for an Agent dimension
*
* This software is subject to the terms of the Eclipse Public License v1.0
* Agreement, available at the following URL: http://www.eclipse.org/legal/epl-v10.html.
* You must accept the terms of that agreement to use this software.
*
* @author gmartano
* @since Jan 2016
* @version 1.0.0
*
*/
package com.arenacube.mondrian.dsp;

import mondrian.olap.Util;
import mondrian.spi.*;
import mondrian.i18n.*;

import org.pentaho.platform.api.engine.IPentahoSession;
import org.pentaho.platform.engine.core.system.PentahoSessionHolder;

import org.apache.log4j.Logger;
import java.io.InputStream;
import java.util.regex.PatternSyntaxException; 
/* used to log to console for first debug purpose */
import static java.lang.System.out;

public class DynamicSchemaProcessor extends LocalizingDynamicSchemaProcessor {
	private static final Logger LOG = Logger.getLogger(DynamicSchemaProcessor.class);

	/** Creates a new instance of class */
	public DynamicSchemaProcessor() {
	}
	
	@Override
	public String filter(String schemaUrl, Util.PropertyList connectInfo, InputStream stream)
		throws Exception {
			String schema = super.filter(schemaUrl, connectInfo, stream);
			System.out.println("[CUSTOM.DSP] *********** Started DSP Custom ***********");
			IPentahoSession session = PentahoSessionHolder.getSession();
			String usercode = (String) session.getAttribute("USERNAME");
			try {
				System.out.println("[CUSTOM.DSP] Trying to replace '%USER_NAME%' with session value: "+usercode);
				LOG.info("Trying to replace '%USER_NAME%' with session value: "+usercode);
				schema = schema.replaceAll("%USER_NAME%", usercode);
			}
			catch (PatternSyntaxException pse) {
				System.out.println("[CUSTOM.DSP] Some error during custom schema processing: "+usercode);
				LOG.error("Some error during custom schema processing. " , pse);
				pse.printStackTrace();
			}
		LOG.info("DSP Ended correctly for "+usercode);
		System.out.println("[CUSTOM.DSP] *********** DSP Ended correctly for "+usercode+" ***********");
		return schema;
	}
}
