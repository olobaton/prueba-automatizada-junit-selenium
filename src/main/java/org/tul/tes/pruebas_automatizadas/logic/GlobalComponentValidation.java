/**
 * 
 */
package org.tul.tes.pruebas_automatizadas.logic;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * @author loboo
 *
 */
public class GlobalComponentValidation {

	/**
	 * 
	 */
	WebDriver driver;
	private static String fileDownloadpath = "C:\\Users\\loboo\\Downloads";
	public GlobalComponentValidation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
	}
	
	public void ExcelDownloadValidation() {
		System.out.println("- Validando archivo .xlxs");
        //Assert.assertTrue("Error en archivo descargado", isFileDownloaded(fileDownloadpath, "mailmerge.xls"));
        Assert.assertTrue("Error en archivo descargado", isFileDownloaded_Ext(fileDownloadpath, ".xlsx"));		
	}
	
	public static boolean inputCharacterValidation(String text, char[] args) {
		boolean flag = false;
		String str = text;
        char[] charSearch = args; 
        for(int i=0; i<str.length(); i++) 
        {
            char chr = str.charAt(i);
            for(int j=0; j<charSearch.length; j++)
            {
                if(charSearch[j] == chr)
                {
                    flag = true;     
                }
            }  
        }		
		return flag;
		
	}
	
	private boolean isFileDownloaded_Ext(String dirPath, String ext) {
		boolean flag=false;
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        flag = false;
	    }
	    
	    for (int i = 1; i < files.length; i++) {
	    	if(files[i].getName().contains(ext)) {
	    		flag=true;
	    	}
	    }
	    return flag;
	}
    
    private boolean isFileDownloaded(String downloadPath, String fileName) {
		boolean flag = false;
	    File dir = new File(downloadPath);
	    File[] dir_contents = dir.listFiles();
	  	    
	    for (int i = 0; i < dir_contents.length; i++) {
	        if (dir_contents[i].getName().equals(fileName))
	            return flag=true;
	            }

	    return flag;
	}
    

}
