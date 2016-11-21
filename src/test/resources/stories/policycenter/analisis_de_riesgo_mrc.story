Analisis De Riesgo Mrc

Meta: @lote1

@issue #CDSEG-993
@tag automator: eliana_alvarez
@Sprint 9

Narrative:
Como usuario de Policy Center
Quiero poder gestionar los UW que se generen por bloqueo en la linea de multiriesgo corporativo

Scenario: Validar el valor ingresado superior al 10% en el sublimite de la cobertura deterioro de bienes refrigerados por rotura de maquinaria en la cotizacion
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When quiera agregar un tomador adicional que es riesgo consultable <cedula>
And intente ingresar una nueva ubicacion
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO                       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios                           |                     |                  | Valor Reconstrucción             | 100            |
| Información de Artículos | Edificios                           |                     | Danos materiales | Valor asegurado danos materiales | 100            |
| Información de Artículos | Maquinaria y equipo                 |                     |                  | Valor Asegurable                 | 100            |
| Información de Artículos | Maquinaria y equipo                 |                     | Danos materiales | Valor asegurado danos materiales | 100            |
| Otros Articulos          | Maquinaria y equipo de contratistas |                     |                  | Valor Asegurable                 | 23             |
| Otros Articulos          | Maquinaria y equipo de contratistas |                     |                  | Índice variable                  | 1              |
When haga clic en el boton Aceptar
Then se debe generar un bloqueo en la poliza, mostrar el siguiente mensaje
|mensaje |
|La sumatoria del valor asegurable de todos los artículos de maquinaria y equipo contratistas de toda la póliza debe ser menor o igual al 10% del valor asegurable total de todos los artículos de la póliza.|

Examples:
|numSubscripcion|
||

Scenario: Validar el valor ingresado superior al 10% en el sublimite de la cobertura deterioro de bienes refrigerados por rotura de maquinaria en la expedicion
Meta: @manual
When intente expedir una poliza con un valor ingresado superior al 10% en el sublimite de la cobertura deterioro de bienes refrigerados por rotura de maquinaria
Then se debe generar un bloqueo en la poliza, mostrar el siguiente mensaje
|mensaje |
|La sumatoria del valor asegurable de todos los artículos de maquinaria y equipo contratistas de toda la póliza debe ser menor o igual al 10% del valor asegurable total de todos los artículos de la póliza.|
And generar un UW issue
|UWIssue |
|La sumatoria del valor asegurable de todos los artículos de maquinaria y equipo contratistas de toda la póliza debe ser menor o igual al 10% del valor asegurable total de todos los artículos de la póliza.|

Examples:
|cotizacion|
|0012638466|

Scenario: Validar que el valor ingresado en el sublimite de la cobertura  deterioro de bienes refrigerados por rotura de maquinaria, debe ser menor igual al 40% del valor asegurable de los artículos del riesgo o de la ubicación
Meta: @manual
Given se ha realizado la cotizacion para el producto de mrc
When intente expedir una poliza con un valor ingresado en el sublimite de la cobertura deterioro de bienes refrigerados por rotura de maquinaria, mayor al 40% del valor asegurable de los artículos del riesgo o de la ubicación
Then se debe generar un bloqueo en la poliza, mostrar el siguiente mensaje
|mensaje |
|
El valor de "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " deber ser menor o igual al "40,0%" de la sumatoria de los valores asegurables de "todos los articulos".|
And generar un UW issue
|UWIssue |
|
El valor de "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " deber ser menor o igual al "40,0%" de la sumatoria de los valores asegurables de "todos los articulos".|

Examples:
||
||