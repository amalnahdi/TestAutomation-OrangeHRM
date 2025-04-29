@post12
Feature: OrangeHRM – Publication Buzz

  Background:
    Given Je me connecte sur l application OrangeHRM
    When Je saisis "admin" dans le champ Username
    And Je saisis "admin123" dans le champ Password
    And Je clique sur le bouton Login
    Then Je devrais voir la page "Dashboard" de l application OrangeHRM
    And Je clique sur le bouton "Buzz"

  Scenario: Poster un message
    When Je clique sur le champ "What’s on your mind?"
    And Je saisis "Hello world"
    And Je clique sur le bouton "Post"
    Then Je devrais voir une popup "Successfully Saved"
