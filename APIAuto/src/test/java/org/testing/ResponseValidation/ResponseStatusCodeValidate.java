package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidate {

public static void responseStatusCode(Response res, int expectedStatusCode)
{
 if (res.getStatusCode()==expectedStatusCode)
 {
	System.out.println("Response Status code is matching");
  }
 else
 {
	 
	 System.out.println("Response Status Code is not matching");
 }

}
}
