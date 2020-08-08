package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods {

	Properties pr;
public HTTPMethods(Properties pr)
{
	this.pr=pr;
}
	

	public Response PostRequest (String bodyData, String urikey) 
	{
	 Response res=
	 given()
	 .contentType(ContentType.JSON)
	 .body(bodyData)
	 .when()
	 .post(pr.getProperty(urikey));
	
		return res;		
	}

	public Response GetRequest(String uriKey, String EndPoint)
	{
		String uri = pr.getProperty(uriKey)+"/"+EndPoint; 
	 Response res =
	 given()
	 .contentType(ContentType.JSON)
	  .when()
	  .get(uri);
	 return res;
	}
	public Response GetRequestWithQuery(String uriKey, String QueryParameter, String QueryValue)
	{
		String uri = pr.getProperty(uriKey)+"?"+QueryParameter+"="+QueryValue; 
		System.out.println("URI is "+uri);
	 Response res =
	 given()
	 .contentType(ContentType.JSON)
	  .when()
	  .get(uri);
	 return res;
	}
	public Response PutRequest(String body,String uriKey, String EndPoint)
	{
		String uri = pr.getProperty(uriKey)+"/"+EndPoint; 
	 Response res =
	 given()
	 .contentType(ContentType.JSON)
	 .body(body)
	 .when()
	 .put(uri);
	 return res;
	}
	public Response DeleteRequest(String uriKey, String idvalue)
	{
		String uri = pr.getProperty(uriKey)+"/"+idvalue; 
	 Response res =
	 given()
	 .contentType(ContentType.JSON)
	
	 .when()
	 .delete(uri);
	 return res;
	}
}
