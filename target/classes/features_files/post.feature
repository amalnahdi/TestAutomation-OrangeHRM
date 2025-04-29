@tag2
Feature: Buzz Post
  En tant que utilisateur je souhaite tester publier un message sur l application OrangeHRM
 
#  Background:
    #Given Je me connecte sur l application   OrangeHRM
   # When Je saisis "admin" dans le champ Username
   # And Je saisis "admin123" dans le champ Password
   # And Je clique sur le bouton Login
   # Then Je devrais voir la page "Dashboard" de l application OrangeHRM
   #  And Je clique sur le bouton "Buzz"

  @post
  Scenario: Post a message on Buzz
   Given Je me connecte sur l application   OrangeHRM
    When Je saisis "admin" dans le champ Username
    And Je saisis "admin123" dans le champ Password
    And Je clique sur le bouton Login
    Then Je devrais voir la page "Dashboard" de l application OrangeHRM
    And  Je clique sur le bouton "Buzz"
    When Je clique sur  "What's on your mind?" field
    And Je saisie "Hello world"
    And Je clique sur le bouton "Post"
    Then Je devrais voir une popup "Successfully Saved"
    
    
 