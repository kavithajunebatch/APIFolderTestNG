package org.testing.testScripts;

import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC3_GetParticularRequest {
	public void testCase3() throws Exception {
		try {
		  Properties p = PropertiesHandle.loadProperties("../APIFWAutomation/URI.properties");
		  HTTPMethods http = new HTTPMethods(p);
		  http.getParticularMethod("QA_URI", TC1_PostRequest.returnIdValue);
		 // http.getParticularMethod("QA_URI");
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	 }
}
