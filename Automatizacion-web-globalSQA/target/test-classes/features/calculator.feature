
Feature: Calculator Simple

  @test1
  Scenario Outline: Calcular una multiplicación
    Given me encuentro en la página principal de globalSQA
    And me dirigo al apartado Calculadora
    When ingreso el primer número "<numero1>" y el segundo número "<numero2>"
    Then el resultado es "<resultado>"
    Examples:
    | numero1 | numero2 |    resultado     |
    |    4    |    5    |   4 * 5 = 20     |
    |    5    |    7    |   5 * 7 = 35     |
    |    3    |    10   |   3 * 10 = 30    |
