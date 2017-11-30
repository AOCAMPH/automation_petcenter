package pe.com.web.petcenter.core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverEdge extends DriverInterfaceWeb {

	private EdgeDriver driver;
	
	@Override
	public EdgeDriver instanceWebDriver(String browserName, String mode, String url) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\alexander.ocampo\\Desktop\\Automation\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		return driver;
	}
	@Override
	public EdgeDriver driver() {
		return driver;
	}

	@Override
	public void freeDriver() {
		driver.quit();	
	}

	@Override
	protected void setDriverPath() {}
	
}
