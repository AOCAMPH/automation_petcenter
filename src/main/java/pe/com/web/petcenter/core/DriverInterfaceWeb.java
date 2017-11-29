package pe.com.web.petcenter.core;

import org.openqa.selenium.WebDriver;

public abstract class DriverInterfaceWeb {
	
	public abstract WebDriver instanceWebDriver(String browserName, String mode, String url);
	public abstract WebDriver driver();
	public abstract void freeDriver();
	protected abstract void setDriverPath();


}
