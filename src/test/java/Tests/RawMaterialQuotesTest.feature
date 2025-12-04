Feature: Raw Material Quotes


  Scenario: Check on Raw Material quotes page
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on Quotes
    Then Im on raw material quotes page

    Scenario Outline: Change filters on most important raw material table
      Given Im on homepage
      When I click raw materials
      Then Im on raw material page
      When I click on Quotes
      Then Im on raw material quotes page
      When I click on <Filter> in most important raw materials table
      Then Im on raw material quotes page
      Examples:
      |Filter|
      |"RawMaterialAsc"|
      |"RawMaterialDesc"|
      |"StockPriceAsc"|
      |"StockPriceDesc"|
      |"PercentChangeAsc"|
      |"PercentChangeDesc"|
      |"ChangeAsc"        |
      |"ChangeDesc"       |
      |"OpenAsc"          |
      |"OpenDesc"         |
      |"MaxAsc"           |
      |"MaxDesc"          |
      |"MinAsc"           |
      |"MinDesc"          |
      |"TimeAsc"          |
      |"TimeDesc"         |
      |"UnitAsc"          |
      |"UnitDesc"         |

  Scenario Outline: Change filters on all raw materials table
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on Quotes
    Then Im on raw material quotes page
    When I click on <Filter> in all raw materials table
    Then Im on raw material quotes page
    Examples:
      |Filter|
      |"RawMaterialAsc"|
      |"RawMaterialDesc"|
      |"StockPriceAsc"|
      |"StockPriceDesc"|
      |"PercentChangeAsc"|
      |"PercentChangeDesc"|
      |"ChangeAsc"        |
      |"ChangeDesc"       |
      |"OpenAsc"          |
      |"OpenDesc"         |
      |"MaxAsc"           |
      |"MaxDesc"          |
      |"MinAsc"           |
      |"MinDesc"          |
      |"TimeAsc"          |
      |"TimeDesc"         |
      |"UnitAsc"          |
      |"UnitDesc"         |

    Scenario: Change last stock update
      Given Im on homepage
      When I click raw materials
      Then Im on raw material page
      When I click on Quotes
      Then Im on raw material quotes page
      When I change date of stocks on 3.12.2025
      Then Date is changed on 3.12.2025