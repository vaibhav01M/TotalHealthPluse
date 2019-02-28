package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Keywords.Constants;

public class ReadProperty {

	public static String readProperty(String propertyFilePath, String propertyName){
	
 		String property = null;
		try {
			Constants.in = new FileInputStream(propertyFilePath);
		    Properties prop = new Properties();
		    prop.load(Constants.in);
            property = prop.getProperty(propertyName);
            Constants.in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property;		
	}
}
