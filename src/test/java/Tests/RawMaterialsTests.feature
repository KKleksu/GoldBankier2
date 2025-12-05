Feature: Raw Material tests

  Scenario: Go to homepage by bread crumbs
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on home page bread crumbs
    Then Im on homepage without cookie