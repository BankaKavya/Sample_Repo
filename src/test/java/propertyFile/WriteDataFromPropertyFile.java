package propertyFile;



import java.io.FileOutputStream;

import java.util.Properties;

 

public class WriteDataFromPropertyFile {

	public static void main(String[] args) throws Exception {

		
		//step 1 : create object at property file

		Properties p = new Properties();

		//step 2: provide the keys and value details

		p.setProperty("browser","Edge");

		p.setProperty("username", "admin");

		//step 3: path for property file

		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\WriteData.Properties");

    	//step 4: load the property file

		p.store(fos,"This is my common data file");

	}

 

 

}

	

	
