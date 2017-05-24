Meta:
@lote2
@tag equipo: reaseguro, sprint: 10
@local

Narrative:
como usario de policy center en reaseguro
con un perfil que tenga permisos quiero ser capaz crear acuerdo acuerdos facultativos con diferentes coberturas y tasas brutas de session correctas
para que la liquidacion de primas de reaseguro correctamente por cobertura

Scenario: Riesgos reasegurables por coberturas para contratos mrc con facultativos
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre   | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1973       | EUTIMIOTRIPASIO | MOSORONGO       | DIRECCION DE RESIDENCIA | CALLE 27a #60-68 | Antioquia    | Medellin | INT-3  |
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |medioVenta|
| Colombia| Antioquia   | Medellin | CR 45 70 30 | Fabricación de otros artículos textiles n.c.p|Televentas|
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas              |
| Building | 10000000000      | Terremoto,Danos,Asonada |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo con tasa comercial deseada <descripcionDeAcuerdo>
When Ingrese la información de los reaseguradores
| reasegurador                             | modalidad  | porcentajeParticipacion | valorReaseguro | comisionReasegurador | comisionIntermediario | comisionPromotora | porRetenido |
| Munchener Ruckversicherungs-Gesellschaft | Gross rate | 30                      | 1,2            | 0                    | 0                     | 0                 | 10          |
| General Reinsurance Corporation          | Net Rate   | 20                      | 1,28           | 18                   | 0                     | 0                 | 20          |
| Program                                  | Gross rate | 0                       | 0              | 0                    | 0                     | 0                 | 0           |
Then deben aparecer los riesgos reasegurables por cada cobertura:
| grupoDecoberturas | tasaBrutaDeCesionAutomatica | reaseguradores                           | tasaBrutaDeCesion |
| Daños materiales  | 0,215949                    | Munchener Ruckversicherungs-Gesellschaft | 0,404905          |
| Daños materiales  | 0,215949                    | General Reinsurance Corporation          | 0,539873          |
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1984       | HECTOR        | MORENO          | DIRECCION DE RESIDENCIA | CALLE 27a #60-68 | Antioquia    | Medellin | INT-3  |
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |medioVenta|
| Colombia| Antioquia   | Medellin | CR 46 70 30 | Fabricación de otros artículos textiles n.c.p|Televentas|
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas              |
| Building | 10000000000      | Terremoto,Danos,Asonada |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo con tasa comercial deseada <descripcionDeAcuerdo>
When Ingrese la información de los reaseguradores
| reasegurador                             | modalidad  | porcentajeParticipacion | valorReaseguro | comisionReasegurador | comisionIntermediario | comisionPromotora | porRetenido |
| Munchener Ruckversicherungs-Gesellschaft | Gross rate | 30                      | 1,2            | 0                    | 0                     | 0                 | 10          |
| General Reinsurance Corporation          | Net Rate   | 20                      | 1,28           | 18                   | 0                     | 0                 | 20          |
| Program                                  | Gross rate | 0                       | 0              | 0                    | 0                     | 0                 | 0           |
Then deben aparecer los riesgos reasegurables por cada cobertura:
| grupoDecoberturas | tasaBrutaDeCesionAutomatica | reaseguradores                           | tasaBrutaDeCesion |
| Terremoto         | 0,392051                    | Munchener Ruckversicherungs-Gesellschaft | 0,735095          |
| Terremoto         | 0,392051                    | General Reinsurance Corporation          | 0,980127          |
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1984       | JUAN C        | RESTREPO        | DIRECCION DE RESIDENCIA | CALLE 27a #60-68 | Antioquia    | Medellin | INT-3  |
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |medioVenta|
| Colombia| Casanare    | Pore     | CR 15 96 30 | Fabricación de otros artículos textiles n.c.p|Televentas|
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas                     |
| Machine  | 10000000000      | Terremoto,Danos,Asonada,Rotura |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo con tasa comercial deseada <descripcionDeAcuerdo>
When Ingrese la información de los reaseguradores
| reasegurador                             | modalidad  | porcentajeParticipacion | valorReaseguro | comisionReasegurador | comisionIntermediario | comisionPromotora | porRetenido |
| Munchener Ruckversicherungs-Gesellschaft | Gross rate | 30                      | 1,2            | 0                    | 0                     | 0                 | 10          |
| General Reinsurance Corporation          | Net Rate   | 20                      | 1,28           | 18                   | 0                     | 0                 | 20          |
| Program                                  | Gross rate | 0                       | 0              | 0                    | 0                     | 0                 | 0           |
Then deben aparecer los riesgos reasegurables por cada cobertura:
| grupoDecoberturas | tasaBrutaDeCesionAutomatica | reaseguradores                           | tasaBrutaDeCesion |
| Daños materiales  | 0,285319                    | Munchener Ruckversicherungs-Gesellschaft | 0,534972          |
| Daños materiales  | 0,285319                    | General Reinsurance Corporation          | 0,713296          |
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1984       | GABRIEL       | SILVA           | DIRECCION DE RESIDENCIA | CALLE 27a #60-68 | Antioquia    | Medellin | INT-3  |
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |medioVenta|
| Colombia| Casanare    | Pore     | CR 16 96 30 | Fabricación de otros artículos textiles n.c.p|Televentas|
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas                     |
| Machine  | 10000000000      | Terremoto,Danos,Asonada,Rotura |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo con tasa comercial deseada <descripcionDeAcuerdo>
When Ingrese la información de los reaseguradores
| reasegurador                             | modalidad  | porcentajeParticipacion | valorReaseguro | comisionReasegurador | comisionIntermediario | comisionPromotora | porRetenido |
| Munchener Ruckversicherungs-Gesellschaft | Gross rate | 30                      | 1,2            | 0                    | 0                     | 0                 | 10          |
| General Reinsurance Corporation          | Net Rate   | 20                      | 1,28           | 18                   | 0                     | 0                 | 20          |
| Program                                  | Gross rate | 0                       | 0              | 0                    | 0                     | 0                 | 0           |
Then deben aparecer los riesgos reasegurables por cada cobertura:
| grupoDecoberturas | tasaBrutaDeCesionAutomatica | reaseguradores                           | tasaBrutaDeCesion |
| AMIT              | 0,032                       | Munchener Ruckversicherungs-Gesellschaft | 0,06              |
| AMIT              | 0,032                       | General Reinsurance Corporation          | 0,08              |
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1984       | JENNIFER      | PEREZ           | DIRECCION DE RESIDENCIA | CALLE 27a #60-68 | Antioquia    | Medellin | INT-3  |
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |medioVenta|
| Colombia| Casanare    | Pore     | CR 17 96 30 | Fabricación de otros artículos textiles n.c.p|Televentas|
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas                     |
| Machine  | 10000000000      | Terremoto,Danos,Asonada,Rotura |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo con tasa comercial deseada <descripcionDeAcuerdo>
When Ingrese la información de los reaseguradores
| reasegurador                             | modalidad  | porcentajeParticipacion | valorReaseguro | comisionReasegurador | comisionIntermediario | comisionPromotora | porRetenido |
| Munchener Ruckversicherungs-Gesellschaft | Gross rate | 30                      | 1,2            | 0                    | 0                     | 0                 | 10          |
| General Reinsurance Corporation          | Net Rate   | 20                      | 1,28           | 18                   | 0                     | 0                 | 20          |
| Program                                  | Gross rate | 0                       | 0              | 0                    | 0                     | 0                 | 0           |
Then deben aparecer los riesgos reasegurables por cada cobertura:
| grupoDecoberturas | tasaBrutaDeCesionAutomatica | reaseguradores                           | tasaBrutaDeCesion |
| Terremoto         | 0,322681                    | Munchener Ruckversicherungs-Gesellschaft | 0,605028          |
| Terremoto         | 0,322681                    | General Reinsurance Corporation          | 0,806704          |

Examples:
| descripcionDeAcuerdo             |
| Descripcion de acuerdo para test |






