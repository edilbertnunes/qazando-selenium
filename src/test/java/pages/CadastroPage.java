package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

import javax.rmi.CORBA.Util;

public class CadastroPage extends RunCucumberTest {
    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By firstNameField = By.id("customer_firstname");
    private By lastNameField = By.id("customer_lastname");
    private By passwordField = By.id("passwd");

    private By select_day_field = By.id("days");
    private By select_months_field = By.id("months");
    private By select_years_field = By.id("years");

    private By submitAccount = By.id("submitAccount");
    private By newsletter = By.id("uniform-newsletter");
    private By linkEndereco = By.cssSelector("a[title='Add my first address']");

    private By address_field = By.id("address1");
    private By city_field = By.id("city");
    private By state_field = By.id("id_state");
    private By postcode_field = By.id("postcode");
    private By phone_field = By.id("phone");
    private By phone_mobile_field = By.id("phone_mobile");
    private By save_button = By.id("submitAddress");
    private By alias_field = By.id("alias");


    public void selectTitle(Integer type) {
        Utils.waitElementBePresent(titleM, 20);
        if (type == 1) {
            getDriver().findElement(titleM).click();
        } else if (type == 2) {
            getDriver().findElement(titleF).click();
        }
    }

    public void preencheNome(String nome) {
        getDriver().findElement(firstNameField).sendKeys(nome);
    }

    public void preencheSobrenome(String sobrenome) {
        getDriver().findElement(lastNameField).sendKeys(sobrenome);
    }

    public void preenchePassword(String pass) {
        getDriver().findElement(passwordField).sendKeys(pass);
    }

    public void selecionaAniversario(Integer day, Integer months, String year) {
        Select select_day = new Select(getDriver().findElement(select_day_field));
        select_day.selectByIndex(day);

        Select select_month = new Select(getDriver().findElement(select_months_field));
        select_month.selectByIndex(months);

        Select select_year = new Select(getDriver().findElement(select_years_field));
        select_year.selectByValue(year);
    }
    public void marcarNewsletter() {
        WebElement checkbox = getDriver().findElement(newsletter);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void ClicarRegistrar() {
        getDriver().findElement(submitAccount).click();
    }

    public void clickAddAddressLink() {
        getDriver().findElement(linkEndereco).click();
    }

    public void preencheAdress(String address) {
        getDriver().findElement(address_field).sendKeys(address);
    }
    public void preencheCity(String city) {
        getDriver().findElement(city_field).sendKeys(city);
    }
    public void selecionaState(String state) {
        Select select_state = new Select(getDriver().findElement(state_field));
        select_state.selectByVisibleText(state);
    }
    public void preenchePostalCode(String postalCode) {
        getDriver().findElement(postcode_field).sendKeys(postalCode);
    }

    public void preenchePhone(String phone) {
        getDriver().findElement(phone_field).sendKeys(phone);
    }
    public void preenchePhoneMobile(String phoneMobile) {
        getDriver().findElement(phone_mobile_field).sendKeys(phoneMobile);
    }
    public void preencheAliasAddress(String titleAddress) {
        getDriver().findElement(alias_field).clear();
        getDriver().findElement(alias_field).sendKeys(titleAddress);
    }

    public void SaveBotton() {
        getDriver().findElement(save_button).click();
    }

    public void validaCadastro(String nome, String sobrenome) {
        Utils.waitElementBePresent(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"),20);
        String resultado_atual = getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(nome+" "+sobrenome,resultado_atual);
    }

}
