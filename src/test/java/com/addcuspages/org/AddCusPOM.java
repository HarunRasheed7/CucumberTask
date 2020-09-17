package com.addcuspages.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonactions.CommonActions;

public class AddCusPOM extends CommonActions {
	public AddCusPOM() {
		PageFactory.initElements(driver,this);
	}
		
	 @FindBy(xpath="(//a[text()='Add Customer'])[1]")
	 private WebElement AddCus;
	 
	 @FindBy(xpath="//label[@for='done']")
	 private WebElement Radiobutton;
	 
	 @FindBy(id="fname")
	 private WebElement fname;
	 public WebElement getAddCus() {
		return AddCus;
	}
	public WebElement getRadiobutton() {
		return Radiobutton;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id="lname")
	 private WebElement lname;
	 @FindBy(id="email")
	 private WebElement email;
	 @FindBy(name="addr")
	 private WebElement address;
	 @FindBy(id="telephoneno")
	 private WebElement mobile;
	 @FindBy(name="submit")
	 private WebElement submit;
	 
	 
	 
	 
	 
	 
	

}
