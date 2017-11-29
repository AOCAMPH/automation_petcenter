package pe.com.web.petcenter.core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFirefox extends DriverInterfaceWeb {

	private FirefoxDriver driver;
	
	@Override
	public FirefoxDriver instanceWebDriver(String browserName, String mode, String url) {
		System.out.println("entra 7");
		System.setProperty("binary", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\alexander.ocampo\\workspace\\practice02\\Jars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
//			System.out.println("sale 1");
		return driver;
	}
	@Override
	public FirefoxDriver driver() {
		return driver;
	}

	@Override
	public void freeDriver() {
		driver.quit();	
	}

	@Override
	protected void setDriverPath() {}
	
}
