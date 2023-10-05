package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;
import support.Utils;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();
    @Dado("^que estou na tela de login$")
    public void queEstouNaTelaDeLogin()  {
        getDriver(Browser.CHROME);
        loginPage.acessarLelaLogin();
    }

    @Dado("^acesso o cadastro de usuario$")
    public void acessoOCadastroDeUsuario()  {
        loginPage.preencherCampoEmail(Utils.getRandomEmail());
        loginPage.clicarCriarContaBotao();
    }
}
