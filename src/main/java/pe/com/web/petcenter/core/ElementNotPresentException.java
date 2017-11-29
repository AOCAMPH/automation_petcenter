package pe.com.web.petcenter.core;

import org.openqa.selenium.NoSuchElementException;

public class ElementNotPresentException extends NoSuchElementException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7866845021122785932L;

	public ElementNotPresentException(String reason) {
		super(reason);
	}
}