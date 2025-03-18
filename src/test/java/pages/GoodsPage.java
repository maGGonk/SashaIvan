package pages;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoodsPage extends BasePage {

    public GoodsPage(WebDriver driver) {
        super(driver);
    }

    private final String PRODUCT_TITLE = "//h1[@class='p-view__header-title']";

    public WebElement productTitle() {
        return visibilityOfElementByXpath(PRODUCT_TITLE);
    }

    public String getNameProductTitle() {
        return productTitle().getText();
    }

}
