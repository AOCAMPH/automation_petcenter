package pe.com.web.petcenter.core;

import org.openqa.selenium.WebDriverException;

public class InvalidArgumentException extends WebDriverException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4722364310387995576L;

	public InvalidArgumentException() {
	}

	public InvalidArgumentException(String message) {
		super(message);
	}

	public InvalidArgumentException(Throwable cause) {
		super(cause);
	}

	public InvalidArgumentException(String message, Throwable cause) {
		super(message, cause);
	}
}