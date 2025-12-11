Feature: Invest Gold Test

  Scenario: Go to gold page
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page

  Scenario Outline: Change period on invest gold page
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page
    When I click on <Period> period on invest gold page
    Then Period on invest gold page is changed to <Period>

    Examples:
      | Period |
  #|"1D"|
  #|"1W"|
      | "1M"   |
  #|"3M"|
  #|"6M"|
  #|"1Y"|
      | "5Y"   |
 # |"MAX"|

  Scenario Outline: Check charts change
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page
    When I click on Chart: <Chart>
    Then Chart is changed to <Chart>

    Examples:
      | Chart         |
      | "candlestick" |
      | "ohlc"        |

  Scenario Outline: Check scale change
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page
    When I click on Skale: <Scale>
    Then Scale is changed to <Scale>
    Examples:
      | Scale         |
      | "logarithmic" |
      | "percentage"  |
      | "indexed"     |

  Scenario Outline: Check interval change
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page
    When I click on <Period> period on invest gold page
    And In invest page i click on interval: <Interval>
    Then In invest page its <Time> and interval is changed to <Interval>

    Examples:
      | Period | Interval |  | Time       |
      | "1D"   | "5min"   |  | "intraday" |
    #  | "1D"   | "15min"  |  | "intraday" |
     # | "1D"   | "30min"  |  | "intraday" |
     # | "1D"   | "1H"     |  | "intraday" |
     # | "1Y"   | "1D"     |  | "day"      |
      | "1Y"   | "1W"     |  | "day"      |
     # | "1Y"   | "1M"     |  | "day"      |

  Scenario: Check theme change
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page
    When In invest page i click on theme: "darkTheme"
    Then In invest page theme is changed to "darkTheme"
    When In invest page i click on theme: "lightTheme"
    Then In invest page theme is changed to "lightTheme"

  Scenario: Check newest news
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page
    And Newest news are visible