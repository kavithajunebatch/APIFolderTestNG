package org.testing.testScripts;

import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC4_DeleteRequest {
	@Test
	public void testCase4() throws Exception {
		  Properties p = PropertiesHandle.loadProperties("../DummyApiFWAutomationTestNg/URI.properties");
		  HTTPMethods http = new HTTPMethods(p);
		  http.deleteMethod("QA1_URI", TC1_PostRequest.returnIdValue);
		  
	
	 }
}
