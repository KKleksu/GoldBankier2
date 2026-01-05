Feature:Sample API

  Background:
    * url 'https://api.bankier.pl/quotes/public/commodities-section-chart/?symbols=gold&metrics=true&intraday=true&today=true'
Scenario: Testing the exact response of a GET
Given path 'data.profile_data.last_value'
When method GET
Then status 200
