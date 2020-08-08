package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class DeleteRequestTC {
@Test
	public void tc5() throws IOException 
	{
		Properties pr= PropertiesFileLoad.propertiesFile();
		HTTPMethods http =new HTTPMethods(pr);
		System.out.println("Test Case 5");
		System.out.println("Data is deleted for id"+PostRequestTC.id);
		Response res= http.DeleteRequest("QA_URI",PostRequestTC.id);
		ResponseStatusCodeValidate.responseStatusCode(res,200);
		
}
}
