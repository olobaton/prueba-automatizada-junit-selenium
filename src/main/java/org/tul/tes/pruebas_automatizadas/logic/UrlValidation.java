/**
 * 
 */
package org.tul.tes.pruebas_automatizadas.logic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * @author loboo
 *
 */
public class UrlValidation {

	/**
	 * 
	 */
	WebDriver driver;
	String urlbo;
	public UrlValidation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
	}
	
	public void BOurlValidation() {
		urlbo = driver.getCurrentUrl();
        System.out.println("- Validando URL BO");
        Assert.assertEquals("https://backoffice.dev.soytul.com/admin/dashboard",urlbo);		
	}

}
