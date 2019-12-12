package webstaurantstore.tests;

import org.openqa.selenium.WebElement;
import webstaurantstore.pages.PLPPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PLPTests extends BaseTest {


//
//    @BeforeMethod
//    private PLPPage initSetUp() {
//        PLPPage plpPage = new PLPPage(driver);
//        return plpPage;
//    }

  @Test(description = "Search on PLP page")
    public void PlpPage() {
      PLPPage plpPage = new PLPPage(driver);
      plpPage.searchField();
      plpPage.searchForItem();
      plpPage.clickOnSearchButton();
      plpPage.verifySearchResult();
      Assert.assertEquals(plpPage.verifySearchResult(), "Valor 25 oz. Pre-Seasoned Mini Cast Iron Round Casserole Dish - 12/Case");


  }
}
