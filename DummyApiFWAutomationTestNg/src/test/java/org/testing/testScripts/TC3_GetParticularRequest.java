package org.testing.testScripts;

import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC3_GetParticularRequest {
	@Test
	public void testCase3() throws Exception {
		try {
		  Properties p = PropertiesHandle.loadProperties("../DummyApiFWAutomationTestNg/URI.properties");
		  HTTPMethods http = new HTTPMethods(p);
		  http.getParticularMethod("QA_URI", TC1_PostRequest.returnIdValue);
		 // http.getParticularMethod("QA_URI");
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	 }
}
