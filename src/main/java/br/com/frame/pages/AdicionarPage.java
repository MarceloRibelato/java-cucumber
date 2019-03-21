package br.com.frame.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdicionarPage {

	public AdicionarPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//input[@id='nome']")
	private WebElement textFild;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSalvar;
	
	@FindBy(xpath = "//div[@class='alert alert-success']")
	private WebElement msgConfirmacao;

	public WebElement getTextFild() {
		return textFild;
	}

	public WebElement getBtnSalvar() {
		return btnSalvar;
	}
	
	public WebElement getMsgConfirmacao() {
		return msgConfirmacao;
	}

}
