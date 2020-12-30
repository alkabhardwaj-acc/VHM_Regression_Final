package com.vhm.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vhm.qa.constants.Constant;
import com.vhm.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static WebDriverWait webdriver;
	static String exePath=Constant.path+"\\chromedriver.exe";
	static String confPath=Constant.path+"\\config";

	public static void initailization()
	{
		if(Constant.BROWSER_NAME.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",exePath );
			final ChromeOptions co= new ChromeOptions();
			driver=new ChromeDriver(co);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(Constant.APP_URL);
		webdriver = new WebDriverWait(driver,100);
	}

}
