package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class ResponseExtractionUsingJsonPath {
public static String responseExtract(String JsonPath,Response res) {

	return res.jsonPath().get(JsonPath);
}

}
