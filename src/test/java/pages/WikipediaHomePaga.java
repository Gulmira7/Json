package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikipediaHomePaga {

    public WikipediaHomePaga() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement searchButton;

    @FindBy(id = "firstHeading")
    public WebElement mainHeader;

    @FindBy(className = "fn")
    public  WebElement imageHeader;


}