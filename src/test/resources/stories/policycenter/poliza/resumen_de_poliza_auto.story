Meta:

Narrative:
Como usuario del negocio con el perfil de  Agente, CSR, Asegurador, o Gerente
Deseo poder visualizar el resumen de una informacion de la poliza de autos
Para Verificar la informacion de la poliza visualizada de auto

Scenario: Verificacion de etiquetas nuevas
GivenStories: stories/policycenter/login_policy.story
Given que existe una <poliza> y esta dentro de la vigencia
When visualizo el resumen de la poliza
Then verifico que se encuentren los siguientes datos
|txtTipoPlazo |txtPolizaFinaciada|
|Tipo de plazo|Póliza financiada |

Examples:
|poliza       |
|TEST_22222222|

Scenario: Verificacion de campos nuevos de coaseguro
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza|
|C000888888 |Autos   |Individual|
When puedo ingresar los datos del coaseguro
And agregue las aseguradoras y su porcentaje de participacion
|aseguradora     |participacion|
|Sura            |60           |
|ACE SEGUROS S.A.|40           |
And acepte el coaseguro
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis  | motor | valor_asegurado | descuento | recargo | zona | plan               |
| ASD951 | 2011   | 01601225         | MEDELLIN           | Particular        | kljh456 | yui10 | 17900000        | null      | null    | 2    | Plan Modular       |
When ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And expido la poliza y voy al archivo de poliza
And visualizo el resumen de la poliza
Then verifico los datos de coseguro
|lblAseguradora|lblParticipacion  |lblLider|lblTCoaseguro  |lblTpCoaseguro   |tipoPoliza|
|Aseguradora   |% de participación|Líder   |Tiene Coaseguro|Tipo de coaseguro|auto      |

Examples:
|tipo_documento      |documento |poliza       |
|CEDULA DE CIUDADANIA|1234567890|TEST_22222222|
