Meta:
@lote4
@tag equipo: 5
@Sprint 8

Narrative:
Como usuario de Policy Center
Quiero que cuando este realizando una cotizacion o expedicion de un cambio a una figura que sea riesgo consultable
se bloquee la cotizacion o expedicion

Scenario: Riesgo consultable placa
Meta:
@manual
Given estoy realizando la cotizacion y la expedicion de un cambio
When ingrese una placa que sea riesgo consultable
Then se debe verificar si la placa esta registrada como riesgo consultable
And mostrar el mensaje que trae la integracion
And no se permite realizar la cotizacion ni la expedicion

Scenario: Riesgo consultable chasis
Meta:
@manual
Given estoy realizando la cotizacion y la expedicion de un cambio
When ingrese un chasis que sea riesgo consultable
Then se debe verificar si el chasis esta registrado como riesgo consultable
And mostrar el mensaje que trae la integracion
And no se permite realizar la cotizacion ni la expedicion

Scenario: Riesgo consultable motor
Meta:
@manual
Given estoy realizando la cotizacion y la expedicion de un cambio
When ingrese un motor que sea riesgo consultable
Then se debe verificar si el motor esta registrado como riesgo consultable
And mostrar el mensaje que trae la integracion
And no se permite realizar la cotizacion ni la expedicion

Scenario: Cotizar - ISSUE - Riesgo consultable Bloqueo - Causal Financiero
Meta:
@manual
Given que ingrese toda la informacion necesaria para realizar una nueva cotizacion de modificacion de autos
And cotice
When la figura es Tomador, el tipo de causal es FINANCIERA, el tipo de riesgo es DNI, MOTOR, CHASIS y/o PLACA
sean riesgo consultable bloqueante
Then No se debe permitir continuar con la cotizacion, y se debe mostrar el siguiente mensaje:
Para el tipo de riesgo  DNI y la figura Tomador: “El tomador es un riesgo no estándar y no es posibl...” + “Para solicitar la autorizacion dirijase a la opcion Analisis de riesgo”

Scenario: Cotizar - ISSUE - Tomador Riesgo consultable Bloqueo - Causal Moral
Meta:
@manual
Given que ingrese toda la informacion necesaria para realizar una nueva cotizacion de modificacion de autos
And cotice
When la figura es TOMADOR, el tipo de causal es MORAL, el tipo de riesgo DNI y/O otros
And el tipo de validacion devuelve riesgo consultable bloquea
Then no se debe permitir continuar con la cotización, y se debe mostrar el siguiente mensaje:
“El tomador es un riesgo no estandar y no es posibl...” + “Para solicitar la autorizacion dirijase a la opcion Analisis de riesgo”


Scenario: Cotizar - ISSUE - Asegurado Riesgo consultable Bloqueo - Causal Moral
Meta:
@manual
Given que ingrese toda la informacion necesaria para realizar una nueva cotizacion de modificacion de autos
And cotice
When la figura es ASEGURADO, el tipo de causal es MORAL, el tipo de riesgo DNI y/O otros
And el tipo de validacion devuelve riesgo consultable bloquea
Then no se debe permitir continuar con la cotización, y se debe mostrar el siguiente mensaje:
“El asegurado es un riesgo no estandar y no es posi...” + “Para solicitar la autorizacion dirijase a la opcion Analisis de riesgo”

Scenario: Cotizar - ISSUE - Riesgo consultable Bloqueo - Causal Tecnico
Meta:
@manual
Given que ingrese toda la informacion necesaria para realizar una nueva cotizacion de modificacion de autos
And cotice
When la figura es ASEGURADO, TOMADOR, el tipo de causal es TECNICO, el tipo de riesgo DNI
And el tipo de validacion devuelve riesgo consultable bloquea
Then no se debe permitir continuar con la cotizacion, y se debe mostrar el siguiente mensaje:
Para ASEGURADO: “El asegurado es un riesgo no estandar y no es posi...” + “Para solicitar la autorizacion dirijase a la opcion Analisis de riesgo”
Para TOMADOR: “El tomador es un riesgo no estandar y no es posibl...” + “Para solicitar la autorizacion dirijase a la opcion Analisis de riesgo”







