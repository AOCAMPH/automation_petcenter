package pe.com.web.petcenter.core;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pe.com.web.petcenter.core.ElementNotPresentException;
import pe.com.web.petcenter.core.InterruptionException;

public class Driver {

	private WebDriver driver;

	public Driver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void launch(String url) {
		driver.get(url);
	}
	
	public void navigateTo(String ruta) {
		driver.navigate().to(ruta);
	}

	public void maximizarPantalla() {
		driver.manage().window().maximize();
	}

	public String pageURL() {
		return driver.getCurrentUrl();
	}

	public WebElement find(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			driver.quit();
			throw new ElementNotPresentException(
					"No se ha encontrado ningun elemento web en la ruta indicada: "
							+ locator);
		}
		return element;
	}
	
	public WebElement findWebElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			driver.quit();
			throw new ElementNotPresentException(
					"No se ha encontrado ningun elemento web en la ruta indicada: "
							+ locator);
		}
		return element;
	}

	public List<WebElement> findElements(By locator) {
		List<WebElement> element = null;
		try {
			element = driver.findElements(locator);
		} catch (NoSuchElementException e) {
			driver.quit();
			throw new ElementNotPresentException(
					"No se ha encontrado ningun elemento web en la ruta indicada: "
							+ locator);
		}
		return element;
	}

	public WebElement findExists(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			throw new ElementNotPresentException(
					"No se ha encontrado ningun elemento web en la ruta indicada: "
							+ locator);
		}
		return element;
	}

	public void sendKeys(String text, By locator) {
		find(locator).clear();
		find(locator).sendKeys(text);
	}
	
	public String getVisibleText(By locator) {
		return find(locator).getText();
	}
	
	public ArrayList<String> getVisibleTexts(By locator) {
	    final List<WebElement> elements = driver.findElements(locator);
	    final ArrayList<String> lista = new ArrayList<String>();
	    for (final WebElement webElement : elements) {
	      lista.add(webElement.getText());
	      }
		return lista;
	}

	public String getValue(By locator) {
		return find(locator).getAttribute("value");
	}

	public String getValue(By locator, String attributeName) {
		return find(locator).getAttribute(attributeName);
	}
	
	public boolean getValueChecked(By locator, String attributeName) 
	{
		boolean valor = false;
		if (attributeName.equals("checked")) {
			find(locator).getAttribute(attributeName);
			valor= true;
		}
		return valor;
	}

	public void click(By locator) {
		find(locator).click();
	}

	/**
	 * Indica si un elemento web (generado por el locator esperado) est� visible
	 * en pantalla. Un elemento web puede estar presente en el html pero no
	 * necesariamente visible para el usuario. Para determinar si un elemento
	 * est� presente en el html, utilizar {@link #elementIsPresent(By locator)}
	 * 
	 * @param locator
	 * @return boolean
	 */
	public boolean elementIsVisible(By locator) {
		return find(locator).isDisplayed();
	}

	/**
	 * Indica si un element web (generado por el locator esperado) est� presente
	 * en el html de la p�gina web. En caso se desee validar si un elemento web,
	 * adem�s de estar presente, es visible por el usuario, utilizar
	 * {@link #elementIsVisible(By locator)}
	 * 
	 * @param locator
	 * @return boolean
	 */
	public boolean elementIsPresent(By locator) {
		try {
			driver.findElement(locator);
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}

	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			throw new InterruptionException(
					"Error inesperado mientras el hilo con id="
							+ Thread.currentThread().getId()
							+ " estaba en espera");
		}
	}

	public void waitForElement(By expectedLocator) {
		Wait<WebDriver> wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(expectedLocator));
	}
	
	public void clear(By locator) {
		find(locator).click();
		find(locator).clear();
	}

	public boolean elementIsEnabled(By locator) {
		return driver.findElement(locator).isEnabled();
	}

	public boolean isChecked(By locator) {
		return find(locator).isSelected();
	}
	
	public boolean elementIsSelected(By locator) {
		return find(locator).isSelected();
	}
}
