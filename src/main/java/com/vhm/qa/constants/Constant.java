package com.vhm.qa.constants;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Constant {
	static File directory = new File("./");
	public static String path;  //=System.getenv("VHM");
	public static String BROWSER_NAME;
	public static String APP_URL;
	public String exePath;
	public static String USERNAME;
	public static String PASSWORD;


	static {
		final Properties prop = new Properties();

		try {
			path=directory.getAbsolutePath();
			path=path.replace(".", "").concat("\\resources");

		final FileInputStream ip = new FileInputStream(path+"\\config.properties");
		 prop.load(ip);

		 BROWSER_NAME = prop.getProperty("BROWSER_NAME");
		 APP_URL=prop.getProperty("url");
		 USERNAME=prop.getProperty("username");
		 PASSWORD=prop.getProperty("password");

		} catch (final Exception e) {
			// TODO Auto-generated catch block			e.printStackTrace();
		}
	}
}
