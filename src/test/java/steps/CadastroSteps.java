package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    String nome = "Selenium";
    String sobrenome = "Webdriver";
    @Quando("^eu preencho o formulário de cadastro$")
    public void euPreenchoOFormulárioDeCadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome(nome);
        cadastroPage.preencheSobrenome(sobrenome);
        cadastroPage.preenchePassword("A$d123abc");
        cadastroPage.selecionaAniversario(03,10,"2023");
        cadastroPage.marcarNewsletter();

        cadastroPage.ClicarRegistrar();
        cadastroPage.clickAddAddressLink();
        cadastroPage.preencheAdress("Rua 123 casa X");
        cadastroPage.preencheCity("Brazilian City");
        cadastroPage.selecionaState("Colorado");
        cadastroPage.preenchePostalCode("12345");
        cadastroPage.preenchePhone("+556133768899");
        cadastroPage.preenchePhoneMobile("+556188987656");
        cadastroPage.preencheAliasAddress("Casa");
    }

    @Quando("^clico em registrar$")
    public void clicoEmRegistrar() {
        cadastroPage.SaveBotton();
    }

    @Então("^vejo cadastro realizado com sucesso$")
    public void vejoAMensagemDeCadastroRealizadoComSucesso() {
        cadastroPage.validaCadastro(nome,sobrenome);

    }
}
