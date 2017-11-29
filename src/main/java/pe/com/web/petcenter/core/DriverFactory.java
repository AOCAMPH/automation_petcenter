package pe.com.web.petcenter.core;

import org.openqa.selenium.WebDriver;
import pe.com.web.petcenter.core.InvalidModeException;
import pe.com.web.petcenter.core.InvalidWebDriverException;

public class DriverFactory {
	
	private DriverInterfaceWeb genericDriverWeb;
	private WebDriver driver;
	
	public void getDriver(String browserName, String mode, String... url)
	{
		if(browserName.equalsIgnoreCase("firefox")){
			genericDriverWeb = new DriverFirefox();
		}else if (browserName.equalsIgnoreCase("Chrome")){
			genericDriverWeb = new DriverChrome();
		}else {
			genericDriverWeb = null;
			throw new InvalidWebDriverException(driverExceptionMessage(browserName));
		}
		setMode(browserName,mode, url);
	}

	private WebDriver setMode(String browserName, String mode, String... url) 
	{
		if (mode.equals("local")) {
			driver = genericDriverWeb.instanceWebDriver(browserName, mode, url[0]);
		} else {
			driver = null;
			throw new InvalidModeException(modeExceptionMessage(mode));
		}
		return driver;
	}
	
	
	public void tearDown()
	{
		genericDriverWeb.freeDriver();
	}

	
	public WebDriver driver()
	{
		return genericDriverWeb.driver();
	}
	
	private String driverExceptionMessage(String browserName) {
		StringBuilder builder = new StringBuilder();
		String exceptionMsg = "\n[No se ha indicado un explorador v�lido para inicializar el webdriver]\n";
		String actualMsg = "- Se especific� \"" + browserName +"\"\n";
		String expectedMsg = "- Se esperaba \"android\", o \"iOS\"";
		builder.append(exceptionMsg);
		builder.append(actualMsg);
		builder.append(expectedMsg);
		return builder.toString();
	}
	
	private String modeExceptionMessage(String mode) {
		StringBuilder builder = new StringBuilder();
		String exceptionMsg = "\n[No se ha indicado un modo de ejecuci�n v�lido para inicializar el webdriver]\n";
		String actualMsg = "- Se especific� \"" + mode +"\"\n";
		String expectedMsg = "- Se esperaba \"local\", o \"remote\"";
		builder.append(exceptionMsg);
		builder.append(actualMsg);
		builder.append(expectedMsg);
		return builder.toString();
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
