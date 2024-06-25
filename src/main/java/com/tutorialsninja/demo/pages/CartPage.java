package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Utility {
    private static final Logger log = LogManager.getLogger(CartPage.class);

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productNameText;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//button[@data-original-title='Update']")
    WebElement updateTab;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement greenBarNotificationText;

    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[6]")
    WebElement totalPrice;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement checkoutButton;

    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[@class='text-left'][2]")
    WebElement modelName;

    public String getShoppingCartText() {
        log.info("Get Shopping cart text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String getProductNameText() {
        log.info("Get Product Name text" + productNameText.toString());
        return getTextFromElement(productNameText);
    }

    public void clearTextFromQtyField() {
        clearTextFromField(qty);
        log.info("Clear pre-populated text from Quantity field" + qty.toString());
    }

    public void enterTextToQty(String qtyValue) {
        sendTextToElement(qty, qtyValue);
        log.info("Enter value " + qtyValue + "into quantity field" + qty.toString());
    }

    public void clickOnUpdateTab() {
        clickOnElement(updateTab);
        log.info("Click on Update tab" + updateTab.toString());
    }

    public String getGreenBarNotificationText() {
        log.info("Get notification text" + greenBarNotificationText.toString());
        return getTextFromElement(greenBarNotificationText);
    }

    public String getTotalPriceText() {
        log.info("Get Total Price text" + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void clickOnCheckoutButton() {
        log.info("Click on Checkout button" + checkoutButton.toString());
        clickOnElement(checkoutButton);
    }

    public String getModelNameText() {
        log.info("Get Model Name text" + modelName.toString());
        return getTextFromElement(modelName);
    }
}
