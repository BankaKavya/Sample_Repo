package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); //launch the browser
		driver.manage().window().maximize(); // maximize the browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        //Traversing through the list and printing its text along with link address
        for(WebElement link:allLinks){
        System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }
        driver.close();   
	}
}
