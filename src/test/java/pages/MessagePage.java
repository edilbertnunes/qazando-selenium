package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

import java.io.File;

public class MessagePage extends RunCucumberTest {
    public void acessarMessage() {
        getDriver().get("http://www.automationpractice.pl/index.php?controller=contact");
        Utils.waitElementBePresent(message_field,20);

    }
    private By subject_field = By.id("id_contact");

    private By message_field = By.id("message");
    private By upload_field = By.id("fileUpload");
    private By submitMessage_field = By.id("submitMessage");
    private By messageSend = By.cssSelector("//*[@id=\"center_column\"]/p");


    public void selecionaAssunto(String assunto) {
        Select select_state = new Select(getDriver().findElement(subject_field));
        select_state.selectByVisibleText(assunto);
    }
    public void preencheMessagem(String menssage){
        getDriver().findElement(message_field).sendKeys(menssage);
    }

    public void uploadFile(String fileName) {
        String projectRoot = System.getProperty("user.dir");
        String filePath = projectRoot + "/src/images/" + fileName;
        getDriver().findElement(upload_field).sendKeys(filePath);
    }


    public void clickSend() {
        getDriver().findElement(submitMessage_field).click();
    }

    public void messageSend() {
        getDriver().findElement(messageSend).click();
    }


    public void validaMensagemEnvio(String mensagem) {
        Utils.waitElementBePresent(By.xpath("//*[@id=\"center_column\"]/p"),20);
        String resultado_atual = getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
        Assert.assertEquals(mensagem,resultado_atual);
    }

}
