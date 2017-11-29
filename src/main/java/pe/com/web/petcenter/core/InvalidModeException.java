package pe.com.web.petcenter.core;

import org.openqa.selenium.WebDriverException;

public class InvalidModeException extends WebDriverException {

	/**
	 * SerialID
	 */
	private static final long serialVersionUID = 2175951515226919814L;
	
	public InvalidModeException() {		
	}
	
	public InvalidModeException(String message)	{
		super(message);
	}
}