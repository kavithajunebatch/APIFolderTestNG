package org.testing.testScripts;

import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC4_DeleteRequest {
	public void testCase4() throws Exception {
		  Properties p = PropertiesHandle.loadProperties("../DummyApiFWAutomation/URI.properties");
		  HTTPMethods http = new HTTPMethods(p);
		  http.deleteMethod("QA1_URI", TC1_PostRequest.returnIdValue);
		  
	
	 }
}
