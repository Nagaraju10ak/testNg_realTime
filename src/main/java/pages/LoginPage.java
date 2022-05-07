package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;


import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	

	
	@FindBy(id = "username")
	private WebElement eleUserName;
	
	@FindBy(id = "password")
	private WebElement elePassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement eleClick;
	
	public LoginPage enterUserName(String data) {
		type(eleUserName, data);
		return this;
	}
	
	
	public LoginPage enterPassword(String data)
	{
		type(elePassword, data);
		return this;
	}
	
	public CRMSSFAPage clickOnLoginButton()
	{
		
		click(eleClick);
		return new CRMSSFAPage();
	}
	
}
