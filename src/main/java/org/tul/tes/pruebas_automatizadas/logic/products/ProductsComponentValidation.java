/**
 * 
 */
package org.tul.tes.pruebas_automatizadas.logic.products;

import java.io.FileReader;
import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tul.tes.pruebas_automatizadas.logic.GlobalComponentValidation;

import com.opencsv.CSVReader;

/**
 * @author loboo
 *
 */
public class ProductsComponentValidation {

	/**
	 * 
	 */
	WebDriver driver;
	public ProductsComponentValidation(WebDriver driver) {
		// TODO Auto-generated constructor stub}
		super();
		this.driver = driver;
	}
	
	public void addCollections() throws Exception {
		System.out.println("- Cargando datos de coleccion a crear");
		CSVReader reader = null;
		try {
			reader = new CSVReader(new FileReader("C:\\Users\\loboo\\Desktop\\libro1.csv"));
			String[] nextLine = null;
			while ((nextLine = reader.readNext()) != null) {
				WebElement name = driver.findElement(By.xpath("/html/body/app-root/app-admin/nz-layout/nz-content/div[2]/app-general/app-products/app-collections/app-tul-table/app-tul-table-options/nz-spin/div/div/div/div/div/app-add-option/div/div/nz-form-item[1]/div/div[2]/nz-form-control/div/div/input"));
				name.sendKeys(nextLine[0]);
                WebElement description = driver.findElement(By.xpath("/html/body/app-root/app-admin/nz-layout/nz-content/div[2]/app-general/app-products/app-collections/app-tul-table/app-tul-table-options/nz-spin/div/div/div/div/div/app-add-option/div/div/nz-form-item[2]/div/div[2]/nz-form-control/div/div/input"));
                description.sendKeys(nextLine[1]);
                WebElement dropdowntype = driver.findElement(By.xpath("/html/body/app-root/app-admin/nz-layout/nz-content/div[2]/app-general/app-products/app-collections/app-tul-table/app-tul-table-options/nz-spin/div/div/div/div/div/app-add-option/div/div/nz-form-item[3]/div/div[2]/nz-form-control/div/div/nz-select/nz-select-top-control"));
                dropdowntype.click();
                WebElement type = driver.findElement(By.xpath("/html/body/div/div[3]/div/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item["+Integer.parseInt(nextLine[2])+"]"));
                type.click();
                WebElement dropdownbrand = driver.findElement(By.xpath("/html/body/app-root/app-admin/nz-layout/nz-content/div[2]/app-general/app-products/app-collections/app-tul-table/app-tul-table-options/nz-spin/div/div/div/div/div/app-add-option/div/div/nz-form-item[4]/div/div[2]/nz-form-control/div/div/nz-select/nz-select-top-control"));
                dropdownbrand.click();
                Thread.sleep(3000);
                WebElement brand = driver.findElement(By.xpath("/html/body/div/div[3]/div/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item["+Integer.parseInt(nextLine[3])+"]"));
                brand.click();
                WebElement add = driver.findElement(By.xpath("/html/body/app-root/app-admin/nz-layout/nz-content/div[2]/app-general/app-products/app-collections/app-tul-table/app-tul-table-options/nz-spin/div/div/div/div/div/app-add-option/div/div/div/button"));
                add.click();
                Thread.sleep(3000);
                this.characterValidation(nextLine[0], nextLine[1]);
                Thread.sleep(4000);
			}
		} catch (Throwable e) {
			throw new Exception(e.getMessage());
		} finally {
			if (null != reader) {
				reader.close();
			}
		}
	}
	
	private void characterValidation(String text1, String text2) {
		char[] charSearch = {'*','!','"','#','$','%','&','/','(',')','=','?','¡','¨','*','[','_','-','>','<'}; 
		System.out.println("- Validando creacion");
        if(driver.findElement(By.xpath(
				"/html/body/app-root/app-admin/nz-layout/nz-content/div[2]/app-general/app-products/app-collections/app-tul-table/app-tul-table-options/nz-spin/div/div/div/div/div/app-details-option/nz-tabset/div/div/div[1]/div"))
				.isDisplayed()) {
        	if(GlobalComponentValidation.inputCharacterValidation(text1, charSearch) || 
        			GlobalComponentValidation.inputCharacterValidation(text2, charSearch)) {
        		Assert.assertTrue("Error caracteres especiales ingresados", false);        		
        	}        	
        	driver.navigate().to("https://backoffice.dev.soytul.com/admin/general/products/collections/add");
        } else {
        	Assert.assertTrue("Error colección no creada", false);
        }		
	}

}
