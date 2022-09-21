Feature: Testing the job Search functionality

  Background:
    When User provide keyword for search box

  Scenario: validating the view position after using search job box
    Then User Validate all position list have same keyword


  Scenario: validating the position list is visible  after viewing one position and navigate back
    Then User Validate after view the position and return to the list it should show the list


  Scenario: validating the view position after using search job box
    Then User validate title  for each position

  Scenario: validating the location
    Then User validate title  for each position
