package com.vhm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vhm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory =OR:
	@FindBy(id="username")
	WebElement username;

	@FindBy(id="pwd")
	WebElement password;

	@FindBy(xpath ="//button[contains(text(),'ログイン')]")
	WebElement loginBtn;
	//button[contains(text(),'LOGIN')]
	//button[contains(text(),'LOGIN')]

	@FindBy(xpath ="//img[contains(@class ='img-responsive')]")
	WebElement vhmlogo;

	//Initializing the page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateVHMlogo() {
		return vhmlogo.isDisplayed();
	}

	public DashboardPage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new DashboardPage();
	}
}
