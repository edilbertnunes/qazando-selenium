package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {
    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");

    public void acessarLelaLogin() {
        getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        Utils.waitElementBePresent(create_email_field,20);
    }
    public void preencherCampoEmail(String randomEmail){
        getDriver().findElement(create_email_field).sendKeys(randomEmail);
    }
    public void clicarCriarContaBotao() {
        getDriver().findElement(create_email_button).click();
    }
}
