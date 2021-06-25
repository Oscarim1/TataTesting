@Ciclo1
Feature: Realizar la comparacion de dos laptops

  Scenario: Validar comparacion de laptops
  	Given abrir el navegador
    When ir a la pagina de lenovo
    And seleccionar primera laptop
    When agregar a la comparacion la primera laptop
    And seleccionar la segunda laptop
    When agregar a la comparacion la segunda laptop
    And comparar los laptops
    Then obtener datos de la especificaciones
