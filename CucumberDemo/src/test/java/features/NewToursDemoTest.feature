Feature: Data Driven Testing of Newtours

  

  Scenario Outline: DDF login funcionality positive test
    Given I enter username as "<userName>"
    When I enter password as "<password>"
    When I click on login button
    Then You should see the SIGN-OFF text
    
    Examples: 
      | userName  | password |
      | earth     | earth    |  
      | jupiter   | jupiter  | 
      | mercury   | mercury  |
      | saturn    | saturn   |
      | uranus    | uranus   |
      | mars      | mars     |
      | venus     | venus    |
       