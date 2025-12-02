
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
  |"1 W"|
  |"1 D"|
  |"1 M"|
  |"3 M"|
  |"6 M"|
  |"1 Y"|
  |"5 Y"|




