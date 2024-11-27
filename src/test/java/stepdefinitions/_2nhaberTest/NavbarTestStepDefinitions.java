package stepdefinitions._2nhaberTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages._2nhaberPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class NavbarTestStepDefinitions {

    _2nhaberPage haberHomePage = new _2nhaberPage();

    public NavbarTestStepDefinitions() throws InstantiationException, IllegalAccessException {
    }

    @Given("2nhaber websitesine git")
    public void n_haber_websitesine_git() throws InstantiationException, IllegalAccessException {

        Driver.getDriver().get(ConfigReader.getProperty("2nhaber_url"));
    }


    @When("navbar menu tiklanabilir oldugunu kontrol et ve dogrula")
    public void navbar_menu_tiklanabilir_oldugunu_kontrol_et_ve_dogrula() throws InstantiationException, IllegalAccessException {

        for (int i = 1; i <= haberHomePage.navbarList.size(); i++) {
            WebElement element = Driver.getDriver().findElement(By.xpath("(//ul[contains(@class,'sub-menu')]/preceding-sibling::a[contains(@class,'top')])[" + i + "]"));
            String elementText = element.getText().toUpperCase();
            waitForClickablility(element,5);
            element.click();
            waitForVisibility(_2nhaberPage.title,5);
            Assert.assertEquals(elementText, _2nhaberPage.title.getText().toUpperCase());
        }

    }

}






