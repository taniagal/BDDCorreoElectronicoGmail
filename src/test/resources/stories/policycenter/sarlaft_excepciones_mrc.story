Sarlaft Excepciones Mrc

Meta:
@lote3
@issue #CDSEG-4393
@tag automator: tania_grajales_alzate
@local
@Sprint 12

Narrative:
Como usuario de negocio
Se requiere que al momento de validar si una persona requiere o no sarlaft, se realicen las siguientes excepciones:
en el caso de que alguna se cumpla no se debe solicitar Sarlaft para ninguna de las figuras asi se requiera,
tambien deseo que se aplique la validacion de sarlaft en la operacion modificacion es decir, se debe validar si se
requiere sarlaft o no para un tomador o asegurado que se adicione al momento de realizar una modificacion.

Scenario: Validar sarlaft en tomador
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc con documento:
|organizacion|producto               |canal            |tipo_documento      |documento |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|42213456  |10/10/1973     |LUCIANA      |LONDOÑO        |DIRECCION DE RESIDENCIA|CALLE 65F #60-69|Antioquia   |Medellin|INT-3 |
When adicione un segundo tomador que requiere sarlaft <tipoDocumento> <documento>
And agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And quiera agregar un tomador adicional que es riesgo consultable <cedula>
And descripcion <descripcion>, actividad economica <actividad>
When seleccione la cobertura:
|valorReconstruccion|valorAsegurado|valorComercial|cobertura|
|100000000          |100000000     |null          |Terremoto|
And cotice el articulo
Examples:
|departamento|ciudad  |direccion        |descripcion  |actividad                    |tipoDocumento|documento      |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Acabado de productos textiles|NIT          |9202086744     |

