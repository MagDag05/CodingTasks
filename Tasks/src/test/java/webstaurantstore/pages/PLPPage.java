package webstaurantstore.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PLPPage extends BasePage {

    @FindBy (id = "searchval")
    private WebElement navigateSearchField;

    @FindBy (css = "[value='Search']")
    private WebElement searchButton;

    @FindBy (css = "[itemprop='Name']")
    private WebElement resultOfSearch;



    public PLPPage(WebDriver driver) {
        super(driver);
    }

    public void searchField() { WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(navigateSearchField));}

    public void searchForItem() {wait.until(ExpectedConditions.visibilityOf(navigateSearchField)).sendKeys("825CI25MS");  }

    public void clickOnSearchButton() { wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();    }

    public String verifySearchResult() {
       String item = (resultOfSearch).getText();
       return item;        }

}
