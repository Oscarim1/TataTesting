Feature: Realizar la comparacion de dos laptops

  Scenario: Validar comparacion de laptops
    Given abrir la pagina de lenovo
    When seleccionar primera laptop
    And agregar a la comparacion la primera laptop
    When seleccionar la segunda laptop
    And agregar a la comparacion la segunda laptop
    Then obtener datos de la especificaciones
