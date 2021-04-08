/**
 * 
 */
package org.tul.tes.pruebas_automatizadas.logic.orders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author loboo
 *
 */
public class OrdersComponenteRedirect {

	/**
	 * 
	 */
	WebDriver driver;
	public OrdersComponenteRedirect(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
	}
	
	public void redirectBoToOrders() {
		System.out.println("- Redireccionando a Ordenes");
		WebElement dropordenes = driver.findElement(By.xpath("//*[@id=\"specific.order\"]/div/span"));
		dropordenes.click();
		WebElement dropsubordenes = driver.findElement(By.xpath("//*[@id=\"specific.order.all\"]/a/span"));
		dropsubordenes.click();
	}

}
