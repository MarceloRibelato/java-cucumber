package br.com.frame.funcionalidades;

import br.com.frame.util.reports.Screenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import br.com.frame.pages.AdicionarPage;
import br.com.frame.pages.HomePage;
import br.com.frame.util.BaseTest;
import br.com.frame.util.Randon;

import java.awt.*;
import java.io.IOException;


public class AdicionarContasFuncionalidade extends BaseTest  {
	
	private HomePage home;
	private AdicionarPage adicionar;
    private Screenshot screenCapture;

    public AdicionarContasFuncionalidade() {
        this.screenCapture =  new Screenshot();
        this.home = new HomePage(webDriver);
        this.adicionar = new AdicionarPage(webDriver);
    }

    public void clickAdicionar() throws IOException, AWTException {
		wait.until(ExpectedConditions.elementToBeClickable(this.home.getDropDownContas()));
		this.home.getDropDownContas().click();
		wait.until(ExpectedConditions.visibilityOf(this.home.getContasAdicionar()));
		this.home.getContasAdicionar().click();
		this.screenCapture.takeScreenShoot();
	}
	
	public void adicionarUsuario() throws IOException, AWTException {
		wait.until(ExpectedConditions.visibilityOf(this.adicionar.getTextFild()));
		this.adicionar.getTextFild().sendKeys(Randon.fakeGenerator());
		this.adicionar.getBtnSalvar().click();
        this.screenCapture.takeScreenShoot();


    }
	
	public String obterTextoConfirmacao() throws IOException, AWTException {
		this.adicionar = new AdicionarPage(webDriver); 
		wait.until(ExpectedConditions.visibilityOf(this.adicionar.getMsgConfirmacao()));
        this.screenCapture.takeScreenShoot();
        return this.adicionar.getMsgConfirmacao().getText();
	}

}
