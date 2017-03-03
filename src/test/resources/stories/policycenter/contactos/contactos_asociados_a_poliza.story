Meta:
@tag equipo: 2
@lote3
@Sprint 14

Narrative:
Como usuario de policy center
Deseo incluir el campo de identificacion con tipo y informacion del riesgo
Para  ver la informacion de los contactos asociados a una  poliza.

Scenario: Visualizacion de campos en poliza autos  y multiriesgo
Given que estoy en el resumen de la poliza Mrc o Autos con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese a la opcion de contactos
Then se deben mostrar los siguientes campos en la tabla
|OPCIONES_MENU |
|Identificación|
|Riesgo        |
And se debe mostrar las siguientes opciones en cada contacto
|OPCIONES_MENU      |
|Detalle de contacto|

Examples:
| numPoliza           |rolUsuario|
| TEST_22222222       |Asesor    |
| TEST_33355481       |Asesor    |



