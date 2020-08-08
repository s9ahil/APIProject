package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFileRead {

	public static String bodyDataRead(String path) throws FileNotFoundException
	
	{
		
	File f=new File(path);
	FileReader fr=new FileReader(f);
	JSONTokener js =new JSONTokener(fr);
	JSONObject bodyData=new JSONObject(js);
	return bodyData.toString();
		
	}
}
