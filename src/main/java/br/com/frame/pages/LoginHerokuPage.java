package br.com.frame.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHerokuPage {
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='senha']")
	private WebElement senha;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement btnEntrar;

	
	public LoginHerokuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getSenha() {
		return senha;
	}

	public WebElement getBtnEntrar() {
		return btnEntrar;
	}

}
