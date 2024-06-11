package org.testing.trigger;

import org.testing.testScripts.TC1_PostRequest;
import org.testing.testScripts.TC2_GetAllRequest;
import org.testing.testScripts.TC3_GetParticularRequest;
import org.testing.testScripts.TC4_DeleteRequest;
import org.testing.testScripts.TC5_PutMethod;

public class trigger {
   public static void main(String[] args) throws Exception {
	   /*TC1_PostRequest tc1 = new TC1_PostRequest();
	   tc1.testCase1();
	   TC2_GetAllRequest tc2 = new TC2_GetAllRequest();
	   tc2.testCase2();*/
	   //TC3_GetParticularRequest tc3 = new TC3_GetParticularRequest();
	  // tc3.testCase3();
	 //  TC5_PutMethod tc5 = new TC5_PutMethod();
	  // tc5.testCase5();
	   TC4_DeleteRequest tc4 = new TC4_DeleteRequest();
	   tc4.testCase4();
   }
}
