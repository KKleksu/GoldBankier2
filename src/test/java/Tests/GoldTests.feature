
Feature: Gold Test

  Scenario: Go to gold page
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page

Scenario Outline: Check is time changed
  Given Im on homepage
  When I click raw materials
  Then Im on raw material page
  When I click on "Złoto"
  Then Im on invest page
  When I click on time <Time>
  Then Time is changed <Time>

  Examples:
  |Time|
  |"1W"|
  |"1D"|
  |"1M"|
  |"3M"|
  |"6M"|
  |"1Y"|
  |"5Y"|

  Scenario Outline: Check charts change
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page
    When I click on Chart: <Chart>
    Then Chart is changed to <Chart>

    Examples:
    |Chart|
    |"candlestick"|
    |"ohlc"|

  Scenario Outline: Check scale change
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page
    When I click on Skale: <Scale>
    Then Scale is changed to <Scale>
    Examples:
    |Scale|
    |"logarithmic"|
    |"percentage"|
    |"indexed"|

  Scenario Outline: Check interval change
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page
    When I click on time <Time>
    And I click on interval: <Interval>
    Then Interval is changed to <Interval>

    Examples:
    |Time|Interval|
    |"1D"|"5min"  |
    |"1D"|"15min" |
    |"1D"|"30min" |
    |"1D"|"1H" |
    |"1Y"|"1D" |
    |"1Y"|"1W" |
    |"1Y"|"1M" |

    Scenario: Check theme
      Given Im on homepage
      When I click raw materials
      Then Im on raw material page
      When I click on "Złoto"
      Then Im on invest page
      When I click on theme: "darkTheme"
      Then Theme is changed to "darkTheme"
      When I click on theme: "lightTheme"
      Then Theme is changed to "lightTheme"

Scenario: Check newest news
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on "Złoto"
    Then Im on invest page
    And Newest news are visible