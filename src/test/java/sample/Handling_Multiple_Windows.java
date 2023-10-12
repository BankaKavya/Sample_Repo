package sample;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Handling_Multiple_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method 
        WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        String mainwindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        //println("Child window closed");
        
	}

}
