package pe.com.web.petcenter.core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class MainTestCase {
	private static DriverFactory driverFactory = null;
	@Parameters({ "browserName", "mode", "applicationURL" })
	@BeforeMethod
	protected void setUp(String platform, String mode, String url) 
	{
		if (url != null) {
			driverFactory = new DriverFactory();
			driverFactory.getDriver(platform, mode, url);
			driverFactory.setDriver(driverFactory.driver());
		}
	}

	@AfterMethod
	protected void tearDown() 
	{
		if (driverFactory.driver() != null)
			driverFactory.tearDown();
	}

	protected static Driver driver() {
		return new Driver(driverFactory.driver());
	}
}