@wikipedia
Feature: Wikipedia search page


  Scenario:Wikipedia Search Functionality Title Verification
  Given User is on Wikipadia page
  When User types "Steve Jobs" in the wiki search box
  And User clicks on search button
  Then User sees "Steve Jobs"is in the wiki title

  Scenario:Wikipedia Search Header Title Verification
    Given User is on Wikipadia page
    When User types "Steve Jobs" in the wiki search box
    And User clicks on search button
    Then User sees "Steve Jobs" is in the main header

  Scenario:Wikipedia Search Image Title Verification
    Given User is on Wikipadia page
    When User types "Steve Jobs" in the wiki search box
    And User clicks on search button
    Then User sees "Steve Jobs" is in the image header


