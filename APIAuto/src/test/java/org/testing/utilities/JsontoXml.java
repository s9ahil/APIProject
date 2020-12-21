package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class JsontoXml {

 public static String JsontoXmlConverion(String jsondata)
 {
	 JSONObject j=new JSONObject(jsondata);
	 return XML.toString(j);
 }
 public static String JsonArraytoXml(String jsondata)
 {
	 JSONArray ja=new JSONArray(jsondata);
	 return XML.toString(ja);
 }
}
