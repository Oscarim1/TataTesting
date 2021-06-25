# Tata Testing
Proyecto de testing automatizado con respecto a la siguiente historia de usuario

## Comparación de laptops
* Abrir la web de [gadgetsnow] (https://www.gadgetsnow.com/compare-laptops )
* Comparar Lenovo E41-80 con Lenovo B40-80 
* Extraer todo está detalle desde el tabla “SUMMARY” en un Excel


### Introducción
Se realizo el testing automatizado con el fin de completar la historia de usuario mencionada anteriormente, para optar a una oferta laboral.

### Construcción
* [Java](https://www.java.com/es/)
* [Eclipse](https://www.eclipse.org/)
* [Selenium](https://www.selenium.dev/)
* [Cucumber](https://cucumber.io/)
* [JUnit4](https://junit.org/)

### Pre-requisitos
Necesitas tener instalado algún IDE, de preferencia [Eclipse], lo puedes descargar de acá

  * [Eclipse](https://www.eclipse.org/)

Necesitaras verificar la version de chrome que posees, con el fin de identificar que ChromeDriver.exe debes elegir, las diferentes versiones las puedes encontrar aca 
* [CrhomeDriver](https://chromedriver.chromium.org/downloads)

Posteriormente, deberas ubicar la carpeta drivers, ubicada en  
 ``` sh
   src\test\resources
   ```
   
### Instalación
1. Clona el repositorio

   ``` sh
   git clone https://github.com/Oscarim1/TataTesting.git
   ```
2. Actualizacion de dependencias

   ``` sh
   Deberas realizar una actualizacion de las dependencias de maven
   ```
### Ejecutando las pruebas
Dentro del proyecto, nos ubicamos en 

   ``` sh
   src\test\resources
   ```
Y ubicamos la carpeta Features, donde encontraras 
``` sh
   comparacion.feature
   ```
Una vez ahí, deberas ejecutar la prueba mediante Cucumber
   
### Análisis de las pruebas
Las pruebas verifican la funcionalidad la pagina al momento de una realizar una comparación de dos modelos de laptops.


Se visualizará explícitamente si la prueba paso con éxito o hubo algún fallo, este sera el formato.
``` sh
     Given abrir el navegador                        # steps.CompararStep.abrir_el_navegador()
  When ir a la pagina de lenovo                   # steps.CompararStep.ir_a_la_pagina_de_lenovo()
  And seleccionar primera laptop                  # steps.CompararStep.seleccionar_primera_laptop()
  When agregar a la comparacion la primera laptop # steps.CompararStep.agregar_a_la_comparacion_la_primera_laptop()
  And seleccionar la segunda laptop               # steps.CompararStep.seleccionar_la_segunda_laptop()
  When agregar a la comparacion la segunda laptop # steps.CompararStep.agregar_a_la_comparacion_la_segunda_laptop()
  And comparar los laptops                        # steps.CompararStep.comparar_los_laptops()
  Then obtener datos de la especificaciones       # steps.CompararStep.obtener_datos_de_la_especificaciones()

1 Scenarios (1 passed)
8 Steps (8 passed)
1m2,963s
   ```
    
### Posibles errores
Es posible que la generación del Excel con los datos relacionados con Summary se visualicen separados por comas, esto ser solucionará en releases futuros

### Visualizacion de la prueba
Es posible que la generación del Excel con los datos relacionados con Summary se visualicen separados por comas, esto ser solucionará en releases futuros:

### Trabajos futuros
Se espera poder implementar el modelo Page object con el fin de poder generar codigo mas limpio y organizado.

### Autor
* **Oscar Reyes** - [Oscarim1](https://github.com/Oscarim1)
