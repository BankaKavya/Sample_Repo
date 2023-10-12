package Pop_UPS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	    WebDriver driver=WebDriverManager.edgedriver().create();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
       /* driver.get("https://www.yatra.com");
        
        driver.findElement(By.xpath("//label[@for='BE_flight_origin_date']")).click();
        driver.findElement(By.id("16/10/2023")).click();
        driver.close();    
        */
	    driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("C:\\Users\\Kavya.Banka\\Desktop");
	    Thread.sleep(5000);
	    driver.close();
	    
	}

}
