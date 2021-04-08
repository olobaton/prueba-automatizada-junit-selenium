/**
 * 
 */
package org.tul.tes.pruebas_automatizadas.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.tul.tes.pruebas_automatizadas.environment.RunEnvironment;
import org.tul.tes.pruebas_automatizadas.logic.GlobalComponentValidation;
import org.tul.tes.pruebas_automatizadas.logic.LoginImplement;
import org.tul.tes.pruebas_automatizadas.logic.UrlValidation;
import org.tul.tes.pruebas_automatizadas.logic.orders.OrdersComponentValidation;
import org.tul.tes.pruebas_automatizadas.logic.orders.OrdersComponenteRedirect;
import org.tul.tes.pruebas_automatizadas.environment.EnvironmentManager;


/**
 * @author loboo
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOrders {

	/**
	 * 
	 */
	WebDriver driver;
	LoginImplement logintest;
	UrlValidation urlvalidation;
	OrdersComponenteRedirect redirectcomponent;
	OrdersComponentValidation componentorders;
	GlobalComponentValidation globalcomponent;
	
	@Before
    public void startBrowser() throws InterruptedException, Exception {
    	/* --- Entorno Chrome interface ---*/
        EnvironmentManager.initWebDriver();
        driver = RunEnvironment.getWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.initDependencies();
        Thread.sleep(5000);
        driver.get("https://backoffice.dev.soytul.com/login");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();        
    }
	
	@Test
	public void test1() throws InterruptedException, Exception {
		this.logintest.storage();
		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(8000);
		this.urlvalidation.BOurlValidation();
		Thread.sleep(8000);
		redirectcomponent.redirectBoToOrders();
		Thread.sleep(12000);
		componentorders.ordersTableValidation();
		Thread.sleep(3000);
		globalcomponent.ExcelDownloadValidation();
		Thread.sleep(3000);		
		
	}
	
	
	@After
    public void tearDown() {
        EnvironmentManager.shutDownDriver();
    }
	
	private void initDependencies() throws Exception {
		logintest = new LoginImplement(this.driver);
		urlvalidation = new UrlValidation(this.driver);
		redirectcomponent = new OrdersComponenteRedirect(this.driver);
		componentorders = new OrdersComponentValidation(this.driver);
		globalcomponent = new GlobalComponentValidation(this.driver);
	}

}
