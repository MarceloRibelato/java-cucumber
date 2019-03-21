package br.com.frame.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private WebElement dropDownContas;
	
	@FindBy(xpath = "//a[contains(text(),'Adicionar')]")
	private WebElement contasAdicionar;
	
	@FindBy(xpath = "//a[contains(text(),'Listar')]")
	private WebElement contasListar;
	
	@FindBy(xpath = "//a[contains(text(),'Criar Movimentação')]")
	private WebElement criarMovimentacao;
	
	@FindBy(xpath = "//a[contains(text(),'Resumo Mensal')]")
	private WebElement resumoMensal;
	
	
	public HomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}


	public WebElement getDropDownContas() {
		return dropDownContas;
	}


	public WebElement getContasAdicionar() {
		return contasAdicionar;
	}


	public WebElement getContasListar() {
		return contasListar;
	}


	public WebElement getCriarMovimentacao() {
		return criarMovimentacao;
	}


	public WebElement getResumoMensal() {
		return resumoMensal;
	}
	
	

}
