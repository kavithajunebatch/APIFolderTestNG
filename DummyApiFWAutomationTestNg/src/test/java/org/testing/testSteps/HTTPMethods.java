package org.testing.testSteps;
import static io.restassured.RestAssured.*;

import java.util.Properties;

import org.testing.utilities.PropertiesHandle;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
//constructor assigning the values
public class HTTPMethods {
	Properties pr;
	public HTTPMethods(Properties pr) {
		this.pr=pr;
	}
  public Response postMethod(String jsonBody, String uriKeyName) {
      String uriValue = pr.getProperty(uriKeyName);
	  Response res = given().contentType(ContentType.JSON).body(jsonBody).when().post(uriValue);	
	  System.out.println("Response Code"+res.statusCode());
	  return res;
  }
  
  public void getMethod(String uriKeyName) {
      String uriValue = pr.getProperty(uriKeyName);
	  Response res = given().contentType(ContentType.JSON).when().get(uriValue);	
	  System.out.println("PostResponse Code"+res.statusCode());
	  System.out.println("Response Code"+res.asString());
  }
  
  public void getAllMethod(String uriKeyName) throws Exception {
      String uriValue = pr.getProperty(uriKeyName);
      Response res = given().contentType(ContentType.JSON).when().get(uriValue);	
	  System.out.println("GetAllMethodResponse Code"+res.statusCode());
	  System.out.println("Response Code"+res.asString());
  }
  
  public void getParticularMethod(String uriKeyName, String endPointValue) throws Exception {
      String uriValue = pr.getProperty(uriKeyName)+ "/" + endPointValue;
      Response res = given().contentType(ContentType.JSON).when().get(uriValue);	
	  System.out.println("GetParticularResponse Code"+res.statusCode());
	  System.out.println("Response Code"+res.asString());
  }


public void deleteMethod(String uriKeyName, String endPointValue) throws Exception {
    String uriValue = pr.getProperty(uriKeyName)+ "/" + endPointValue;
    Response res = given().contentType(ContentType.JSON).when().delete(uriValue);	
	  System.out.println("DeleteResponse Code"+res.statusCode());
	  System.out.println("Response Code"+res.asString());
}
public Response putMethod(String jsonBody, String uriKeyName,String endPointValue) {
    String uriValue = pr.getProperty(uriKeyName)+ "/" + endPointValue;
	  Response res = given().contentType(ContentType.JSON).body(jsonBody).when().put(uriValue);	
	  System.out.println("Response Code"+res.statusCode());
	  return res;
}
  
}
