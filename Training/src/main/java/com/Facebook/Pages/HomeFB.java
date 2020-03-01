package com.Facebook.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeFB 
{
	WebDriver driver;
	// locate those objects first
	@FindBy (id="email")    //email field
	WebElement emailData;   //global variable WebElement to store email data
	@FindBy (id="pass")     //password field
	WebElement passwData;   //var store password data
	@FindBy (id="u_0_b")
	WebElement LogInBtn;    //Log In button - you click it
	
	public HomeFB(WebDriver driver) {    //interface 
		this.driver=driver;   
		PageFactory.initElements(driver, this); }//PageFactory class makes using Page Objects simple
	//create methods:
	public void EnterEmail (String em) {
		emailData.sendKeys(em);
	}
	public void EnterPass (String psw) {
		passwData.sendKeys(psw);
	}
	public void HereYouGo() {
		LogInBtn.click();
	}
	public void clrEmail() {
		emailData.clear();
	}
	public void clrPass() {
		passwData.clear();
	}
}
