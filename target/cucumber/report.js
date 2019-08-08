$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/wikipediaSearch.feature");
formatter.feature({
  "name": "Wikipedia search page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wikipedia"
    }
  ]
});
formatter.scenario({
  "name": "Wikipedia Search Functionality Title Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wikipedia"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipadia page",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipadia_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\"is in the wiki title",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_wiki_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Header Title Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wikipedia"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipadia page",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipadia_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the main header",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_main_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Image Title Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wikipedia"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipadia page",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipadia_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});