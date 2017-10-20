Meta:
@lote3
@Story CDSPDN-938
@tag equipo:

Narrative:
Como usuario de Policy Center deseo que al realizar una póliza GMAC,
pueda obtener en pantalla(información de vehículo) la lista de los concesionarios
chévrolet por marca y clase. La póliza al ser expedida quede con esta información y
al momento de un siniestro por perdida total o parcial  se direccione al taller o concesionario
por politicas del convenio firmado GMAC.

Scenario: Listar concesionarios para convenio GMAC, ruta exitosa, cotizando poliza
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente y la oficina de radicacion:
|oficina|agente_oficina            |
|41002  |ANGARITA HERMANOS LTDA. CQLII|
When seleccione el producto <producto> para expedir la poliza
And seleccione el tipo de poliza:
|tipoPoliza|
|Individual|
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |medioVenta|
|random|2011  |01601225        |MEDELLIN          |Particular       |CHASIS1  |MOTOR1 |19400000      |null     |null   |2   |Producto GMAC|Televentas|
And ingrese las coberturas a vehiculo:
| limite | deducible | AS             |
| 1.040 | 0         | Asistencia Gmac |
And cotice una poliza
And expido la poliza mrc sin facultativo
And expido la poliza mrc sin facultativo
And ingrese al resumen de la poliza expedida
Then verificar oficina de radicacion <oficinagmac>
Examples:
|numCuenta |producto|tipo_documento      |documento |numeroCuenta|nombreProceso       |oficinagmac|
|1286169566|Autos   |CEDULA DE CIUDADANIA|70104445|1286169566  |Bulk Producer Change  |41002 > OFICINA GMAC|


Scenario: Listar concesionarios para convenio GMAC. Validando mensaje sin seleccionar convenio y cotizando poliza
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente y la oficina de radicacion:
|oficina|agente_oficina            |
|41002  |ANGARITA HERMANOS LTDA. CQLII|
When seleccione el producto <producto> para expedir la poliza
And seleccione el tipo de poliza:
|tipoPoliza|
|Individual|
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |medioVenta|
|random|2011  |01601225        |MEDELLIN          |Particular       |CHASIS1  |MOTOR1 |19400000      |null     |null   |2   |Producto GMAC|Televentas|
And ingrese las coberturas a vehiculo:
| limite | deducible | AS             |
| 1.040 | 0         | Asistencia Gmac |
And cotice una poliza
Then verificar mensaje de concesionario
Examples:
|numCuenta |producto|tipo_documento      |documento |numeroCuenta|nombreProceso       |
|1286169566|Autos   |CEDULA DE CIUDADANIA|70104445|1286169566  |Bulk Producer Change  |


