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

public class TC2_GetAllRequest {
	@Test
	  public void testCase2() throws Exception {
		  Properties p = PropertiesHandle.loadProperties("../DummyApiFWAutomationTestNg/URI.properties");
		  HTTPMethods http = new HTTPMethods(p);
		  http.getAllMethod("QA2_URI");
		  
	
	 }

}
