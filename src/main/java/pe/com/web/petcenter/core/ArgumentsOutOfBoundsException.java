package pe.com.web.petcenter.core;

import org.openqa.selenium.WebDriverException;

public class ArgumentsOutOfBoundsException extends WebDriverException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 109918309866925924L;

	public ArgumentsOutOfBoundsException() {
		
	}

	public ArgumentsOutOfBoundsException(String message) {
		super(message);
	}

	public ArgumentsOutOfBoundsException(Throwable cause) {
		super(cause);
	}

	public ArgumentsOutOfBoundsException(String message, Throwable cause) {
		super(message, cause);
	}
}