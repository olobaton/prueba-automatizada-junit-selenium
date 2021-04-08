/**
 * 
 */
package org.tul.tes.pruebas_automatizadas.logic.orders;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author loboo
 *
 */
public class OrdersComponentValidation {

	/**
	 * 
	 */
	WebDriver driver;
	public OrdersComponentValidation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
	}
	
	public void ordersTableValidation() {
		System.out.println("- Validando consulta de elementos");
		Assert.assertTrue("Error validando carga de datos en la tabla de ordenes", driver.findElement(By.xpath(
				"//*[@id=\"tul-table-orders\"]/nz-table/nz-spin/div/div/nz-table-inner-scroll/div[2]/table/tbody"))
				.isDisplayed());
		WebElement botonexportar = driver.findElement(By.xpath("//*[@id=\"export-option-table\"]"));
		botonexportar.click();
		WebElement dropexcel = driver.findElement(By.cssSelector(".ant-dropdown"));
		dropexcel.click();
	}

}
