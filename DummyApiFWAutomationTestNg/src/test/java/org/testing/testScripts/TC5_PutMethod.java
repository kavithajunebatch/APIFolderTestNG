package org.testing.testScripts;

import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC5_PutMethod {
	public static String returnIdValue;
 public void testCase5() throws Exception {
	try {
	 Properties p = PropertiesHandle.loadProperties("../APIFWAutomation/URI.properties");
	 String requestBody = JsonHandle.readJsonData("../APIFWAutomation/src/test/java/org/testing/resources/updateRequestBody.json");
	 requestBody = JsonReplacement.assignJsonValue(requestBody, "id",TC1_PostRequest.returnIdValue);
	 HTTPMethods http = new HTTPMethods(p);
	// http.postMethod(requestBody, "QA_URI");
	 //http.getMethod("QA_URI");
	 //http.getAllMethod("QA_URI");
	 
	  Response res = http.putMethod(requestBody, "QA_URI", TC1_PostRequest.returnIdValue);
	  
	}catch(Exception e) {
		e.printStackTrace();
	}
}
} 
