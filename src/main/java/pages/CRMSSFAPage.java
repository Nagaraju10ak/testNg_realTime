package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CRMSSFAPage extends ProjectMethods{
	
	public CRMSSFAPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement eleLogOut;
	
	public LoginPage clickOnLogOut()
	{
		click(eleLogOut);
		return new LoginPage();
	}
}
