@authentification1
Feature: OrangeHRM Connexion et Déconnexion

  Background:
    Given Je me connecte sur l application OrangeHRM
    When Je saisis "admin" dans le champ Username
    And Je saisis "admin123" dans le champ Password
    And Je clique sur le bouton Login
    Then Je devrais voir la page "Dashboard" de l application OrangeHRM

  @login
  Scenario: Connexion reussie

  @logout
  Scenario: Déconnexion
    When Je clique sur le menu utilisateur
    And Je selectionne l option "Logout"
    Then Je suis redirigee vers la page de login
