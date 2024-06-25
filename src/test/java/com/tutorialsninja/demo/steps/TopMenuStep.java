package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.ProductListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuStep {

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("Mouse hover on “Desktops” Tab and click")
    public void mouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverToDesktopTabAndClick();
    }

    @And("call selectMenu method and pass the menu {string}")
    public void callSelectMenuMethodAndPassTheMenu(String menu) {
        new HomePage().selectMenu(menu);
    }

    @Then("Verify the text 'Desktops’")
    public void verifyTheTextDesktops() {
        Assert.assertEquals(new ProductListPage().getProductCategoryText(), "Desktops", "Desktops text is not matched");
    }

    @When("Mouse hover on “Laptops & Notebooks” Tab and click")
    public void mouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNoteBooksAndClick();
    }

    @Then("Verify the text ‘Laptops & Notebooks’")
    public void verifyTheTextLaptopsNotebooks() {
        Assert.assertTrue(new ProductListPage().getProductCategoryText().contains("Laptops & Notebooks"), "Laptops & Notebooks text is not matched");
    }

    @When("Mouse hover on “Components” Tab and click")
    public void mouseHoverOnComponentsTabAndClick() {
        new HomePage().mouseHoverOnComponentsTabAndClick();
    }

    @Then("Verify the text ‘Components’")
    public void verifyTheTextComponents() {
        Assert.assertEquals(new ProductListPage().getProductCategoryText(), "Components", "Components text is not matched");
    }
}
