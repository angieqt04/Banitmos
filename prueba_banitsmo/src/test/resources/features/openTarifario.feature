#Author: axquinta@bancolombia.com.co
Feature: Open Tarifario
  The user open pdf file tarifario

  Scenario: Open Tarifario
    Given the user access to Tarifario link
    When the user select file
    Then the user see in new tab Tarifas de Depósitos
