Feature: Test access to the page -a propos-

Scenario: Verification of the display of the three key numbers
Given I visit happn website 
When I click on the link  -a propos- 
Then I can see the three key numbers of happn 