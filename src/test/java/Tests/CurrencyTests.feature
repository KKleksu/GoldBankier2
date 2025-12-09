Feature: Currency

  Scenario: Go to currency page
    Given Im on homepage
    When I click on currency in markets submenu
    Then Im on currency page

  Scenario Outline: Change currency on quotes section
    Given Im on homepage
    When I click on currency in markets submenu
    Then Im on currency page
    When I click on <Currency> currency in forex
    Then I selected <Currency> currency on quotes section

    Examples:
      |Currency|
      |"EUR/PLN"|
      |"USD/PLN"|
      |"CHF/PLN"|
      |"GBP/PLN"|
      |"EUR/USD"|

  Scenario Outline: Change peroid of time in quotes section
    Given Im on homepage
    When I click on currency in markets submenu
    Then Im on currency page
    When I click on <Peroid> peroid of time
    Then Peroid is changed to <Peroid>

    Examples:
      |Peroid|
        #|"1D"  |
        #|"1W"  |
        #|"1M"  |
        |"3M"  |
        |"6M"  |
        |"1Y"  |
        #|"5Y"  |
        # "Max" |

  Scenario Outline: Calculate currency change
    Given Im on homepage
    When I click on currency in markets submenu
    Then Im on currency page
    When I wanna change <Amount> <FromCurrency> to <ToCurrency>, rate by <RateBy>
    Then Currency calculator show value <ToCurrency>

    Examples:
    |Amount||FromCurrency||ToCurrency||RateBy|
    |"1000"||"USD"       ||"EUR"     ||"forex" |
    |"1689"||"HKD"       ||"JPY"     ||"nbp"   |
    |"3684"||"MVR"       ||"ZWG"     ||"nbp"   |

Scenario Outline: Change main chart
  Given Im on homepage
  When I click on currency in markets submenu
  Then Im on currency page
  When I want to change main chart to <ChartName>
  Then Chart <ChartName> is selected

  Examples:
  |ChartName|
  |"Średnie kursy NBP"|
  |"Kupno NBP"        |
  |"Sprzedaż NBP"     |

  Scenario Outline: Change currency on quotes section NBP
    Given Im on homepage
    When I click on currency in markets submenu
    Then Im on currency page
    When I want to change main chart to <ChartName>
    Then Chart <ChartName> is selected
    When I click on <Currency> currency in NBP
    Then I selected <Currency> currency on quotes section NBP

    Examples:
      |Currency||ChartName|
     # |"EUR"||"Średnie kursy NBP"|
      |"USD"||"Średnie kursy NBP"|
     # |"CHF"||"Średnie kursy NBP"|
     # |"GBP"||"Średnie kursy NBP"|

  Scenario Outline: Change currency on quotes section NBP buy
    Given Im on homepage
    When I click on currency in markets submenu
    Then Im on currency page
    When I want to change main chart to <ChartName>
    Then Chart <ChartName> is selected
    When I click on <Currency> currency in NBP buy
    Then I selected <Currency> currency on quotes section NBP buy

    Examples:
      |Currency||ChartName|
     # |"EUR"||"Kupno NBP"        |
      #|"USD"||"Kupno NBP"        |
      |"CHF"||"Kupno NBP"        |
     # |"GBP"||"Kupno NBP"        |

  Scenario Outline: Change currency on quotes section NBP sell
    Given Im on homepage
    When I click on currency in markets submenu
    Then Im on currency page
    When I want to change main chart to <ChartName>
    Then Chart <ChartName> is selected
    When I click on <Currency> currency in NBP sell
    Then I selected <Currency> currency on quotes section NBP sell

    Examples:
      |Currency||ChartName|
     # |"EUR"||"Sprzedaż NBP"     |
      |"USD"||"Sprzedaż NBP"     |
      |"CHF"||"Sprzedaż NBP"     |
      |"GBP"||"Sprzedaż NBP"     |