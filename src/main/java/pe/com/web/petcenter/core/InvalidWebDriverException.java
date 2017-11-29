package pe.com.web.petcenter.core;

import org.openqa.selenium.WebDriverException;


public class InvalidWebDriverException extends WebDriverException {
	
	/**
	 * serialId
	 */
	private static final long serialVersionUID = 1L;

	public InvalidWebDriverException() {		
	}
	
	public InvalidWebDriverException(String message) {
		super(message);
	}
}