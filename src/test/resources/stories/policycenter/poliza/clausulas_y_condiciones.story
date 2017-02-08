Meta:
@tag equipo: 2
@lote2
@Sprint 14

Narrative:
Como usuario de PolicyCenter
Quiero seleccionar las condiciones, Exclusiones y Clausulas
Para poder establecer alcances a las polizas


Scenario:
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1973      |OZIL         |SNEIDER        |DIRECCION DE RESIDENCIA|CALLE 27F #60-69|Antioquia   |Medellin|INT-3 |
When ingrese a exclusiones y condiciones
Then se deben mostrar las siguientes opciones en clausulas en <estadouno>
| OPCIONES_MENU   |
| Caída de globos |
| AA |





Examples:
|estadouno  |
| Visible   |

