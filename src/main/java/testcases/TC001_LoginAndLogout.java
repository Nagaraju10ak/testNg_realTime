package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login and logout in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Nagaraju";
		browserName="chrome";
		dataSheetName="TC001";
		//Test
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwdme,String vName) {
		
		new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwdme)
			.clickOnLoginButton()
			.clickOnLogOut();
					
	}

}
