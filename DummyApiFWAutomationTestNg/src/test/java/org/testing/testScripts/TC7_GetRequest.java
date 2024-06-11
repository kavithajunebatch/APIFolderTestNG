package org.testing.testScripts;

import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC7_GetRequest {
	@Test
	  public void testCase7() throws Exception {
		  Properties p = PropertiesHandle.loadProperties("../DummyApiFWAutomationTestNg/URI.properties");
		  HTTPMethods http = new HTTPMethods(p);
		  http.getMethod("QA1_URI");
		  
	
	 }

}
