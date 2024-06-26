package com.e2eTests.automation.step_definitions;

 

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.When;

public class LoginOutlineStepDefinition {
	
	public LoginPage loginPage;
	public SeleniumUtils seleniumUtils; 
	
	public LoginOutlineStepDefinition() {
		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
	}

	@When("Je saisie une adresse mail {string}")
	public void jeSaisieAdresseMail(String email) {
		seleniumUtils.writeText(LoginPage.getEmail(), email);
	}
	
	@When("Je saisie un mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		seleniumUtils.writeText(LoginPage.getPassword(), password);
	}
}
