package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
public class Demo01 {
   
	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
			WebDriver driver=WebDriverManager.edgedriver().create();
			driver.get("https://www.google.com");
			driver.findElement(By.id(""));
			
			
		}
		
		
	

}
