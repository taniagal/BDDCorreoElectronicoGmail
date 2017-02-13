Meta:
@lote2
@sprint 13
@tag equipo: 5

Narrative:
Como usuario de Policy Center con rol de agente, CSR, autorizador o gerente,
Quiero poder reviar el borrador de un cambio de poliza y comparar el cambio contra los valores previos
Para las polizas de mrc en policy center

Scenario: Comparacion de polizas al cambiar un dato por otro
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 08/12/1973       | MARIA         | OSPINA          | DIRECCION DE RESIDENCIA | CALLE 48F #25-83 | Antioquia    | Medellin | INT-3  |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion en edificios
| pais     | departamento | ciudad   | direccion   | actividadEconomica            |
| Colombia | Antioquia    | Medellin | CR 45 45 12 | Acabado de productos textiles |
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And intente ingresar una nueva ubicacion en edificios
| pais     | departamento | ciudad   | direccion   | actividadEconomica                    |
| Colombia | Antioquia    | Medellin | CR 63 77 65 | Actividades de apoyo a la agricultura |}
And validar mensaje de solo un riesgo por ubicacion
Then debe existir la comparacion entre datos de poliza existente y poliza nueva
Examples:
| rolUsuario |
|            |