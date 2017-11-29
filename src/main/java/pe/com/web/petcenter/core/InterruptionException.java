package pe.com.web.petcenter.core;

import org.openqa.selenium.WebDriverException;

public class InterruptionException extends WebDriverException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6781991549332011087L;

	public InterruptionException() {
		
	}
	
	public InterruptionException(String msg) {
		super(msg);
	}
}