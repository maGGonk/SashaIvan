package pages;

import BasesClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final String ALLO_LOGO = "//a[@class='v-logo']";
    private final String SEARCH_FIELD = "//input[@id='search-form__input']";
    private final String SEARCH_BUTTON = "//button[@class='search-form__submit-button']";
    private final String CLIENTS_BUTTON = "//a[@class='mh-button mh-button--open']";
    private final String DROP_DOWN_MENU = "//div[@class='mh-button__dropdown']";
    private final String DILIVERI_PAYMENT_BUTTON = "//a[@href='https://allo.ua/ua/help/shipment_payment/']";

    public WebElement alloLogo() {
        return visibilityOfElementByXpath(ALLO_LOGO);

    }

    public WebElement searchField() {
        return visibilityOfElementByXpath(SEARCH_FIELD);
    }

    public WebElement searchButton() {
        return visibilityOfElementByXpath(SEARCH_BUTTON);
    }

    public WebElement clientsButton() {
        return visibilityOfElementByXpath(CLIENTS_BUTTON);
    }

    public WebElement dropDownMenu() {
        return visibilityOfElementByXpath(DROP_DOWN_MENU);
    }

    public WebElement deliveryPaymentButton() {
        return visibilityOfElementByXpath(DILIVERI_PAYMENT_BUTTON);
    }

    public void alloLogoDisplayed() {
        alloLogo().isDisplayed();
    }

    public void enterValuesInSearchField(String velue) {
        searchField().sendKeys(velue);
    }

    public void clickSearchButton() {
        searchButton().click();
    }

    public void clientsButtonDisplayed() {
        clientsButton().isDisplayed();
    }

    public void clickClientsButton() {
        clientsButton().click();
    }

    public void dropDownMenuDisplayed() {
        dropDownMenu().isDisplayed();
    }

    public void deliveryPaymentButtonDisplayed() {
        deliveryPaymentButton().isDisplayed();
    }

    public void clickDeliveryPaymentButton() {
        deliveryPaymentButton().click();
    }

}
