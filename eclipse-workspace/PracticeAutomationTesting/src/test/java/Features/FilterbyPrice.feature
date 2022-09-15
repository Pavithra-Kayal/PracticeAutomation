@tag
Feature: Shop Filter by Price functionality

@FilterbyPrice
Scenario: Search the items by Filter by Price
Given User should be on Practice Automation Testing Testcases page
When User clicks on the shop menu
Then Adjust the filter by price range between rupees "150" to "450"
Then  Click on the Filter button
Then User should view books only between the range "150" to "450"