package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC1_PostRequest {
	public static String returnIdValue;
	public void testCase1() throws Exception  {
		// TODO Auto-generated method stub

		Properties p= PropertiesHandle.loadProperties("../DummyApiFWAutomation/URI.properties");
		String requestBody=JsonHandle.readJsonData("../DummyApiFWAutomation/src/test/java/org/testing/resources/requestBody.json");
		
		System.out.println("Enter id value");
		Scanner sc=new Scanner(System.in);
		Integer intValue=sc.nextInt();
		requestBody=JsonReplacement.assignJsonValue(requestBody, "id", intValue.toString());
		HTTPMethods http=new HTTPMethods(p);
		Response resObj=http.postMethod(requestBody, "QA2_URI");
		returnIdValue=JsonParsing.doParsing(resObj, "id");// use this in TC3
	}
}
