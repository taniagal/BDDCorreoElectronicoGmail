Meta:
@lote4
@issue #CDSEG-4393
@tag equipo: 5, sprint: 12
@local

Narrative:
Como usuario de negocio
Se requiere que al momento de validar si una persona requiere o no sarlaft, se realicen las siguientes excepciones:
en el caso de que alguna se cumpla no se debe solicitar Sarlaft para ninguna de las figuras asi se requiera,
tambien deseo que se aplique la validacion de sarlaft en la operacion modificacion es decir, se debe validar si se
requiere sarlaft o no para un tomador o asegurado que se adicione al momento de realizar una modificacion.


Scenario: Validar sarlaft en tomador-expedicion
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1973      |MARIA        |POBREZA        |DIRECCION DE RESIDENCIA|CALLE 27F #60-69|Antioquia   |Medellin|INT-3 |
When quiera agregar un tomador adicional que es riesgo consultable <tipo_documento> <documento>
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
Then expido la poliza y voy al archivo de poliza

Examples:
|departamento|ciudad  |direccion        |descripcion  |actividad                    |tipo_documento|documento  |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Acabado de productos textiles|NIT           |9202086744 |


Scenario: Validar sarlaft en tomador-modificacion
Meta:
@manual
Given estoy cotizando una poliza de multiriesgo:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1973      |OZIL         |SNEIDER        |DIRECCION DE RESIDENCIA|CALLE 27F #60-69|Antioquia   |Medellin|INT-3 |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
And expido la poliza y voy al archivo de poliza
And adicione un segundo tomador <tipoDocumento> <numeroDocumento>
And cotice una poliza
Then expido la poliza y voy al archivo de poliza

Examples:
|tipoDocumento |numeroDocumento  |
|NIT           |9202086744       |
