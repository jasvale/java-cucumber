Feature: Pirates Scenario

  Edward "Blackbeard" Teach does not sail without his sheep Queen Anne's Revenge.
  If she sinks, he will sink with her.
  Here all scenarios always include the Blackbeard and Queen Anne's

  Background: Edward "Blackbeard" Teach and Queen Anne's Revenge
    Given a pirate named Edward "Blackbeard" Teach
    And a ship called Queen Anne's Revenge

  Rule: Ship Ownership - Captain is onboard
    Scenario: Blackbeard is with his ship.
      Then the captain is with his ship

    Scenario: No attempt motuny
      When there no one displeased onboard
      And the captain is with his ship
      Then the captain is respected

  Scenario: Can sail
    Then sails