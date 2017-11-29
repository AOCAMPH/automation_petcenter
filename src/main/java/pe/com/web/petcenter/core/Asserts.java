package pe.com.web.petcenter.core;

import org.openqa.selenium.WebDriver;

public class Asserts {

	WebDriver driver;
	boolean value;

	public Asserts(String browser) {
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
