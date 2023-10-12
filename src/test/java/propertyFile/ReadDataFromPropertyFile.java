package propertyFile;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		//step 1:- Take the property file path
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.Properties");
		//step 2: create object for property file
		Properties p = new Properties();
		//step 3:load the file into object of properties
		p.load(fis);
		//step 4: get the values of property file based on key
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD =p.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
}

}