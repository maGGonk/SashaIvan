package pages;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingInformationPage extends BasePage {

    public ShippingInformationPage(WebDriver driver) {
        super(driver);
    }

    private final String TITLE = "//h2[@class='sp-page-title sp-h2 page-header']";
    private final String CHECK_OUT_PROCESS = "//button[@id='defaultOpenDesc']";

    public WebElement title() {
        return visibilityOfElementByXpath(TITLE);
    }

    public WebElement checkOutProcess() {
        return visibilityOfElementByXpath(CHECK_OUT_PROCESS);
    }

    public String getTitleText() {
        return title().getText();
    }

    public String getCheckOutProcess() {
        return checkOutProcess().getText();
    }

}
