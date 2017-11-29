package pe.com.web.petcenter.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChrome extends DriverInterfaceWeb {

	private ChromeDriver driver;
	
	@Override
	public ChromeDriver instanceWebDriver(String browserName, String mode, String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alexander.ocampo\\Desktop\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		return driver;
	}
	@Override
	public ChromeDriver driver() {
		return driver;
	}

	@Override
	public void freeDriver() {
		driver.quit();	
	}

	@Override
	protected void setDriverPath() {}
	
}
