package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.addcuspages.org.AddCusPOM;
import com.commonactions.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddCustomer extends CommonActions {

	AddCusPOM ac=new AddCusPOM();

    @Given("User clicks on add customer")
	public void user_clicks_on_add_customer() throws Exception {
		handleFrame();
	  clickk(ac.getAddCus());
	   }

	@When("User fills all the details")
	public void user_fills_all_the_details() throws Exception {
       handleFrame();
       clickk(ac.getRadiobutton());
       fill(ac.getFname(),"Harun");
       fill(ac.getLname(),"Rasheed");
       fill(ac.getEmail(),"hahashbash@mail.com");
       fill(ac.getAddress(),"chennai");
      fill(ac.getMobile(),"9090930903");
     
	}

	@When("user clicks on submit")
	public void user_clicks_on_submit() {
		
		 clickk(ac.getSubmit());
	}

	@Then("User validates the user id")
	public void user_validates_the_user_id() throws Exception {
	    handleFrame();
	    Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	    String text = driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
	    System.out.println(text);

	}
	public void handleFrame() throws Exception {
		Thread.sleep(5000);
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().defaultContent();
		
	}


}
