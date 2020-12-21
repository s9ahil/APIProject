package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class XmltoJson {

	 public static String XmltoJSonConverion(String xml)
	 {
		 
		 JSONObject j=XML.toJSONObject(xml);
		 return XML.toString(j);
	 }
	 public static String XmltoJSONArray(String xml)
	 {
		 JSONArray ja=new JSONArray(xml);
		 return ja.toString();
	 }

}
