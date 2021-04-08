/**
 * 
 */
package org.tul.tes.pruebas_automatizadas.logic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * @author loboo
 *
 */
public class LoginImplement {

	/**
	 * 
	 */
	
	WebDriver driver;
	Object[][] datastorage = {
			{"warehouse", 1},
			{"Notifications", "[{\"title\":\"Edición multiple de filas\",\"description\":\"Se agrega la opción de poder editar multiples filas al mismo tiempo opción disponible en clients y ordenes\",\"visible\":true}]"},
			{"user", "{\"id\":9727,\"name\":\"Claudia Norato\",\"email\":\"claudia.norato@tul.com.co\",\"cellphone\":\"3008987777\",\"role_id\":22,\"email_verified_at\":null,\"deleted_at\":null,\"created_at\":\"2021-01-06T20:47:45.000000Z\",\"updated_at\":\"2021-02-12T14:27:08.000000Z\",\"fcm_token\":\"\",\"created_by\":3347,\"updated_by\":13,\"deleted_by\":null,\"created_from\":\"web_backoffice\",\"updated_from\":\"web_backoffice\",\"deleted_from\":\"api\",\"enable\":true,\"created_device_by\":null,\"updated_device_by\":null,\"deleted_device_by\":null,\"menu_general\":[{\"id\":\"general.order.all\"},{\"id\":\"general.product.all\"},{\"id\":\"general.product.category\"},{\"id\":\"general.product.brand\"},{\"id\":\"general.product.attributes\"},{\"id\":\"general.product.collections\"},{\"id\":\"general.crm.approaches\"},{\"id\":\"general.client.all\"},{\"id\":\"general.client.features\"},{\"id\":\"general.client.shop_cart\"},{\"id\":\"general.client.ironmongerie\"},{\"id\":\"general.client.cluster\"},{\"id\":\"general.client.level\"},{\"id\":\"general.client.tulCredits\"},{\"id\":\"general.client.soat\"},{\"id\":\"general.partners.stores\"},{\"id\":\"general.partners.suppliers\"},{\"id\":\"general.logistic.warehouse\"},{\"id\":\"general.logistic.shipping_method\"},{\"id\":\"general.logistic.dispatch.shipments\"},{\"id\":\"general.logistic.dispatch.shippingZones\"},{\"id\":\"general.logistic.dispatch.shipmentsPendingAll\"},{\"id\":\"general.logistic.dispatch.shipmentsProgressingAll\"},{\"id\":\"general.logistic.dispatch.bulkPackageByWarehouseAll\"},{\"id\":\"general.logistic.dispatch.routeGenerationAll\"},{\"id\":\"general.logistic.dispatch.driver\"},{\"id\":\"general.logistic.dispatch.assistant\"},{\"id\":\"general.logistic.dispatch.truck\"},{\"id\":\"general.logistic.dispatch.truck_type\"},{\"id\":\"general.payment.all\"},{\"id\":\"general.payment.paymentMethods\"},{\"id\":\"general.payment.keoData\"},{\"id\":\"general.payment.orderPayments\"},{\"id\":\"general.micro-bank.micro-bank-credits\"},{\"id\":\"general.micro-bank.micro-bank-payments\"},{\"id\":\"general.micro-bank.micro-banks\"},{\"id\":\"general.promotion.price.general\"},{\"id\":\"general.promotion.price.all\"},{\"id\":\"general.promotion.price.cupons\"},{\"id\":\"general.promotion.price.freeShipping\"},{\"id\":\"general.promotion.price.buyTogether\"},{\"id\":\"general.promotion.price.moreForLess\"},{\"id\":\"general.promotion.price.volumePromotions\"},{\"id\":\"general.promotion.credits.credit\"},{\"id\":\"general.promotion.credits.conditionalCredits\"},{\"id\":\"general.promotion.credits.activeCredits\"},{\"id\":\"general.marketing.brand\"},{\"id\":\"general.marketing.category\"},{\"id\":\"general.marketing.home\"},{\"id\":\"general.marketing.promotion\"},{\"id\":\"general.marketing.product\"},{\"id\":\"general.accounting.invoices\"},{\"id\":\"general.accounting.invoicing\"},{\"id\":\"general.setting.location.department\"},{\"id\":\"general.setting.location.city\"},{\"id\":\"general.setting.location.location\"},{\"id\":\"general.setting.location.neighborhood\"},{\"id\":\"general.setting.location.zone\"},{\"id\":\"general.setting.taxe\"},{\"id\":\"general.help.questionsAnswer\"},{\"id\":\"general.user.user\"},{\"id\":\"general.user.hunter\"},{\"id\":\"general.user.user-support\"},{\"id\":\"general.user.role\"},{\"id\":\"general.user.menu\"},{\"id\":\"general.user.mototul\"}],\"menu_specific\":[{\"id\":\"specific.order.all\"},{\"id\":\"specific.product.stock_list\"},{\"id\":\"specific.product.inventory\"},{\"id\":\"specific.product.price\"},{\"id\":\"specific.product.approved\"},{\"id\":\"specific.product.damage\"},{\"id\":\"specific.client.all\"},{\"id\":\"specific.client.hunter_assignment\"},{\"id\":\"specific.client.shop_cart\"},{\"id\":\"specific.client.ironmongerie\"},{\"id\":\"specific.setting.date\"},{\"id\":\"specific.logistic.dashboards.dashboard_logistic\"},{\"id\":\"specific.logistic.dashboards.dashboard_consolidate\"},{\"id\":\"specific.logistic.method_shipping\"},{\"id\":\"specific.logistic.logistic_calendar\"},{\"id\":\"specific.logistic.collection_routes\"},{\"id\":\"specific.logistic.dispatch.shipments.shipmentsByWarehouse\"},{\"id\":\"specific.logistic.dispatch.shipments.shipmentPending\"},{\"id\":\"specific.logistic.dispatch.shipments.shipmentsProgressingByWarehouse\"},{\"id\":\"specific.logistic.dispatch.packages.bulkPackage\"},{\"id\":\"specific.logistic.dispatch.packages.planning\"},{\"id\":\"specific.logistic.dispatch.packages.package\"},{\"id\":\"specific.logistic.dispatch.packages.paintpackage\"},{\"id\":\"specific.logistic.dispatch.packages.pickedPackages\"},{\"id\":\"specific.logistic.dispatch.packages.deliveredPackages\"},{\"id\":\"specific.logistic.dispatch.routes.routesGeneration\"},{\"id\":\"specific.logistic.dispatch.routes.route\"},{\"id\":\"specific.logistic.dispatch.routes.mapsroute\"},{\"id\":\"specific.logistic.dispatch.routes.devolutions\"},{\"id\":\"specific.logistic.dispatch.routes.driver\"},{\"id\":\"specific.logistic.dispatch.routes.penaltiesDrivers\"},{\"id\":\"specific.logistic.dispatch.routes.assistant\"},{\"id\":\"specific.logistic.dispatch.routes.truck_type\"},{\"id\":\"specific.logistic.dispatch.routes.truck\"},{\"id\":\"specific.logistic.dispatch.routes.motoTul\"},{\"id\":\"specific.logistic.extra_cost_authorizations\"},{\"id\":\"specific.logistic.report.logistic\"},{\"id\":\"specific.logistic.report.consolidate\"}],\"general_menu\":true,\"keep_alive\":false,\"can_telesale\":true,\"uuid\":\"82c8dc4c-300b-4910-bc6d-0fd2216a0137\",\"status\":\"enable\",\"can_restore_package\":true,\"app_bo_type\":\"admin\",\"type\":\"user\"}"},
			{"access_token", "28265|Xw4RQ2hXm07rEvOc6SSRpKiLdEi2wYy6kasorLsn"}};
	
	public LoginImplement(WebDriver driver) throws Exception {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
	}
	
	public void storage() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("- Iniciando logeo");
		try {
			for(int i=0; i < datastorage.length; i++) {
	    		js.executeScript("localStorage.setItem('"+ datastorage[i][0] +"','"+datastorage[i][1]+"');");
	    	}			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Error iniciando sesion", e);
		}  
    	/*js.executeScript("localStorage.setItem('key','value');");  
    	
    	
    	String[][] arraystorage = {{(String) js.executeScript("return localStorage.getItem('access_token')"), "access_token"},
    	{(String) js.executeScript("return localStorage.getItem('warehouse')"), "warehouse"},
    	{(String) js.executeScript("return localStorage.getItem('Notifications')"), "Notifications"},
        {(String) js.executeScript("return localStorage.getItem('user')"),"user"}};*/
    }

}
