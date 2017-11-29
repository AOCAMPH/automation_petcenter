package pe.com.web.petcenter.core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverIE extends DriverInterfaceWeb {

	private InternetExplorerDriver driver;
	
	@Override
	public InternetExplorerDriver instanceWebDriver(String browserName, String mode, String url) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\alexander.ocampo\\Desktop\\Automation\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		return driver;
	}
	@Override
	public InternetExplorerDriver driver() {
		return driver;
	}

	@Override
	public void freeDriver() {
		driver.quit();	
	}

	@Override
	protected void setDriverPath() {}
	
}
