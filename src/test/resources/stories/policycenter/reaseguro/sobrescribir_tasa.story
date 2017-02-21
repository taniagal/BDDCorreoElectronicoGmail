Meta:
@lote4
@sprint 9
@tag equipo: reaseguro
@local

Narrative:
como usuario de policycenter en reaseguro
deseo que cambien las tasas al momento de recotizar
para poder asegurar los valores al momento de tener una actividad economica de alto riesgo para SURAMERICANA.

Scenario: Validacion de cambio de tasa al recotizar poliza automaticamente
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1973      |EUGENIO      |BUSTAMANTE     |DIRECCION DE RESIDENCIA|CALLE 27a #60-68|Antioquia   |Medellin|INT-3 |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |
| Colombia| Antioquia   | Medellin | CR 45 70 30 | Fabricación de otros artículos textiles n.c.p|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas             |
|Building |100000000       |Danos,Asonada,Terremoto|
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
And Ingrese la información de un reasegurador
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Gross rate|100                    |1,8           |30                  |7                    |3                |
Then se debe validar que algun objeto reasegurable tenga asociados los acuerdos facultativos <tipoContrato>

Examples:
|descripcionDeAcuerdo            |tipoContrato                    |
|Descripcion de acuerdo para test|Acuerdo facultativo proporcional|

