Feature: Search for a job on CarGurus.com

  @FindJobCarGurus
  Scenario: Shop for a new job
    Given I am on CarGurus Home Page
    When I scroll down till the end of the page and click on Careers
    When I click on Find Jobs
    When On a new window I click on Test Automation Job and assert it