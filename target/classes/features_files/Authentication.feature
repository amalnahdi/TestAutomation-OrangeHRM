@tag
Feature: Login utilisateur sur  OrangeHRM
  En tant que utilisateur  je souhaite me  connecter et me  deconnecter de l application OrangeHRM

  @authentification
  Scenario: Je souhaite tester la page de la connexion de l application OrangeHRM avec des  identifiants valides
    Given Je me connecte sur l application   OrangeHRM
    When Je saisis "admin" dans le champ Username
    And Je saisis "admin123" dans le champ Password
    And Je clique sur le bouton Login
    Then Je devrais voir la page "Dashboard" de l application OrangeHRM
  
    
 # Scenario: Post a message on Buzz
  
 #   Given Je suis sur  la page "Buzz"
  #  When Je clique sur  "What's on your mind?" field
  #  And Je saisie "Hello world"
  #  And Je clique sur le bouton "Post"
  #  Then Je devrais voir une popup "Successfully Saved"

  
  Scenario: En tant qu utilisateur, je souhaite me déconnecter de l application OrangeHRM. 
    Given Je suis connecté et sur la page "Dashboard"  
    When Je clique sur le bouton du menu déroulant dans le coin supérieur droit  
    And Je sélectionne l option "Logout"  
    Then Je suis redirigé vers la page de login  
    
    
  


# @tag
# Feature: Je souhaite tester la page de la connexion  deconnexion de l application Swaglabs
 # En tant que  utilisateur Je souhaite tester la page de la connexion et  deconnexion de l application Swaglabs

#  @Login_casPassant
 # Scenario: Je souhaite tester la page de la connexion de l application Swaglabs avec des  identifiants valides  
  #  Given Je me connecte a l application
   # * Les champs Username et Password  sont visibles sur la page
   # * le boutton login est cliquable
   # When Je saisis standard_user dans le champ Username
    #* Je saisis secret_sauce dans le champ Password
    #* Je clique sur le bouton Login
    #Then Je devrais voir la page d accueil de l application

  #@Deconnexion
  #Scenario: Je souhaite tester la deconnexion depuis l application Swaglabs
   # Given Je suis connecté à l application
    #When Je clique sur le bouton Menu
    #* je clique sur le bouton  Logout
    #Then Je devrais être redirigée vers la page des produits 

  #@Login_casNonPassant
  #Scenario: Je souhaite tester la connexion échouée avec un utilisateur bloqué de lapplication Swaglabs
   # Given Je suis sur la  page de connection
    #* Les champs Username et Password sont visibles
    #* Le bouton Login est cliquable
    #When Je saisis locked_out_user dans le champ Username
    #* Je saisis secret_sauce dans le champ Password
    #* Je clique sur le bouton Login
    #Then Je reste sur la page de connexionavec message d erreur affiche (Epic sadface: Sorry, this user has been locked out.)

  #@Login_avec_problemes_performance
  #Scenario Outline: je veut tester la connexion avec  avec des problèmes de performance
   # Given Je suis sur la  page de connexion 
    #* Les champs Username et Password sont visibles
    #* Le bouton Login est cliquable
    #When Je saisis <Username> dans  le champ Username
    #* Je  saisis secret_sauce dans le chap Password
    #* Je clique sur le bouton Login
    #Then Je devrais etre redirigée vers  la page des  produits   avec  des  problemes  de performance
    
    
    
    

               
