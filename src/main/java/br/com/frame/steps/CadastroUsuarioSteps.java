package br.com.frame.steps;

import br.com.frame.funcionalidades.AdicionarContasFuncionalidade;
import br.com.frame.funcionalidades.LoginFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import java.awt.*;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CadastroUsuarioSteps {

    private LoginFuncionalidade login;
    private AdicionarContasFuncionalidade addContas;


    public CadastroUsuarioSteps() {
        this.login = new LoginFuncionalidade();
        this.addContas = new AdicionarContasFuncionalidade();
    }

    @Dado("^que estou logado com usuario \"([^\"]*)\"$")
    public void que_estou_logado_com_usuario(String user) {
        this.login.LoginSrBarriga(user);
    }

    @Dado("^clico em adicionar um novo usuario$")
    public void clico_em_adicionar_um_novo_usuario() throws InterruptedException, IOException, AWTException {
        this.addContas.clickAdicionar();
    }

    @Quando("^adiciono o novo usuario")
    public void adicionoONovoUsuario() throws InterruptedException, IOException, AWTException {
        this.addContas.adicionarUsuario();
    }

    @Entao("^apresanta a mensagem \"([^\"]*)\"$")
    public void apresanta_a_mensagem(String msg) throws InterruptedException, IOException, AWTException {
        assertEquals(msg, this.addContas.obterTextoConfirmacao());
    }
}
