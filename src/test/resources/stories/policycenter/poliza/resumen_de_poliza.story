Meta:

Narrative:

Como usuario del negocio con el perfil de  Agente, CSR, Asegurador, o Gerente
Deseo poder visualizar el resumen de una informacion de la poliza
Para Verificar la informacion de la poliza visualizada

Scenario: scenario description
GivenStories: stories/policycenter/login_policy.story
Given que existe una <poliza> y esta dentro de la vigencia
When Cuando ingreso a una cuenta por la opcion de resumen
Then visualizo el resumen de la poliza
And verifico que se encuentren los siguientes datos
|campoEliminar|txtExpedida|txtTomador|txtTipoDocumento|txtNumeroDocumento|
|Oferta       |expedida   |tomador   |Tipo documento  |Número documento  |

|txtFechaInicioVigencia|txtFechaFinVigencia|txtTipoPlazo |txtPolizaFinaciada|agenteRegistro  |agenteServicio  |
|Fecha inicio vigencia |Fecha fin vigencia |Tipo de plazo|Póliza financiada |Código de agente|Código de agente|

Examples:
|poliza       |
|TEST_22222222|