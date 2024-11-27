package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class _2NTechPage {

    public _2NTechPage() throws InstantiationException, IllegalAccessException {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//input[@id='name']")
    public WebElement Ad_Soyad;

    @FindBy(xpath = "//*[@id='birth']")
    public WebElement Dogum_Tarihi;

    @FindBy(xpath = "//input[@id='tcKimlik']")
    public WebElement TCKN;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement Cep_Telefonu;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement Email;

    @FindBy(xpath = "//input[@id='cv_field']")
    public WebElement cv_yukleme;

    @FindBy(xpath = "//button [contains(@class,'py-3 px-4 w-full rounded-md transition-all bg')]")
    public static List<WebElement> EgitimBilgileriList;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SubmitButton;

    @FindBy(xpath = "//div[@class='flex flex-col gap-2 group rounded-lg py-3 px-4 cursor-pointer transition-all bg-[#F5F5F5] hover:bg-[#DF1F29] hover:text-white']")
    public static List<WebElement> Pozisyon;

    @FindBy(xpath = "//div[@class='text-white flex justify-center items-center text-[14px] py-2 px-4 rounded-full bg-[#DF1F29] cursor-pointer']")
    public WebElement GonderButton;

    @FindBy(xpath = "//p[@class='text-[16px] flex justify-start items-start leading-6']")
    public WebElement Pozisyon_Teyit_Text;






}
