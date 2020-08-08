package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseDataValidation {
	
	public static void responseData(Response res, String expectedData,String jsonPath)
	{
	 String actualdata = res.jsonPath().get(jsonPath);
	if(actualdata.equals(expectedData))
	{ System.out.println("Data is matching");
	}
	else {
	System.out.println("Data is not matching");	
	}
	}
}
