package pages;

import BasesClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.util.List;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    private final String FIRST_GOODS = "//a[@title='Фен Xiaomi Compact Hair Dryer H101 (White) EU']";
    private final String FIRST_GOODS_AIR_PODS = "//a[@title='Навушники Apple AirPods 3 with Lightning Charging Case (MPNY3TY/A)']";
    private final String VIEW_MODEL_BUTTON = "//button[@class='view-mode__button' and @title='Таблиця']";
    private final String NAMES_SEARCHED_PRODUCTS = "//div[@class='product-card__content']/a[@class='product-card__title']";
    private final String COMMENTS_SAMSUNG = "//span[@class='review-button__text review-button__text--count']";

    public WebElement firstGoods() {
        return visibilityOfElementByXpath(FIRST_GOODS);
    }

    public WebElement firstGoodsAirPods() {
        return visibilityOfElementByXpath(FIRST_GOODS_AIR_PODS);
    }

    public WebElement viewModelButton() {
        return visibilityOfElementByXpath(VIEW_MODEL_BUTTON);
    }

    public List<WebElement> namesSearchProducts() {
        return visibilityOfElementsLocatorByXpath(NAMES_SEARCHED_PRODUCTS);
    }

    public List<WebElement> commentsSamsung(){
        return visibilityOfElementsLocatorByXpath(COMMENTS_SAMSUNG);
    }

    public String getNameFirstAirPods() {
        return firstGoodsAirPods().getText();
    }

    public void clickFirstAirPods() {
        firstGoodsAirPods().click();
    }

    public String getFirsGoodsText() {
        return firstGoods().getText();
    }

    public void viewModelButtonDisplayed() {
        viewModelButton().isDisplayed();
    }

}
