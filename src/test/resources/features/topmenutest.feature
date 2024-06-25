
Feature: TopMenu Test Feature

  @author_JigarPatel @sanity @smoke @regression
  Scenario: verify User Should Navigate To Desktops Page Successfully
    Given I am on homepage
    When Mouse hover on “Desktops” Tab and click
    And call selectMenu method and pass the menu "Show AllDesktops"
    Then Verify the text 'Desktops’

  @author_JigarPatel @sanity @regression
  Scenario: verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
    Given I am on homepage
    When Mouse hover on “Laptops & Notebooks” Tab and click
    And call selectMenu method and pass the menu "Show AllLaptops & Notebooks"
    Then Verify the text ‘Laptops & Notebooks’

  @author_JigarPatel @regression
  Scenario: verifyUserShouldNavigateToComponentsPageSuccessfully
    Given I am on homepage
    When Mouse hover on “Components” Tab and click
    And call selectMenu method and pass the menu "Show AllComponents"
    Then Verify the text ‘Components’
