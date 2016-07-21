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