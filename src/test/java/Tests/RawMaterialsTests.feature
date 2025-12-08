Feature: Raw Material tests

  Scenario: Go to homepage by bread crumbs
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on home page bread crumbs
    Then Im on homepage without cookie

  Scenario Outline: Change quotes material
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on <RawMaterial> in quotes section
    Then Selected raw material is <RawMaterial>

    Examples:
    |RawMaterial|
    |"Złoto"    |
    |"Miedź"    |
    |"Ropa"     |
    |"Srebro"   |

    Scenario Outline: Change quotes fuel
      Given Im on homepage
      When I click raw materials
      Then Im on raw material page
      When I click fuel price
      And I click on <Fuel> in fuel quotes section
      Then Selected fuel is <Fuel>

      Examples:
      |Fuel|
      |"Euro 95"|
      |"Superplus 98"|
      |"Olej napędowy"|
      |"LPG"          |

      Scenario: Check change quotes on Fuel
        Given Im on homepage
        When I click raw materials
        Then Im on raw material page
        When I click fuel price
        Then Fuel price is visible
