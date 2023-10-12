package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_PopUp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable -- notification");
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver(options); */
		
		
		EdgeOptions options=new EdgeOptions();
		//options.addArguments("--disable -notification");
		options.setCapability("disable-infobars", false);
		//options.setCapability("disable-notification", true);
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://www.quikr.com");
		 driver.close();
	}

}
