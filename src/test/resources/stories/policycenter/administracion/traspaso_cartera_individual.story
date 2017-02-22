Traspaso Cartera Individual

Meta:
@lote4
@Story SUGWUSC-1183
@tag equipo: 2
@Sprint 14

Narrative:
Como usuario de Policy Center quiero ser capaz de transferir
polizas de un asesor a otro y cambio de oficina basado en
reglas, para una mejor gestion de la comisión.

Scenario: Traspaso de cartera desde un asesor a otro asesor
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente y la oficina de radicacion:
|oficina|agente_oficina            |
|9991   |ASESOR 1 - PRUEBA TRASPASO|
When seleccione el producto <producto> para expedir la poliza
And seleccione el tipo de poliza:
|tipoPoliza|
|Individual|
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And expido la poliza y voy al archivo de poliza
When Ir al menu traspaso de cartera
And Traspasar cartera de asesor a asesor:
|oldProduceCode|newProduceCode|
|9991          |9992          |
When Adelantar el reloj un dia
And Ejecutar proceso<nombreProceso>
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta> y la selecciono
Then validar trapaso de cartera:
|nuevoCodigoAsesor|
|9992             |
Examples:
|numCuenta |producto|tipo_documento      |documento |numeroCuenta|nombreProceso       |
|C000112405|Autos   |CEDULA DE CIUDADANIA|1030765050|C000112405  |Bulk Producer Change|

Scenario: Traspaso de cartera desde un asesor a otro directo
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente y la oficina de radicacion:
|oficina|agente_oficina            |
|9992   |ASESOR 3 - PRUEBA TRASPASO|
When seleccione el producto <producto> para expedir la poliza
And seleccione el tipo de poliza:
|tipoPoliza|
|Individual|
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And expido la poliza y voy al archivo de poliza
When Ir al menu traspaso de cartera
And Traspasar cartera de asesor a asesor directo:
|oldProduceCode|newProduceCode|
|9993          |9994          |
When Adelantar el reloj un dia
And Ejecutar proceso<nombreProceso>
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta> y la selecciono
Then validar trapaso de cartera:
|nuevoCodigoAsesor|
|9994             |
Examples:
|numCuenta |producto|tipo_documento      |documento |numeroCuenta|nombreProceso       |
|C000112406|Autos   |CEDULA DE CIUDADANIA|1030765437|C000112406  |Bulk Producer Change|

Scenario: Traspaso de cartera de una poliza
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente y la oficina de radicacion:
|oficina|agente_oficina            |
|9995   |ASESOR 7 - PRUEBA TRASPASO|
When seleccione el producto <producto> para expedir la poliza
And seleccione el tipo de poliza:
|tipoPoliza|
|Individual|
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And expido la poliza y voy al archivo de poliza
When Ir al menu traspaso de cartera
And Traspasar cartera en poliza:
|numeroCuenta|newProduceCode|
|C000112408  |9998          |
When Adelantar el reloj un dia
And Ejecutar proceso<nombreProceso>
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta> y la selecciono
Then validar trapaso de cartera:
|nuevoCodigoAsesor|
|9998             |
Examples:
|numCuenta |producto|tipo_documento      |documento |numeroCuenta|nombreProceso       |
|C000112408|Autos   |CEDULA DE CIUDADANIA|1030765050|C000112408  |Bulk Producer Change|

Scenario: Traspaso de cartera de una oficina a otra
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente y la oficina de radicacion:
|oficina|agente_oficina            |
|9993   |ASESOR 5 - PRUEBA TRASPASO|
When seleccione el producto <producto> para expedir la poliza
And seleccione el tipo de poliza:
|tipoPoliza|
|Individual|
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And expido la poliza y voy al archivo de poliza
When Ir al menu traspaso de cartera
And Traspasar cartera de oficina a oficina:
|anteriorOficiona                     |nuevaOficina                          |
|9993 > OFICINA 3 - PRUEBAS ACEPTACION|9994 -> OFICINA 4 - PRUEBAS ACEPTACION|
When Adelantar el reloj un dia
And Ejecutar proceso<nombreProceso>
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta> y la selecciono
Then validar oficiona de radicacion:
|oficinaDeRadicacion                  |
|9994 > OFICINA 4 - PRUEBAS ACEPTACION|
Examples:
|numCuenta |producto|tipo_documento      |documento |numeroCuenta|nombreProceso       |
|C000112407|Autos   |CEDULA DE CIUDADANIA|1030765439|C000112407  |Bulk Producer Change|
