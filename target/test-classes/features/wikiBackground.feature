@wikiBackground
Feature: Wikipedia search page

 Background: User searched for given text
   Given User is on Wikipadia page
   When User types "Steve Jobs" in the wiki search box
   And User clicks on search button

  Scenario:Wikipedia Search Functionality Title Verification
    Then User sees "Steve Jobs"is in the wiki title

  Scenario:Wikipedia Search Header Title Verification
    Then User sees "Steve Jobs" is in the main header

  Scenario:Wikipedia Search Image Title Verification
    Then User sees "Steve Jobs" is in the image header