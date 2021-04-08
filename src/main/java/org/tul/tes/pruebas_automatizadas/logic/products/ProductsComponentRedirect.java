/**
 * 
 */
package org.tul.tes.pruebas_automatizadas.logic.products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author loboo
 *
 */
public class ProductsComponentRedirect {

	/**
	 * 
	 */
	WebDriver driver;
	public ProductsComponentRedirect(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
	}
	
	public void redirectBoToCollections() {
		System.out.println("- Redireccionando a Ordenes");
		WebElement menu = driver.findElement(By.xpath("/html/body/app-root/app-admin/app-header/app-header-desktop/nz-header/div/div/i"));
		menu.click();
		WebElement dropsubmenu = driver.findElement(By.xpath("//*[@id=\"general.product\"]/div"));
		dropsubmenu.click();
		WebElement dropsubproducts = driver.findElement(By.xpath("//*[@id=\"general.product.collections\"]"));
		dropsubproducts.click();
	}
	
	public void redirectAdd() {
		System.out.println("- Redireccionando a agregar colleción");
		WebElement add = driver.findElement(By.xpath("//*[@id=\"add-option-table\"]"));
		add.click();
	}
	
	public void redirectAddLater() {
		System.out.println("- Redireccionando a agregar nueva coleccion");
		WebElement add = driver.findElement(By.xpath("/html/body/app-root/app-admin/nz-layout/nz-content/div[2]/app-general/app-products/app-collections/app-tul-table/app-tul-table-options/nz-spin/div/div/div/div/div/app-header-option/nz-page-header/div/nz-page-header-extra/a[2]/button"));
		add.click();
	}	

}
