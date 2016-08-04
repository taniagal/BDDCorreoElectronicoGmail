Modificacion Informacion Poliza Pa

Meta:

@issue SUGWUSC-10900 Policy Info - PA

Narrative:
Como usuario de PolicyCenter
Quiero poder realizar cambios en la informacion de cliente, vehiculo o coberturas en una poliza de automoviles.


Scenario: Visualizacion de los datos de la poliza
GivenStories: stories/policycenter/login_policy.story
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a modificar dicha cotizacion
Then se debe visualizar los datos de la informacion de la poliza
|tipoDocumento       |numeroDocumento|nombre                         |telefono |direccion                                  |tipoDireccion|descripcionDireccion                      |tipoPlazo|
|CEDULA DE CIUDADANIA|1234567891     |DORIAN STIWAR EASTMOND PULGARIN|408-2211 |CRA 65 # 48-162, LOUISVILLE, Estados Unidos|Vivienda     |Created by the Address Builder with code 0|Anual    |

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

Scenario: No permitir cambiar el tomador primario
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a modificar dicha cotizacion
Then no se debe permitir cambiar el tomador primario

Examples:
|numeroPoliza  |
|TEST_22222222 |

Scenario: Validar campo poliza financiada
Meta:
@manual
Given ya se tiene una poliza expedida <numeroPoliza>
When el tipo de poliza es PPAutos
Then se debe habilitar el campo poliza financiada

Examples:
|numeroPoliza  |
|TEST_22222222 |