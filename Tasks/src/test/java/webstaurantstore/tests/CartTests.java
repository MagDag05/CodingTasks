package webstaurantstore.tests;
import webstaurantstore.pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest{
//
//    @BeforeClass
//    private CartPage initSetUp() {
//        CartPage cartPage = new CartPage(driver);
//        return cartPage;
//    }


    @Test(description = " Shoping cart functionality")
    public void cartFunctionality()throws NullPointerException {
        CartPage cartPage = new CartPage(driver);
        cartPage.openPage();
        cartPage.addToCart();
        cartPage.clickOnCartButton();
        cartPage.verifyItemInCart();
        Assert.assertTrue(cartPage.verifyItemInCart()); }

        @Test (description = "Verify shoping cart is empty")

       public void verifyCartIsEmpty() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickEmptyCart();
        Assert.assertEquals(cartPage.verifyCartIsEmpty(), "Are you sure you want to empty your cart?");
        cartPage.clickEmptyCartButtonConfirmation();
        }

    }


