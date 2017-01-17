Poliza Principal Pa

Meta:
@lote3
@issue #CDSEG-4619
@sprint 10
@tag team: 1
@local

Narrative:
Como usuario de PolicyCenter
Quiero tener disponible la informacion de la poliza principal, tanto la replicada desde la plantilla como la propia de este tipo de poliza

Scenario: Verificar al consultar una cotizacion que no debe estar la seccion de contrato de poliza(Asegurados, vehiculos, coberturas)
GivenStories: stories/policycenter/login_policy.story
Given que tengo una cotizacion <cotizacion>
Then no debe estar visible la seccion de contrato de poliza: asegurados, vehiculos, coberturas
And debe estar visible la seccion del menu herramientas con las opciones: Resumen, facturacion, Contactos, Participantes y Notas

Examples:
|cotizacion|
|33333336  |

Scenario: Verificar en la  ventana de revision de poliza solo debe mostrar la informacion general sin las tablas del detalle de riesgo
Given que tengo una cotizacion <cotizacion>
When ingrese a la revision de la poliza
Then la  ventana de revision de poliza solo debe mostrar la informacion general sin las tablas del detalle de riesgo

Examples:
|cotizacion|
|33333336  |

Scenario: Verificar en la  ventana de cotizacion solo se debe visualizar la información general, sin el detalle de vehiculos
Given que tengo una cotizacion <cotizacion>
When cotice y vaya a la ventana de cotizacion
Then solo se debe visualizar la informacion general, sin el detalle de vehiculos
And los campos de la cotizacion no sean editables
And no debe estar visible la seccion de contrato de poliza: asegurados, vehiculos, coberturas
And debe estar visible la seccion del menu herramientas con las opciones: Resumen, facturacion, Contactos, Participantes y Notas

Examples:
|cotizacion|
|33333336  |

Scenario: Verificar en la poliza expedida que no debe estar la seccion de contrato de poliza(Asegurados, vehiculos, coberturas)
Given ya se tiene una poliza expedida <numeroPoliza>
When voy a la opcion de cotizacion
Then no debe estar visible en el menu lateral las opciones: asegurados, vehiculos, coberturas
And debe estar visible en el menu lateral con las opciones: Resumen, facturacion, Contactos, Participantes y Notas
And los campos de la ventana cotizacion de la poliza expedida no son editables

Examples:
|numeroPoliza   |
|TEST_33333339  |

Scenario: Verificar que cuando revise la facturación los campos que no sean de consulta no pueden ser editables
Meta: @manual
Given que tengo una poliza en estado expedida
When voy a la opcion de facturacion
Then los campos que no sean de consulta no pueden ser editables
