package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Library.Excellibrary;

public class Baseclass 
{
	WebDriver driver;
	Excellibrary xllib;
	@BeforeClass
	public void launch()
	{
		xllib=new Excellibrary();
	//	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	//	driver=new ChromeDriver();
	//	System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
	//	driver=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
/*	@AfterClass
	public void quit()
	{
		driver.quit();
	}*/
}
