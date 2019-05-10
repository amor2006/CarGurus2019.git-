Feature: Shopping for cars
  I want to shop for a new card

  @CarGuru
  Scenario Outline: Shop for the new car
    Given I am on CarGurus Home Page
    When I click on New Cars
    Then I select all mandatory fields <make>,<model>,<year>,<miles>,<trim> and <zipcode>
    Then I click on Search Bar

    Examples: 
      | make     | model   | year   | trim | miles   | zipcode |
      | "Toyota" | "Camry" | "2018" | "L"  | "25 mi" | "02169" |
