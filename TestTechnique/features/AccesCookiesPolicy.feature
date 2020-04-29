Feature: Test Access to cookies policy

Scenario: Test Existence of different headers of the chart 
Given I visit website  
When I want to access to the page Charte d utilisation des cookies
Then  Je suis sur la page cookies
And I m able to see all different headers of the chart  
