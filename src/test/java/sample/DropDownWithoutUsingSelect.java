package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutUsingSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); //launch the browser
		driver.manage().window().maximize(); // maximize the browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.calculator.net/interest-calculator.html");
		driver.findElement(By.id("ccompound")).click();
		List<WebElement> allOptions=driver.findElements(By.xpath("//select[@name='ccompound'"));
		System.out.println(allOptions.size());
		for(int i=0;i<allOptions.size();i++) {
			if(allOptions.get(i).getText().contains("quarterly")) {
				allOptions.get(i).click();
				break;
			}
			
		}
		driver.close();

	}

}
