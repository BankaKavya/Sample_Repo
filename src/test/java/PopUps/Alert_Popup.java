package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Popup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =WebDriverManager.edgedriver().create();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();		 
		 Alert alert=driver.switchTo().alert();		 
		 //click on OK confirmation app
		// alert.accept();	
		 //System.out.println("Clicked on ok confirmation app");		 
		 //Get text from confirmation app
		 //Alert alert=driver.switchTo().alert();
		 String al=alert.getText();
		 System.out.println(al);
		 
		 //Click on cancel on confirmation app
		// alert.dismiss();
		 //System.out.println("Clicked on cancel button on Confirmation app");	 
	}

}
