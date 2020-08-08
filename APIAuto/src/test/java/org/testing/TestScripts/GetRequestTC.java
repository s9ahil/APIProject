package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class GetRequestTC {
@Test
public void tc2() throws IOException
{
 Properties pr =PropertiesFileLoad.propertiesFile();
  HTTPMethods http=new HTTPMethods(pr);
 Response res= http.GetRequest("QA_URI",PostRequestTC.id);
 System.out.println("Test case 2");
 System.out.println("Get Request Response data");
 System.out.println(res.asString());
 ResponseStatusCodeValidate.responseStatusCode(res ,200);
//ResponseDataValidation.responseData(res,"Sharma","[2].lastname");
  
}
	
}
