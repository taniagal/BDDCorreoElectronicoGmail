Meta:
@lote3
@sprint 12
@tag equipo: 4


Narrative:
Como usuario de PlicyCenter
Requiero poder realizar los siguientes ajuste para el calculo de la prima de MRC
1. En el resultado de la cotización se debe mostrar el subtotal del locatión.
2. El calculo de la prima del indice variable se debe sumar en cada una de las coberturas, es decir en la rutina se debe incluir

Scenario: Validar valor de interes adicional
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| cuenta      | organizacion | producto                | canal             | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| C1060447895 | Sura         | Multiriesgo corporativo | Canal Tradicional | CEDULA DE CIUDADANIA | 02/12/1990       | MIKASA        | AKERMAN         | DIRECCION DE RESIDENCIA | CALLE 54B #50-25 | Antioquia    | Medellin | INT-3  |
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas     |
|Building |120000000       |Danos,Terremoto|
And agrego el valor comercial <valor> y el indice variable <valor_indice>
And ingrese las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA   | ENTRADAS                                  | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Sustraccion | Valor asegurado sustraccion con violencia | 120000000      |
And cotice el articulo
Then debo poder ver el valor de la prima en la cobertura y el valor de cobertura de sustraccion
| cobertura                     | prima   |
| Cobertura de Terremoto        | 125.050 |
| Cobertura de Sustraccion      | 4.674   |
| Cobertura de Danos materiales | 42.066  |

Examples:
| valor     | valor_indice | departamento | ciudad   | direccion         | descripcion   | actividad                         |
| 120000000 | 5           | Antioquia    | Medellin | CR 44 A # 73 - 00 | Edificio Core | Actividades de agencias de empleo |