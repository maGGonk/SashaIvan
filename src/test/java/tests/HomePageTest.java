package tests;

import BasesClass.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoodsPage;
import pages.HomePage;
import pages.SearchResultPage;
import pages.ShippingInformationPage;

public class HomePageTest extends TestInit {

    public String alloUrl = "https://allo.ua";

    @Test
    public void checkAlloButtonDisplay() {

        HomePage homePage = new HomePage(driver);

        openUrl(alloUrl);

        Assert.assertTrue(homePage.alloLogo().isDisplayed());
    }

    @Test
    public void checkFenDisplay() {

        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);

        String nameFirstSearchGoods = "Фен";

        openUrl(alloUrl);

        Assert.assertTrue(homePage.searchField().isDisplayed());

        homePage.enterValuesInSearchField(nameFirstSearchGoods);
        homePage.clickSearchButton();

        Assert.assertTrue(searchResultPage.getFirsGoodsText().contains(nameFirstSearchGoods));
    }

    @Test
    public void checkAirPodsDisplay() {

        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        GoodsPage goodsPage = new GoodsPage(driver);

        String airPods = "AirPods 3";

        openUrl(alloUrl);

        homePage.alloLogoDisplayed();
        homePage.enterValuesInSearchField(airPods);
        homePage.clickSearchButton();

        String expectedNameFirstAirPods = searchResultPage.getNameFirstAirPods();
        Assert.assertTrue(expectedNameFirstAirPods.contains(airPods));
        searchResultPage.clickFirstAirPods();

        String actualNameAirPods = goodsPage.getNameProductTitle();

        Assert.assertEquals(actualNameAirPods, expectedNameFirstAirPods);
    }

    @Test
    public void checkPageDeliveryAndPayDisplay() {

        HomePage homePage = new HomePage(driver);
        ShippingInformationPage shippingInformationPage = new ShippingInformationPage(driver);

        String nameTitleText = "Доставка і оплата";
        String nameCheckOutProcessText = "Як оформити замовлення?";

        openUrl(alloUrl);

        homePage.clientsButtonDisplayed();
        homePage.clickClientsButton();
        homePage.dropDownMenuDisplayed();
        homePage.deliveryPaymentButtonDisplayed();
        homePage.clickDeliveryPaymentButton();

        Assert.assertTrue(shippingInformationPage.getTitleText().contains(nameTitleText));

        Assert.assertTrue(shippingInformationPage.getCheckOutProcess().contains(nameCheckOutProcessText));
    }

    @Test
    public void checkResultSearchField() {

        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);

        String samsungTV = "Телевізор Samsung";
        String expectedNameTV = "Samsung";
        int expectedSizeProducts = 28;

        openUrl(alloUrl);

        homePage.enterValuesInSearchField(samsungTV);
        homePage.clickSearchButton();

        searchResultPage.viewModelButtonDisplayed();
        int sizeProducts = searchResultPage.namesSearchProducts().size();
        Assert.assertEquals(sizeProducts, expectedSizeProducts);

        for (WebElement element : searchResultPage.namesSearchProducts()) {
            Assert.assertTrue(element.getText().contains(expectedNameTV));
        }

    }

    @Test
    public void checkResultComments() {

        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);

        String samsungTV = "Телевізор Samsung";

        openUrl(alloUrl);

        homePage.enterValuesInSearchField(samsungTV);
        homePage.clickSearchButton();

        for (WebElement element : searchResultPage.commentsSamsung()) {
            String numberComments = element.getText();
            int number = Integer.parseInt(numberComments);
            if (number > 27) {
                System.out.println(number);
            }

        }
    }
}


