@so
Feature: Wikipedia search page

  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipadia page
    When User types "<searchKey>" in the wiki search box
    And User clicks on search button
    Then User sees "<title>"is in the wiki title

    Examples: Test data for search functionality

      | searchKey    | title        |
      | Steve Jobs   | Steve Jobs   |
      | Ricky Martin | Ricky Martin |
      | Lady Gaga    | Lady Gaga    |
      | Lionel Messi | Lionel Messi |



