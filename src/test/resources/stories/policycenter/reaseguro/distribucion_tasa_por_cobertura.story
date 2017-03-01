Meta:

Narrative:
como usario de policy center en reaseguro
con un perfil que tenga permisos quiero ser capaz crear acuerdo acuerdos facultativos con diferentes coberturas y tasas brutas de session correctas
para que la liquidacion de primas de reaseguro correctamente por cobertura

Scenario: scenario description
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1973      |EUGENIO      |BUSTAMANTE     |DIRECCION DE RESIDENCIA|CALLE 27a #60-68|Antioquia   |Medellin|INT-3 |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |medioVenta|
| Colombia| Antioquia   | Medellin | CR 45 70 30 | Fabricación de otros artículos textiles n.c.p|Televentas|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas             |
|Building |10000000000     |Danos,Asonada,Terremoto|
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
And Ingrese la información de un reasegurador
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|porRetenido|
|Gross rate|20                     |1,8           |30                  |7                    |3                |10         |
|Net Rate  |30                     |1,65          |10                  |7                    |2                |20         |
||


