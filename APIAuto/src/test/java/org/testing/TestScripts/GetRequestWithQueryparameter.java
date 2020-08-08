package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class GetRequestWithQueryparameter {
@Test
public void tc3() throws IOException
{
 Properties pr =PropertiesFileLoad.propertiesFile();
  HTTPMethods http=new HTTPMethods(pr);
 Response res= http.GetRequestWithQuery("QA_URI","firstname",PostRequestTC.firstname);
 System.out.println("Test case 3");
 System.out.println("Get Request Response data");
 System.out.println(res.asString());
 ResponseStatusCodeValidate.responseStatusCode(res ,200);
//ResponseDataValidation.responseData(res,"Sharma","[2].lastname");
  
}
	
}