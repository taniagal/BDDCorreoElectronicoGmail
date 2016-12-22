Inicio Cancelacion Pa

Meta: @lote2

@issue #USC-14730
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 8

Narrative:
Como usuario de PolicyCenter
Cuando quiera iniciar una cancelación para pólizas de Autos
Entonces deberia realizarce segun las reglas

Scenario: registrar instruccion previa a la renovacion
GivenStories: stories/policycenter/login_policy.story
Given que existe una <poliza> y esta dentro de la vigencia
When necesito iniciar la cancelacion
Then Se deben mostrar los campos motivo, metodo de reembolso, fecha vigente de cancelacion, iniciar cancelación y cancelar transaccion.

Examples:
|poliza       |
|TEST_22222222|

Scenario: Validacion de retroactividad en cancelacion de poliza
Given que existe una <poliza> y esta dentro de la vigencia
When necesito iniciar la cancelacion
And se ingrese la fecha con retroactividad menor a la politica
Then Se debe validar la retroactividad sino cumple con <mensaje>

Examples:
|poliza       |mensaje|
|TEST_22222222|La fecha inicio de vigencia no cumple con el parámetro de retroactividad definido (30 días)|

Scenario: Validacion emision adelantada en cancelacion de poliza
Given que existe una <poliza> y esta dentro de la vigencia
When necesito iniciar la cancelacion
And se ingrese la fecha con emision anticipada mayor a la politica
Then Se debe validar la emision anticipada con <mensaje>

Examples:
|poliza       |mensaje|
|TEST_22222222|La fecha inicio de vigencia no cumple con el parámetro de emisión anticipada definido (60 días)|

Scenario: motivos de cancelacion para polizas diferentes a Bancolombia
Given que existe una <poliza> y esta dentro de la vigencia
When necesito iniciar la cancelacion
Then Se debe validar en la lista cuando la poliza NO es de bancolombia:
|Financiación cancelación por muerte|
|Financiación cancelación por no pago|
|Financiación cancelación por petición cliente|
|Por error de trámite|
|Por no pago|
|Por no renovada|
|por orden de la compañía|
|Por pérdida total|
|por petición del cliente|

Examples:
|poliza       |
|TEST_22222222|


Scenario: validar metodo de reembolso
Meta:
 @manual
Given que existe la <poliza> y esta dentro de la vigencia
When necesito iniciar una cancelacion
And ingrese uno de los motivos:
|Financiación cancelación por muerte|
|Financiación cancelación por no pago|
|Financiación cancelación por petición cliente|
|Por error de trámite|
|Por no pago|
|Por no renovada|
|por orden de la compañía|
|Por pérdida total|
|por petición del cliente|
Then Se debe validar el cambio en metodo de reembolso

Examples:
|poliza       |
|TEST_22222222|

Scenario: motivos de cancelacion para polizas de bancolombia
Meta:
@manual
Given que existe <poliza> y esta dentro de la vigencia
When se necesita iniciar la cancelacion
Then Se debe validar en la lista cuando la poliza NO es de bancolombia
|El cliente termino el credito|
|El cliente prepago el credito|
|El cliente tomo otra poliza con Suramericana|
|El cliente tomo otra poliza con otra compañia|
|Por cambio en la fecha de vigencia|

Examples:
|poliza       |
|TEST_22222222|