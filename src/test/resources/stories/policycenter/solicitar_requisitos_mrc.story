
Meta:
@lote2
@issue
@tag automator: eliana_alvarez
@local
@Sprint 12

Narrative:
Como usuario de negocio
Quiero que se levante el requisito para la solucion de multiriesgo de acuerdo a las reglas de negocio ya definidas.

Scenario: scenario description
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta     | organizacion | producto                |
| C000777777 | Sura         | Multiriesgo corporativo |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion declinar MRC
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe mostrar un mensaje de advertencia
| mensaje                                             |
| Existen requisitos pendientes, por favor verifique. |
And voy a validar el requisito en la aplicacion con el usuario <usuario> y contrasenia <contrasenia>
And debo ver el requisito con el estado correspondiente con la fecha del dia de hoy
| requisito  | estado    |
| INSPECCION | PENDIENTE |

Examples:
| departamento | ciudad   | direccion         | descripcion       | actividad                     | usuario  | contrasenia |
| Antioquia    | Medellin | CR 45 A # 44 - 01 | Prueba requisitos | Acabado de productos textiles | linajate | linajate    |