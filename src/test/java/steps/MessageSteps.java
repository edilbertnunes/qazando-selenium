package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.MessagePage;
import runner.RunCucumberTest;

public class MessageSteps extends RunCucumberTest {

    String mensagem = "Your message has been successfully sent to our team.";

    MessagePage messagePage = new MessagePage();

    @Dado("^que estou na tela de mensagem$")
    public void queEstouNaTelaDeMensagem() {
        messagePage.acessarMessage();

    }

    @Dado("^preencho todos os campos$")
    public void preenchoTodosOsCampos()  {
        messagePage.selecionaAssunto("Webmaster");
        messagePage.preencheMessagem("Minha mensagem com dúvida");
        messagePage.uploadFile("image.png");

    }

    @Quando("^clico em enviar mensagem$")
    public void clicoEmEnviarMensagem()  {
        messagePage.clickSend();

    }

    @Então("^vejo feedback de mensagem enviada com sucesso$")
    public void vejoFeedbackDeMensagemEnviadaComSucesso()  {
        messagePage.validaMensagemEnvio(mensagem);




    }
}
