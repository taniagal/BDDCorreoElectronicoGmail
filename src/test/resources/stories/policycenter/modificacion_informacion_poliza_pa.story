Modificacion Informacion Poliza Pa

Meta:

@issue #CDSEG-977
@tag automator: diego_cardona_acevedo
@local
@Sprint 4

Narrative:
Como usuario de PolicyCenter
Quiero poder realizar cambios en la informacion de cliente, vehiculo o coberturas en una poliza de automoviles.

@issue SUGWUSC-10900 Policy Info - PA

Scenario: Visualizacion de los datos de la poliza
GivenStories: stories/policycenter/login_policy.story
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a modificar dicha cotizacion
Then se debe visualizar los datos de la informacion de la poliza
|tipoDocumento       |numeroDocumento|nombre            |telefono |direccion                                   |tipoDireccion|descripcionDireccion                      |tipoPlazo|
|CEDULA DE CIUDADANIA|1356448711     |ALFREDO ANTIOQUIA |408-2211 |CRA 65 # 48-162, LOS ANGELES, Estados Unidos|Vivienda     |Created by the Address Builder with code 0|Anual    |

Examples:
|numeroPoliza  |
|TEST_22223222 |

Scenario: Adicionar segundo tomador
Given ya se tiene una poliza expedida <numeroPoliza>
When adicione un segundo tomador <tipoDocumento> <numeroDocumento>
Then el tomador debe quedar registrado en la informacion de la poliza

Examples:
|numeroPoliza  |tipoDocumento        |numeroDocumento |
|TEST_22223222 |CEDULA DE CIUDADANIA |1234567890      |

Scenario: No permitir cambiar el tomador primario
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a modificar dicha cotizacion
Then no se debe permitir cambiar el tomador primario

Examples:
|numeroPoliza  |
|TEST_22223222 |

Scenario: Validar campo poliza financiada
Meta:
@manual
Given ya se tiene una poliza expedida <numeroPoliza>
When el tipo de poliza es PPAutos
Then se debe habilitar el campo poliza financiada

Examples:
|numeroPoliza  |
|TEST_22223222 |

Scenario: Validar que muestre mensaje warning de PEPS para tomador - Información de la póliza
Given ya se tiene una poliza expedida <numeroPoliza>
When adicione un segundo tomador <tipoDocumento> <numeroDocumento>
And se presione el boton siguiente
Then se debe mostrar el mensaje como warning <mensaje> que se obtenga de Riesgos PEPS de tomador
And se debe permitir continuar a asegurados de la modificacion

Examples:
|numeroPoliza |tipoDocumento        |numeroDocumento |mensaje                                                                                               |
|TEST_22223222|CEDULA DE CIUDADANIA |123456          |FRANK RAMIREZ ALZATE con CEDULA DE CIUDADANIA - 123456 es un riesgo no estándar y debe ser autorizado.|