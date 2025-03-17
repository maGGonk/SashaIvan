package pages;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class SearchResultPage extends BasePage {


    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    private final String FIRST_GOODS = "//a[@title='Фен Xiaomi Compact Hair Dryer H101 (White) EU']";

    private final String FIRST_GOODS_AIR_PODS = "//a[@title='Навушники Apple AirPods 3 with Lightning Charging Case (MPNY3TY/A)']";



    public WebElement firstGoods() {
        return visibilityOfElementByXpath(FIRST_GOODS);
    }

    public WebElement firstGoodsAirPods() {
        return visibilityOfElementByXpath(FIRST_GOODS_AIR_PODS);
    }


    //ACTIONS WITH ELEMENTS

    public String getNameFirstAirPods(){
        return firstGoodsAirPods().getText();
    }
    public void ckickFirstAirPods(){
        firstGoodsAirPods().click();
    }
}
