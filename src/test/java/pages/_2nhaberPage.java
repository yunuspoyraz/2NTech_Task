package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class _2nhaberPage {

    public _2nhaberPage() throws InstantiationException, IllegalAccessException {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[contains(@class,'sub-menu')]/preceding-sibling::a[contains(@class,'top')]")
    public List<WebElement> navbarList;

    @FindBy(xpath = "//h1")
    public static WebElement title;

    @FindBy(xpath = "//*[@class='e-font-icon-svg e-fas-search']")
    public static WebElement searchButton;

    @FindBy(xpath = "(//input[@type='search'])[1]")
    public static WebElement kesfetArea;

    @FindBy(xpath = "//div[contains(@class,'widget')]/h3/a")
    public List<WebElement> haberList;

    @FindBy(xpath = "//h1[@class='elementor-heading-title elementor-size-default']")
    public WebElement haberTitle;










}

