package PageLayer;

import static UtilsLayer.UtilsClass.click;
import static UtilsLayer.UtilsClass.findElements;
import static UtilsLayer.UtilsClass.sendKeys;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;

	@FindBy(name="phone")
	private WebElement phn;

	@FindBy(name="userName")
	private WebElement uname;

	@FindBy(name="address1")
	private WebElement addres;

	@FindBy(name="city")
	private WebElement city; 

	@FindBy(name="state")
	private List <WebElement> state;

	@FindBy(name="postalCode")
	private WebElement pc;

	@FindBy(name="country")
	private WebElement country;
	
	@FindBy(name="email")
	private WebElement email;

	@FindBy(name="password")
	private WebElement password;

	@FindBy(name="confirmPassword")
	private WebElement cnfmpassword;
    
	@FindBy(name="submit")
	private WebElement sbmtbtn;
      
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
     
	
	public void contactPageFunctionality(String Fname, String Lname, String Ph, String Uname)
			{
		
		sendKeys(fname,Fname);
		sendKeys(lname,Lname);
		sendKeys(phn,Ph);
		sendKeys(uname,Uname);
	}
	
		public void mailingInfo(String Address, String City, String State, String Pc,
				String Country) {
				 
		sendKeys(addres,Address);
		sendKeys(city,City);
		findElements(state,State);
		sendKeys(pc,Pc);
		sendKeys(country,Country);
	}
		
		public void userInfo( String Email,String Pass, String cpassword) {
		sendKeys(email,Email);
		sendKeys(password,Pass);
		sendKeys(cnfmpassword,cpassword);
	}
		
		public void clickonSubmit() {
			
			click(sbmtbtn);
			
		}
}
