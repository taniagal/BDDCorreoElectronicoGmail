Poliza Principal Pa

Meta:
@lote4
@issue #CDSEG-4619
@sprint 10
@tag automator: eliana_alvarez
@local

Narrative:
Como usuario de PolicyCenter
Quiero tener disponible la informacion de la poliza principal, tanto la replicada desde la plantilla como la propia de este tipo de poliza

Scenario: Verificar al consultar una cotizacion que no debe estar la seccion de contrato de poliza(Asegurados, vehiculos, coberturas)
GivenStories: stories/policycenter/login_policy.story
Given que tengo una cotizacion <cotizacion>
Then no debe estar visible la sección de contrato de poliza: asegurados, vehiculos, coberturas

Examples:
|cotizacion|
|33333336  |

Scenario: Verificar en la  ventana de revision de poliza solo debe mostrar la informacion general sin las tablas del detalle de riesgo
Given que tengo una cotizacion <cotizacion>
When ingrese a la revision de la poliza
Then la  ventana de revision de poliza solo debe mostrar la informacion general sin las tablas del detalle de riesgo

Scenario: Verificar en la  ventana de cotizacion solo se debe visualizar la información general, sin el detalle de vehiculos
Given que tengo una cotizacion <cotizacion>
When cotice y vaya a la ventana de cotizacion
Then solo se debe visualizar la informacion general, sin el detalle de vehiculos