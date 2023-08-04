package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{
	
	public static void sendKeys(WebElement wb, String value) {
		
		if(wb.isDisplayed()&&wb.isEnabled());
		{
			wb.sendKeys(value);
		}
	}
	
          public static void click(WebElement wb) {
		
		if(wb.isDisplayed()&&wb.isEnabled());
		{
			wb.click();
		}
   }


       public static void findElements(List<WebElement>ls, String value) {
    	   
    	  for (WebElement a:ls)
    	  {
    		  if(a.getText().equalsIgnoreCase(value)) 
    		  {
    			  a.click();
    			  break;
    			  
    		  }
    	  }
       }
       
       public static String getCurrentTile() {
    	   
    	   return driver.getTitle();
       }
	
	  
}


