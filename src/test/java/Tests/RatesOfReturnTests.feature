Feature: Rates of return

  Scenario: Go to rates of return page
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page

  Scenario Outline: Sort short rates of return ASC
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page
    When I click on sort by <SortBy> in short rates of return
    Then Short rates of return are sorted by <SortBy> asc

    Examples:
    |SortBy|
    #"Surowiec"|
    #|"Kurs"    |
    |"1D"      |
    #|"1T"      |
    #|"2T"      |
    #|"1M"      |
    #|"2M"      |
    #|"3M"      |
    #|"6M"      |
    |"YTD"     |

  Scenario Outline: Sort short rates of return DESC
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page
    When I double click on sort by <SortBy> in short rates of return
    Then Short rates of return are sorted by <SortBy> desc

    Examples:
      |SortBy|
    #"Surowiec"|
    #|"Kurs"    |
      |"1D"      |
    #|"1T"      |
    #|"2T"      |
    #|"1M"      |
    #|"2M"      |
    #|"3M"      |
    #|"6M"      |
      |"YTD"     |

  Scenario: Go to Long term rates of return
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page
    When I click on long term rates of return
    Then Im on long term rates of return

  Scenario Outline: Sort long rates of return Asc
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page
    When I click on long term rates of return
    Then Im on long term rates of return
    When I click sort by <SortBy> in long rates of return
    Then Long rates of return are sorted by <SortBy> asc

    Examples:
    |SortBy|
    #|"Surowiec"|
    #|"Kurs"    |
    |"1R"      |
    #|"2L"      |
    #|"3L"      |
    #|"5L"      |
    #|"10L"     |
    |"20L"     |
    #|"MAX"     |

  Scenario Outline: Sort long rates of return Desc
    Given Im on homepage
    When I click raw materials
    Then Im on raw material page
    When I click on rates of return
    Then Im on rates of return page
    When I click on long term rates of return
    Then Im on long term rates of return
    When I double click sort by <SortBy> in long rates of return
    Then Long rates of return are sorted by <SortBy> desc

    Examples:
      |SortBy|
    #|"Surowiec"|
    #|"Kurs"    |
      |"1R"      |
    #|"2L"      |
    #|"3L"      |
    #|"5L"      |
    #|"10L"     |
      |"20L"     |
    #|"MAX"     |



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