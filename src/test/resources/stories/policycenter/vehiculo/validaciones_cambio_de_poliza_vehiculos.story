Meta:
@lote4
@issue CDSEG-1296
@tag equipo: 5
@local
@Sprint 4

Narrative:
Como usuario del policy center
quiero poder ver las validaciones de cambio de poliza de vehiculo

Scenario: Validar existencia de numero de chasis
GivenStories: stories/policycenter/login_policy.story
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                 |
|55555556  |El número de chasis no ha sido ingresado|

Scenario: Validar existencia de numero de motor
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                 |
|55555556  |El número de motor no ha sido ingresado|

Scenario: Validar importado por tercero
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                                   |
|55555556  |El vehículo es importado por terceros, debe ser autorizado|


Scenario: Validar zona no permitida
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                                                                   |
|55555556  |Por política de la compañía no esta permitido asegurar este tipo de vehículo en esta zona.|

Scenario: Validar marca no permitida
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                                          |
|55555556  |Por política de la compañía este vehículo no puede ser asegurado.|

Scenario: Validar tipo de servicio
Meta: @lote1 @manual
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                            |
|55555556  |Tipo de servicio no permitido, debe ser autorizado.|

Scenario: Validar transporta combustible
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                                                   |
|55555556  |Valor para campo transporta combustible no permitido. Por favor verifique.|



Scenario: Validar valor comercial
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                                                       |
|55555556  |El Valor del vehiculo no se encuentra en los rangos estimados por Suramericana|

Scenario: Validar maximo valor accesorios especiales
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                                                                             |
|55555556  |El valor de los accesorios especiales es mayor al valor Asegurado del vehículo. Por favor verifique.|

Scenario: Validar maximo valor accesorios
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                                       |
|55555556  |El valor de los accesorios es mayor al 20% del valor Asegurado|

Scenario: Validar maximo valor vehiculo
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                                       |
|55555557  |El valor asegurado del vehículo supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos|

Scenario: Validar modelo vehiculo
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
And presione el boton de emitir la poliza
Then no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                                                      |
|55555557  |El valor asegurado del vehículo supera el límite máximo permitido por políticas.|