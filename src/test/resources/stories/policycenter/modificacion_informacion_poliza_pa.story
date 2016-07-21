Modificacion Informacion Poliza Pa

Meta:

Narrative:
Como usuario de PolicyCenter
Quiero poder realizar cambios en la informacion de cliente, vehiculo o coberturas en una poliza de automoviles.

@Issue SUGWUSC-10900 Policy Info - PA

Scenario: Visualizacion de los datos de la poliza
GivenStories: stories/policycenter/login_policy.story
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a modificar dicha cotizacion
Then se debe visualizar los datos de la informacion de la poliza
|tipoDocumento       |numeroDocumento|nombre                         |telefono |direccion                                  |tipoDireccion|descripcionDireccion                      |tipoPlazo|fechaInicioVigencia|fechaFinVigencia|fechaExpedicion|
|CEDULA DE CIUDADANIA|1234567891     |DORIAN STIWAR EASTMOND PULGARIN|408-2211 |CRA 65 # 48-162, LOUISVILLE, Estados Unidos|Vivienda     |Created by the Address Builder with code 0|6 meses  |06/21/2016         |12/21/2016      |07/21/2016     |

Examples:
|numeroPoliza  |
|TEST_22222222 |

Scenario: Adicionar segundo tomador
Given ya se tiene una poliza expedida <numeroPoliza>
When adicione un segundo tomador <tipoDocumento> <numeroDocumento>
Then el tomador debe quedar registrado en la informacion de la poliza

Examples:
|numeroPoliza  |tipoDocumento        |numeroDocumento |
|TEST_22222222 |CEDULA DE CIUDADANIA |1234567890      |

Scenario: Adicionar segundo tomador - riesgo consultable
Given ya se tiene una poliza expedida <numeroPoliza>
When adicione un segundo tomador <tipoDocumento> <numeroDocumento>
And el tomador sea riesgo consultable
Then se debe bloquear el registro del tomador y mostrar un mensaje <mensaje>

Examples:
|numeroPoliza  |tipoDocumento        |numeroDocumento |mensaje                                                                                   |
|TEST_22222222 |CEDULA DE CIUDADANIA |123456          |El tomador es un riesgo no estandar y no es posible gestionar la solicitud por este canal.|

Scenario: Adicionar segundo tomador - PEP
Given ya se tiene una poliza expedida <numeroPoliza>
When adicione un segundo tomador <tipoDocumento> <numeroDocumento>
And el tomador sea riesgo PEP
Then se debe bloquear el registro del tomador y mostrar un mensaje <mensaje>

Examples:
|numeroPoliza  |tipoDocumento        |numeroDocumento |mensaje                                                                                               |
|TEST_22222222 |CEDULA DE CIUDADANIA |123456          |FRANK RAMIREZ ALZATE con CEDULA DE CIUDADANIA - 123456 es un riesgo no estándar y debe ser autorizado.|

Scenario: No permitir cambiar el tomador primario
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a modificar dicha cotizacion
Then no se debe permitir cambiar el tomador primario

Examples:
|numeroPoliza  |
|TEST_22222222 |

Scenario: Validar campo poliza financiada
Meta:
@Manual
Given ya se tiene una poliza expedida <numeroPoliza>
When el tipo de poliza es PPAutos
Then se debe habilitar el campo poliza financiada

Examples:
|numeroPoliza  |
|TEST_22222222 |