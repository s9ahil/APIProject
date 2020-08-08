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

public class PutRequestTC4 {
@Test	
	public void tc4() throws IOException 
	{
		
		JSONObject Putreq =new JSONObject();
		Putreq.put("firstname","Sahil"	);
		Putreq.put("lastname","Joshi");
		Properties pr= PropertiesFileLoad.propertiesFile();
		HTTPMethods http =new HTTPMethods(pr);
		Response res= http.PutRequest(Putreq.toString(),"QA_URI",PostRequestTC.id);
		System.out.println("Test Case 4");
		System.out.println("Patch Request Data");
		System.out.println(res.asString());
		ResponseStatusCodeValidate.responseStatusCode(res,200);
		ResponseDataValidation.responseData(res,"Joshi","lastname");
		 
	}
}
