package com.webPages;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {

	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
	public WebElement Login;
	@FindBy(xpath = "(//h4[@class='link-external'])[1]")
	public WebElement MemberPortal;
	@FindBy(xpath = "(//a[text()='Register'])[2]")
	public WebElement Register;
	@FindBy(id = "imgSelfReg")
	public WebElement MyselfRegister;
	@FindBy(xpath = "//input[@id='SelfRegMemberID']")
	public WebElement MemberId;
	@FindBy(xpath = "//input[@id='RegistrantFirstName']")
	public WebElement FirstName;
	@FindBy(xpath = "//input[@id='RegistrantLastName']")
	public WebElement LastName;
	@FindBy(xpath = "//input[@id='SelfRegDOB']")
	public WebElement DOB;
	@FindBy(xpath = "//input[@id='RegistrantSSN']")
	public WebElement Ssn;

	public LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login() {
		Login.click();
	}

	public void memberPortal() {
		MemberPortal.click();
	}

	public void registerButton(WebDriver driver) {
	Set<String> windows=driver.getWindowHandles();
	 Iterator<String> itr=windows.iterator();
      String  mainwindow=itr.next();
	  String childwindow=itr.next();
	  driver.switchTo().window(childwindow);
	  Register.click();

	}

	public void myselfRegisterButton() {
		
		MyselfRegister.click();
	}

	public void memberIdField() {
		MemberId.sendKeys("420");
	}

	public void firstName() {
		FirstName.sendKeys("Shakir");
	}

	public void lastName() {
		LastName.sendKeys("Hussain");

	}

	public void dob() {
		DOB.sendKeys("05071992");
	}

	public void ssn() {
		Ssn.sendKeys("12345667");

	}
	public void webTitle(WebDriver driver) {
		System.out.println("hometitle: "+driver.getTitle());
	}
}
