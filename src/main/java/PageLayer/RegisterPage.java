package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {
	
	@FindBy(xpath="//a[text()=' sign-in '] ")
	private WebElement link;
	
	@FindBy(name="userName")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement paswd;
	
	@FindBy(name="submit")
	private WebElement submt;
	
	
	public RegisterPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlick() {
		
		click(link);
	}
	
	public void userinfo(String UName, String Passw) {
		
		sendKeys(user,UName);
		sendKeys(paswd,Passw);
		click(submt);
		
	}
        
	public String CurrentTitle() {
		
		return driver.getTitle();
		
		
	}
	
		
	}


