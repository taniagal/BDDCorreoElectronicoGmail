Meta:
@lote2
@issue #CDSEG-7045
@tag equipo: 5
@Sprint 15

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder modificar el tomador principal de una poliza

Scenario: Habilitar campo en cambio de tomador
GivenStories: stories/policycenter/login_policy.story
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|medioVenta|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB162|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |Televentas|
When ingrese a modificar dicha cotizacion
Then debe estar disposible el boton cambiar tomador con las opciones por las cuales puedo cambiarlo:
|opciones              |
|Nuevo Persona Jurídica|
|Nuevo Persona Natural |
|Del Directorio        |
|Contacto existente    |
Examples:
||
||

Scenario: Cambiar el tomador a principal a uno peps para validar mensaje
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|medioVenta|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB160|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |Televentas|
When ingrese a modificar dicha cotizacion
And quiera cambiar el tomador principal por uno existente que es pep con <numeroDocumento> y <tipoDocumento>
And intente cotizar el cambio de poliza
And expido la poliza
Then se debe mostrar un mensaje indicando que el tomador principal es peps
|mensaje     |
|El tomador(a) CAROLINA OCHOA con DNI C71318883 es PEP (Persona públicamente expuesta) y es necesario tramitar el caso con su director o gerente. Diríjase a análisis de riesgos para solicitar aprobación. |
Examples:
|numeroDocumento|tipoDocumento       |
|71318883       |CEDULA DE CIUDADANIA|

Scenario: Cambiar el tomador a principal a uno riesgo consultable para validar mensaje
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|medioVenta|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB167|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |Televentas|
When ingrese a modificar dicha cotizacion
And quiera cambiar el tomador principal por uno existente que es pep con <numeroDocumento> y <tipoDocumento>
And intente cotizar el cambio de poliza
And expido la poliza
Then se debe mostrar un mensaje indicando que el tomador principal es peps
|mensaje                                                                                                                                                                                                                         |
|JOSE PAEZ ALZATE, El tomador es un riesgo no estándar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial. Diríjase a análisis de riesgos para solicitar aprobación.|
Examples:
|numeroDocumento|tipoDocumento       |
|9876543        |CEDULA DE CIUDADANIA|
