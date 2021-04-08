/**
 * 
 */
package org.tul.tes.pruebas_automatizadas.environment;

import org.openqa.selenium.WebDriver;

/**
 * @author Claudia_Norato
 *
 */
public class RunEnvironment {

	/**
	 * 
	 */
	private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    static void setWebDriver(WebDriver webDriver) {
        RunEnvironment.webDriver = webDriver;
    }

}
