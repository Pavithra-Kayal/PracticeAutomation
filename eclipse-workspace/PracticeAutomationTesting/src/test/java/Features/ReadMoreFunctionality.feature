Feature: Shop Read More functionality

Scenario: User should not add the product if its out of stock
Given Open the Practice automation landing page
When Ckick on the Shop menu
Then Click on the read more button in the home page
Then Read more options indicates the Out of Stock
Then User cannot add the product which has read more option as it was out of stock