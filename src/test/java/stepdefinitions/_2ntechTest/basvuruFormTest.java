package stepdefinitions._2ntechTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages._2NTechPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.*;

import static utilities.Driver.driver;
import static utilities.ReusableMethods.clickWithJS;

public class basvuruFormTest {

    _2NTechPage hr2ntechPage = new _2NTechPage();

    public basvuruFormTest() throws InstantiationException, IllegalAccessException {
    }

    @Given("2ntech websitesine git")
    public void ntech_websitesine_git() throws InstantiationException, IllegalAccessException {

        Driver.getDriver().get(ConfigReader.getProperty("2ntech_hr_url"));

    }
    @When("ad soyad {string} gir")
    public void ad_soyad_gir(String string) {

        hr2ntechPage.Ad_Soyad.sendKeys(string);

    }
    @When("dogum tarihi {string} gir")
    public void dogum_tarihi_gir(String string) {

        hr2ntechPage.Dogum_Tarihi.sendKeys(string);

    }
    @When("TCKN {string} gir")
    public void tckn_gir(String string) {

        hr2ntechPage.TCKN.sendKeys(string);

    }

    @When("cep telefonu {string} gir")
    public void cep_telefonu_gir(String string) {

        hr2ntechPage.Cep_Telefonu.sendKeys(string);

    }
    @When("mail adresi {string} gir")
    public void mail_adresi_gir(String string) {

        hr2ntechPage.Email.sendKeys(string);

    }

    @When("CV yukle")
    public void cv_yukle() throws AWTException, InterruptedException {


        hr2ntechPage.cv_yukleme.sendKeys("/Users/yunuspoyraz/Desktop/Yunus Poyraz Resume.pdf");

    }

    @When("Egitim bilgisi {string} sec")
    public void egitim_bilgisi_sec(String string) throws InstantiationException, IllegalAccessException {

        int sayi = Integer.parseInt(string);

        clickWithJS(_2NTechPage.EgitimBilgileriList.get(sayi-1));

    }

    @When("Submit butonuna tıkla")
    public void submit_butonuna_tıkla() {

        hr2ntechPage.SubmitButton.click();

    }

    @When("Pozisyon {string} sec")
    public void pozisyon_sec(String string) throws InstantiationException, IllegalAccessException {

        int sayi2 = Integer.parseInt(string);
        clickWithJS(_2NTechPage.Pozisyon.get(sayi2-1));

    }

    @Then("Gonder butonuna bas")
    public void gonder_butonuna_bas() {

        hr2ntechPage.GonderButton.click();


    }
    @Then("Pozisyon basvurusunu teyit et")
    public void pozisyon_basvurusunu_teyit_et() {


        Assert.assertEquals("Form Başarı ile gönderildi. Katıldığınız için teşekkür ederiz.", hr2ntechPage.Pozisyon_Teyit_Text.getText());

    }







}
