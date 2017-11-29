package pe.com.web.petcenter.api.login;

import org.openqa.selenium.By;

import pe.com.web.petcenter.core.Driver;


public class LoginPage {
	
	private Driver driver;
	private String platform;
	private By lnkIniciarSesion;
	private By txtUsuario;
	private By txtPassword;
	private By btnIniciarSesion;

	public LoginPage(Driver driver, String platform) {
		this.driver = driver;
		this.platform = platform;
		setLocators();
	}

	public void setLocators() {
		if (platform.equals("firefox") || platform.equals("chrome") || platform.equals("IE")) {
			lnkIniciarSesion = By.id(LoginLocators.LOGIN_ID_INICIAR_SESION_LNK);
			txtUsuario = By.id(LoginLocators.LOGIN_ID_USUARIO_TXT);
			txtPassword = By.id(LoginLocators.LOGIN_ID_PASSWORD_TXT);
			btnIniciarSesion = By.id(LoginLocators.LOGIN_ID_INICIAR_SESION_BTN);
		}
	}
	
	public LoginPage clicEnlaceIniciarSesion()
	{
		driver.click(lnkIniciarSesion);
		driver.sleep(5);
		return this;
	}
	
	public LoginPage ingresarUsuario(String usuario)
	{
		driver.sendKeys(usuario, txtUsuario);
		return this;
	}
	
	public LoginPage ingresarPassword(String password)
	{
		driver.sendKeys(password, txtPassword);
		return this;
	}
	
	public LoginPage clicIniciarSesion()
	{
		driver.click(btnIniciarSesion);
		driver.sleep(5);
		return this;
	}
	
}
