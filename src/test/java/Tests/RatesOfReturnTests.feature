Feature: Rates of return

  Scenario: Go to rates of return page
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page

    Scenario: Sort short term by YTM desc
      Given Im on homepage
      When I click raw materials
      Then Im on raw material page
      When I click on rates of return
      Then Im on rates of return page
      When I click on sort by YTD
      And I click on sort by YTD
      Then Short term is sorted by desc

  Scenario: Sort short term by YTM ASC
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page
    When I click on sort by YTD
    Then Short term sorted by asc

  Scenario: Go to Long term rates of return
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page
    When I click on long term rates of return
    Then Im on long term rates of return

  Scenario: Sort long term by 10Y Asc
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page
    When I click on long term rates of return
    Then Im on long term rates of return
    When I click on 10Y
    Then Long term is sorted asc

  Scenario: Sort long term by 10Y Desc
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page
    When I click on long term rates of return
    Then Im on long term rates of return
    When I click on 10Y
    And I click on 10Y
    Then Long term is sorted desc

    Scenario: Go to raw materials by brad crumbs
      Given Im on homepage
      When I click raw materials
      Then Im on raw material page
      When I click on rates of return
      Then Im on rates of return page
      When I click raw material bread crumbs
      Then Im on raw material page

  Scenario: Go to home page by brad crumbs
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page
    When I click on home page bread crumbs
    Then Im on homepage without cookie