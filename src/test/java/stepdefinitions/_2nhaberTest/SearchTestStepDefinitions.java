package stepdefinitions._2nhaberTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages._2nhaberPage;

import static utilities.ReusableMethods.*;


public class SearchTestStepDefinitions {

    _2nhaberPage haberHomePage = new _2nhaberPage();

    public SearchTestStepDefinitions() throws InstantiationException, IllegalAccessException {
    }


    @When("search butonuna tikla")
    public void search_butonuna_tikla() throws InstantiationException, IllegalAccessException {

        _2nhaberPage.searchButton.click();

    }
    @Then("{string} için arama yap")
    public void icin_arama_yap(String string) {

        _2nhaberPage.kesfetArea.sendKeys(string+ Keys.ENTER);

    }

    @And("{string} inci habere git ve teyit et.")
    public void inci_habere_git_ve_teyit_et(String string) throws InstantiationException, IllegalAccessException {

        int sayi = Integer.parseInt(string);

        String haberText = haberHomePage.haberList.get(sayi-1).getText();
        clickWithJS(haberHomePage.haberList.get(sayi-1));
        Assert.assertEquals(haberText, haberHomePage.haberTitle.getText());

    }


}
