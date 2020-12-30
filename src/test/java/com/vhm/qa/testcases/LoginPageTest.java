package com.vhm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vhm.qa.base.TestBase;
import com.vhm.qa.constants.Constant;
import com.vhm.qa.pages.DashboardPage;
import com.vhm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	DashboardPage dashboardpage;


	@BeforeMethod
	public void setUp() {
		initailization();
		loginpage =new LoginPage();
	}

	@Test(priority=1)
	public void loginPageTitleTest() {
		final String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "工事管理システム | ログイン");
	}


	@Test(priority=2)
	public void loginTest() {
		dashboardpage=loginpage.login(Constant.USERNAME, Constant.PASSWORD);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
