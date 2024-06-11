package org.testing.utilities;

import java.util.regex.Pattern;

//input parameter complete requestBody, variableName, variableValue
//purpose of the value to the requestBody
//outputParameter after replacement requestBody it will return
public class JsonReplacement {
   public static String assignJsonValue(String requestBody, String variableName, String variableValue) {
	   requestBody = requestBody.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
	   return requestBody;
   }
}
