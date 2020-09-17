package com.commonactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonActions {
    public static WebDriver driver;
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace-new\\Test\\driver\\chromedriver84.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/telecom/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public static void fill(WebElement e,String s) {
		e.sendKeys(s);
	}
	public static void clickk(WebElement e) {
		e.click();
	}
	
}
