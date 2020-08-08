package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement {

	public static String jsonVariable(String body,String variableName,String variableValue)
	{
	body=body.replaceAll(Pattern.quote("{{"+variableName +"}}"),variableValue);
	return body;	
	}
}
