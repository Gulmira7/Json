Feature: mvn repository verification

  @Mvn
  Scenario: Search for Cucumber java
  When User is on mvn repository page
    And User should see search button
    Then User should look for the word "cucumber java"
    And User should see a word "cucumber java" in the results

