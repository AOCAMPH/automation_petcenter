package pe.com.web.petcenter;

import pe.com.web.petcenter.core.Driver;

public class BasePage {
	
	protected Driver driver;
	protected String platform;

	public BasePage(Driver driver, String platform){
		this.driver = driver;
		this.platform = platform;
	}

	
}
