package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); //launch the browser
		driver.manage().window().maximize(); // maximize the browser
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url="https://www.calculator.net/interest-calculator.html";
		driver.get(url);
		Select dropDownLoactor=new Select(driver.findElement(By.id("ccompound")));
		dropDownLoactor.selectByVisibleText("quarterly");
		Thread.sleep(3000);
		driver.close();
        

	}

}
