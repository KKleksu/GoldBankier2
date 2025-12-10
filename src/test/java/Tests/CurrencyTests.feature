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
    Then I selected <Currency> currency on quotes section forex

    Examples:
      |Currency|
     # |"EUR/PLN"|
      |"USD/PLN"|
      |"CHF/PLN"|
     # |"GBP/PLN"|
     # |"EUR/USD"|

  Scenario Outline: Change period of time on currency page
    Given Im on homepage
    When I click on currency in markets submenu
    Then Im on currency page
    When I click on <Period> period on currency page
    Then Currency period is changed to <Period>

    Examples:
      |Period|
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
  When I want to change nav chart to <ChartName>
  Then Nav chart <ChartName> is selected

  Examples:
  |ChartName|
  #|"Notowania walut forex"|
  |"Średnie kursy NBP"|
  #|"Kupno NBP"        |
  |"Sprzedaż NBP"     |

  Scenario Outline: Change currency on quotes section NBP
    Given Im on homepage
    When I click on currency in markets submenu
    Then Im on currency page
    When I want to change nav chart to <ChartName>
    Then Nav chart <ChartName> is selected
    When I click on <Currency> currency in NBP
    Then I selected <Currency> currency on quotes section NBP

    Examples:
      |Currency||ChartName|
     # |"EUR"||"Średnie kursy NBP"|
      |"USD"||"Średnie kursy NBP"|
     # |"CHF"||"Średnie kursy NBP"|
     # |"GBP"||"Średnie kursy NBP"|

# EURO NIE DZIAŁA W POPRZEDNICH MOŻLIWE ŻE TEŻ NIE DO SPRAWDZENIA
  Scenario Outline: Change currency on quotes section NBP buy
    Given Im on homepage
    When I click on currency in markets submenu
    Then Im on currency page
    When I want to change nav chart to <ChartName>
    Then Nav chart <ChartName> is selected
    When I click on <Currency> currency in NBP buy, nav number "2"
    Then I selected <Currency> currency on quotes section NBP buy, in this <Number> put for EUR 2 rest 1

    Examples:
      |Currency||ChartName||Number|
      |"EUR"||"Kupno NBP" ||"2"|
      #|"USD"||"Kupno NBP" ||"1"|
      #|"CHF"||"Kupno NBP" ||"1"|
     # |"GBP"||"Kupno NBP" ||"1"|

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
