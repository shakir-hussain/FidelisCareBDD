package com.stepDefination;

import com.webPages.LogIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	LogIn shakir=new LogIn(BaseClass.driver);

	@Given("user is on fidelis care homepage")
	public void user_is_on_fidelis_care_homepage() {
      shakir.webTitle(BaseClass.driver);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
      shakir.login();
	}

	@When("click on member online portal")
	public void click_on_member_online_portal() {
     shakir.memberPortal();
	}

	@When("click on register")
	public void click_on_register() {
      shakir.registerButton(BaseClass.driver);
	}

	@When("click on register myself")
	public void click_on_register_myself() {
       shakir.myselfRegisterButton();
	}

	@When("enter member id")
	public void enter_member_id() {
       shakir.memberIdField();
	}

	@When("enter firstname")
	public void enter_firstname() {
      shakir.firstName();
	}

	@When("enter lastname")
	public void enter_lastname() {
      shakir.lastName();
	}

	@When("enter dob")
	public void enter_dob() {
       shakir.dob();
	}

	@When("enter ssn")
	public void enter_ssn() {
       shakir.ssn();
	}

	@Then("displays valid title")
	public void displays_valid_title() {
     shakir.webTitle(BaseClass.driver);
	}

}
