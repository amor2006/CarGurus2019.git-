Feature: Actor

  #Scenario: Getting actors
  #Given url 'http://localhost:3000/actor'
  #Then method get
  #* print response[18].first_name
  #And match response[18].first_name contains 'Lucille'
  #Scenario: Post actors
  #Given url 'http://localhost:3000/actor'
  #Then request
  #"""
  #{
  #"first_name": "Alejandro",
  #"last_name": "Gomez"
  #}
  #"""
  #And method post
  #And status 201
  #Then method get
  #* print response
  Scenario: Update actors
    Given url 'http://localhost:3000/actor?actor_id=eq.244'
    Then request
      """
        { "actor_id": 244,
          "first_name": "Mithun",
          "last_name": "Chakraborty",
          "last_update": "2019-05-23T21:42:20.156117"
      }
      """
    And method put
    And status 204
    Then method get
    * print response
