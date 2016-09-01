Informacion Poliza Pa

Meta:

@issue #CDSEG-995
@Automatizador diego cardona
@Sprint 2

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador,
incluir un segundo tomador, vigencia de la poliza y la informacion de asesor

Scenario: Visualizacion de los datos de la poliza
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
When estoy expidiendo una poliza de autos
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
Then se debe visalizar los datos del tomador, como son: tipo y numero de identificacion, nombre completo,
telefono, direccion, vigencia de la poliza (valor por defecto), nombre del agente, fecha de suscripcion y
nombre de la compania aseguradora

Examples:
|numCuenta     |organizacion|canal            |
|C000888888    |Sura        |Canal Tradicional|

Scenario: Deseo de financiacion de poliza
Given que voy a buscar la cuenta <numCuenta>
And se visualiza la informacion de la poliza
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
And indique que deseo financiar la poliza
Then se debe habilitar la opcion de numero de cuotas

Examples:
|numCuenta    |organizacion|canal            |
|C000888888   |Sura        |Canal Tradicional|

Scenario: No deseo de financiacion de poliza
Given que voy a buscar la cuenta <numCuenta>
And se visualiza la informacion de la poliza
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
And no indique que deseo financiar la poliza
Then no se debe habilitar la opcion de numero de cuotas

Examples:
|numCuenta    |organizacion|canal            |
|C000888888   |Sura        |Canal Tradicional|

Scenario: Deseo de financiacion de poliza - opcion Siguiente
Given que voy a buscar la cuenta <numCuenta>
And se visualiza la informacion de la poliza
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
And indique que deseo financiar la poliza
And indique el numero de cuotas
And seleccione la opcion siguiente
Then se debe mostrar un mensaje <mensaje> de advertencia

Examples:
|numCuenta    |organizacion|canal            |mensaje                                                                                  |
|C000888888   |Sura        |Canal Tradicional|La financiación de la póliza está sujeta a aprobación por parte del área de financiación.|