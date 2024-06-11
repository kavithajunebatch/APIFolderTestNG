package org.testing.utilities;

import io.restassured.response.Response;
//input parameter responseObject and JsonPath
//purpose - it will extract from response based upon JsonPAth
public class JsonParsing {
     public static String doParsing(Response res, String jsonPath) {
    	 
    	 String responseValue = res.jsonPath().get(jsonPath);
    	 return responseValue;
    			//return jsonPath;
	     }
}
