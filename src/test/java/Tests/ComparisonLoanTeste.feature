Feature: Comparison loan calculator

  Scenario: Go to comparison page
    Given Im on homepage
    When I click cash loans
    Then Im on cash loan comparison page


    Scenario Outline: Take loan
      Given Im on homepage
      When I click cash loans
      Then Im on cash loan comparison page
      When I want to take <Cash> loan
      And I want loan to be on <Months> months
      Then Site show <Cash2> me offers

      Examples:
      |Cash||Months||Cash2|
      |"1000" ||"3" ||1000 |
      |"25000"||"64"||25000|
      |"30568"||"84"||30568|
      |"90000"||"96"||90000|
      |"300000"||"120"||300000|
      
      Scenario Outline: Change filters
        Given Im on homepage
        When I click cash loans
        Then Im on cash loan comparison page
        When I want to change main filter <MainFilter> and sub filter <SubFilter>
        Then Main Filter <MainFilter> and sub filter <SubFilter> are selected

        Examples:
        |MainFilter||SubFilter|
       # |"Rodzaje rat"||"Równe"|
        |"Rodzaje rat"||"Malejące"|
        #|"Bez zabezpieczeń"||"Dowolnie"|
        |"Bez zabezpieczeń"||"Tak"     |
        #|"Bez zabezpieczeń"||"Nie"     |
        #|"Bez zaświadczeń" ||"Dowolnie"|
        |"Bez zaświadczeń" ||"Tak"     |
        #|"Bez zaświadczeń" ||"Nie"     |
        #|"Bez zgody małżonka"||"Dowolnie"|
        |"Bez zgody małżonka"||"Tak"     |
        #|"Bez zgody małżonka"||"Nie"     |
        #|"Bez ubezpieczenia" ||"Dowolnie"|
        |"Bez ubezpieczenia" ||"Tak"     |
        #|"Bez ubezpieczenia" ||"Nie"     |
        #|"Oferta wiązana"    ||"Dowolnie"|
        #|"Oferta wiązana"    ||"Tak"     |
        |"Oferta wiązana"    ||"Nie"     |
