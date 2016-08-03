Informacion Poliza Pa

Meta:

@issue SUGWUSC-10900 Policy Info - PA

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador,
incluir un segundo tomador, vigencia de la poliza y la informacion de asesor

Scenario: Validar warning por tomador riesgo PEP
GivenStories: stories/policycenter/login_policy.story
Given ya se inicio una nueva suscripcion <numeroCuenta>
And se visualiza la informacion de la poliza
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
And pase a la siguiente opcion
And se identifique el tipo <tipoDocumento> y numero de documento <numeroDocumento> del tomador como PEPS
Then se debe mostrar el mensaje <mensaje> que se obtenga de Riesgos PEPS como warning
And se debe permitir continuar la cotizacion

Examples:
|numeroCuenta|tipoDocumento       |numeroDocumento|organizacion|canal             |mensaje                                                                                               |
|C000777778  |CEDULA DE CIUDADANIA|123456         |Sura        |Canal Tradicional |FRANK RAMIREZ ALZATE con CEDULA DE CIUDADANIA - 123456 es un riesgo no estándar y debe ser autorizado.|