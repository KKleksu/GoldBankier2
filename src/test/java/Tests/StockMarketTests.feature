Feature: Stock Market

  Scenario: Im on stock market page
    Given Im on homepage
    When I click on stock market in markets submenu
    Then Im on stock market page


  Scenario Outline: Change nav tab
    Given Im on homepage
    When I click on stock market in markets submenu
    Then Im on stock market page
    When In stock market i click on <NavTab> nav tab
    Then In stock market nav tab is changed to <NavTab>
    When In stock market i click on <ChartCard> chart card
    Then In stock market chart card is changed to <ChartCard>
    Examples:
      | NavTab          |  | ChartCard   |
      | "Indeksy GPW"   |  | "WIG20"     |
      | "Indeksy GPW"   |  | "WIG"       |
      | "Indeksy GPW"   |  | "mWIG40"    |
      | "Indeksy GPW"   |  | "sWIG80"    |
      | "Indeksy GPW"   |  | "NCIndex"   |
      | "Akcje"         |  | "PKNORLEN"  |
      | "Akcje"         |  | "PKOBP"     |
      | "Akcje"         |  | "PZU"       |
      | "Akcje"         |  | "PEKAO"     |
      | "Akcje"         |  | "SANPL"     |
      | "Indeksy świat" |  | "CAC40"     |
      | "Indeksy świat" |  | "DAX"       |
      | "Indeksy świat" |  | "DJI"       |
      | "Indeksy świat" |  | "HANGSENG"  |
      | "Indeksy świat" |  | "NASDAQ"    |
      | "Indeksy świat" |  | "SP500"     |
      | "Akcje świat"   |  | "APPLE"     |
      | "Akcje świat"   |  | "GOOGLE"    |
      | "Akcje świat"   |  | "MICROSOFT" |
      | "Akcje świat"   |  | "NVIDIA"    |
      | "Akcje świat"   |  | "TESLA"     |

