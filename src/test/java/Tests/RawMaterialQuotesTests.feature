Feature: Raw Material Quotes


  Scenario: Check on Raw Material quotes page
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on Quotes
    Then Im on raw material quotes page

  Scenario Outline: Change filters on most important raw material table sort asc
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on Quotes
    Then Im on raw material quotes page
    When I click on <Filter> in most important raw materials table
    Then Most important table is sorted asc by <Filter>
    Examples:
      | Filter      |
      | "Surowiec"  |
      | "Kurs"      |
      | "Zm. %"     |
      | "Zmiana"    |
      | "Otwarcie"  |
      | "Max"       |
      | "Min"       |
      | "Czas"      |
      | "Jednostka" |

  Scenario Outline: Change filters on most important raw material table sort desc
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on Quotes
    Then Im on raw material quotes page
    When I double click on <Filter> in most important raw materials table
    Then Most important table is sorted desc by <Filter>
    Examples:
      | Filter      |
      | "Surowiec"  |
      | "Kurs"      |
      | "Zm. %"     |
      | "Zmiana"    |
      | "Otwarcie"  |
      | "Max"       |
      | "Min"       |
      | "Czas"      |
      | "Jednostka" |

  Scenario Outline: Change filters on all raw materials table sort asc
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on Quotes
    Then Im on raw material quotes page
    When I click on <Filter> in all raw materials table
    Then All raw material table is sorted asc by <Filter>
    Examples:
      | Filter      |
      | "Surowiec"  |
      | "Kurs"      |
      | "Zm. %"     |
      | "Zmiana"    |
      | "Otwarcie"  |
      | "Max"       |
      | "Min"       |
      | "Czas"      |
      | "Jednostka" |

  Scenario Outline: Change filters on all raw materials table sort desc
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on Quotes
    Then Im on raw material quotes page
    When I double click on <Filter> in all raw materials table
    Then All raw material table is sorted desc by <Filter>
    Examples:
      | Filter      |
      | "Surowiec"  |
      | "Kurs"      |
      | "Zm. %"     |
      | "Zmiana"    |
      | "Otwarcie"  |
      | "Max"       |
      | "Min"       |
      | "Czas"      |
      | "Jednostka" |

  Scenario: Change last stock update
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on Quotes
    Then Im on raw material quotes page
    When I change date of stocks on 3.12.2025
    Then Date is changed on 3.12.2025

