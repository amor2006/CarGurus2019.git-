Feature: CarGurus Top Menu Bar
  I want to verify all the menu bars in top menu are present and clickable

  @CarGurusMenuBars
  Scenario: Menu items from top Menu Bar
    Given I am on CarGurus Home Page
    Then I get all menu bars from top
    And I verify all the menu bars in top menu are present and clickable

    