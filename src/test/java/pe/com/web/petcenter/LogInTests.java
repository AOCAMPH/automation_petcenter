package pe.com.web.petcenter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pe.com.web.petcenter.core.MainTestCase;
import pe.com.web.petcenter.data.DataLogin;
import pe.com.web.petcenter.api.login.LoginPage;

public class LogInTests extends MainTestCase{
	
	@Parameters({"browserName"})
	@Test
	public void VerifyClickingLoginLink(String platform) throws Exception
	{	
				LoginPage login = new LoginPage(driver(), platform);
				login
					 .clicEnlaceIniciarSesion()
					 .ingresarUsuario(DataLogin.LOGIN_USUARIO)
					 .ingresarPassword(DataLogin.LOGIN_PASSWORD)
					 .clicIniciarSesion();		
	}
}
