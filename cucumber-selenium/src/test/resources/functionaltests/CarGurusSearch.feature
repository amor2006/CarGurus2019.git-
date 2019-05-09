Feature: Search for My Next Car on CarGurus.com
  I want to verify that "Search for My Next Car" feature works as per requirement

  @CarGurusSearch
  Scenario Outline: Search for a new car
    Given I am on CarGurus Home Page
    Then I select "<make>" and "<model>" of my next car
    And I enter the "<zip>" code
    And I click on Search

    Examples: 
      | make | model | zip   |
      | Audi | A4    | 02169 |
      | BMW  | M5    | 02111 |
