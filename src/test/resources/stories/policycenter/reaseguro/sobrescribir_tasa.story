Meta:
@lote4
@sprint 9
@tag equipo: reaseguro
@local

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: scenario description
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1973      |EUGENIO      |BUSTAMANTE     |DIRECCION DE RESIDENCIA|CALLE 27a #60-68|Antioquia   |Medellin|INT-3 |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |
| Colombia| Antioquia   | Medellin | CR 45 70 30 | Fabricación de otros artículos textiles n.c.p|
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                     |                  | Valor Reconstrucción             | 2000000000     |
| Información de Artículos | Edificios           |                     | Danos materiales | Valor asegurado danos materiales | 2000000000     |
| Información de Artículos | Edificios           |                     | Terremoto        | Valor asegurado danos materiales | 2000000000     |
| Información de Artículos | Edificios           |                     | Asonada, motin, conmocion civil o popular, huelga, y actos mal intencionados de terceros y terrorismo | Valor asegurado danos materiales | 2000000000     |
And cotice una poliza
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
And Ingrese la información de un reasegurador
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Gross rate|50                     |1,8           |30                  |7                    |3                |
When ingrese los riesgos aplicables al acuerdo para cada una de las coberturas
Then se debe validar que algun objeto reasegurable tenga asociados los acuerdos facultativos <tipoContrato>
And la poliza debe recotizarce automaticamente y la tasa bruta comercial debe sobreescribirce

Examples:
|descripcionDeAcuerdo            |tipoContrato                    |
|Descripcion de acuerdo para test|Acuerdo facultativo proporcional|

