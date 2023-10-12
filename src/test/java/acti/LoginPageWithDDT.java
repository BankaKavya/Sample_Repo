package acti;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginPageWithDDT

{

	public static void main(String[] args) throws InterruptedException, Throwable

	{
    	//Step 1: Read the common data from property file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties p =new Properties();
		p.load(fis);
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		WebDriver driver=null;
		if (BROWSER.equalsIgnoreCase("Edge"))
		{
			driver = WebDriverManager.edgedriver().create();
			System.out.println("Edge browser launched");

		}

		else if (BROWSER.equalsIgnoreCase("Chrome"))

		{
			driver = WebDriverManager.chromedriver().create();
			System.out.println("Chrome browser launched");
		}
		else if (BROWSER.equalsIgnoreCase("Firefox"))
		{

			driver = WebDriverManager.firefoxdriver().create();

			System.out.println("Firefox browser launched");

		}
		else
		{
			System.out.println("Invalid browser launched");
		}		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("Logged out successfully3");
		driver.quit();

	}

}

 