/**
 * 
 */
package org.tul.tes.pruebas_automatizadas.environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author Claudia_Norato
 *
 */
public class EnvironmentManager {

	/**
	 * 
	 */
		public static void initWebDriver() {
			System.out.println("Cargando entorno...");
	        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	        ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.setHeadless(false);
	        WebDriver driver = new ChromeDriver(chromeOptions);
	        RunEnvironment.setWebDriver(driver);
	    }

	    public static void shutDownDriver() {
	        RunEnvironment.getWebDriver().quit();
	    }

}
