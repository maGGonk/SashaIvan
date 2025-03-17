package tests;

import BasesClass.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoodsPage;
import pages.HomePage;
import pages.SearchResultPage;
import pages.ShippingInformationPage;

import static java.lang.Thread.sleep;


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

        openUrl(alloUrl);

        Assert.assertTrue(homePage.searchField().isDisplayed());

        homePage.searchField().sendKeys("Фен");
        homePage.searchButton().click();

        Assert.assertTrue(searchResultPage.firstGoods().getText().contains("Фен"));
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
        Assert.assertTrue(expectedNameFirstAirPods.contains("AirPods 3"));
        searchResultPage.ckickFirstAirPods();

        String actualNameAirPods = goodsPage.getNameProductTitle();


        Assert.assertEquals(actualNameAirPods, expectedNameFirstAirPods);


    }

    @Test
    public void checkPageDeliveryAndPayDisplay() {

        HomePage homePage = new HomePage(driver);
        ShippingInformationPage shippingInformationPage = new ShippingInformationPage(driver);

        openUrl(alloUrl);

        homePage.clientsButtonDisplayed();
        homePage.clickClientsButton();
        homePage.dropDownMenuDisplayed();
        homePage.deliveryPaymentButtonDisplayed();
        homePage.clickDeliveryPaymentButton();

        String nameTitleText = shippingInformationPage.getTitle();
        Assert.assertTrue(nameTitleText.contains("Доставка і оплата"));
        System.out.println("Доставка і оплата");

        String nameCheckOutProcessText = shippingInformationPage.getCheckOutProcess();
        Assert.assertTrue(nameCheckOutProcessText.contains("Як оформити замовлення?"));
        System.out.println("Як оформити замовлення?");


    }

}
