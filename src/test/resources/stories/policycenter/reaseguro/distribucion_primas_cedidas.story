Meta:
@lote1
@tag equipo: reaseguro
@local

Narrative:
como usario de policy center
con un perfil que tenga permisos quiero ser capaz ver la distribución de las primas cedidas,
para contratos mrc con reaseguro y facultativos


Scenario: Distribucion de primas cedidas para contratos con facultativos
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1984      |KAROLINA     |BUENDIA        |DIRECCION DE RESIDENCIA|CALLE 19b #69-69|Antioquia   |Medellin|INT-3 |
And ingrese la Fecha Inicio Vigencia: 01/02/2017
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad    | direccion             | actividadEconomica                            | medioVenta |
| Colombia| Casanare    | La Salina | AVENIDAS 37 # 22 - 33 | Fabricación de otros artículos textiles n.c.p | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas                     |
| Machine  | 10000000000      | Danos,Asonada,Terremoto,Rotura |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo con tasa comercial deseada <descripcionDeAcuerdo>
When Ingrese la información de los reaseguradores
| reasegurador                             | modalidad  | porcentajeParticipacion | valorReaseguro | comisionReasegurador | comisionIntermediario | comisionPromotora | porRetenido |
| Munchener Ruckversicherungs-Gesellschaft | Gross rate | 30                      | 1,2            | 0                    | 0                     | 0                 | 0           |
| General Reinsurance Corporation          | Gross rate | 20                      | 1,6            | 0                    | 0                     | 0                 | 0           |
| Program                                  | Gross rate | 0                       | 0              | 0                    | 0                     | 0                 | 0           |
And expido la poliza mrc
And expido la poliza mrc
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And expido la poliza mrc
And capturo el numero de poliza 1
When quiera visualizar la informacion completa de las primas cedidas <nombreTarea> <estado> <procesoPoliza>
And quiera ingresar al consolidado de primas cedidas
Then se debe verificar el consolidado de las primas cedidas con bandera: CREACION POLIZA y data:
| riesgo           | tipoContrato        | primaBrutaCedida |
| AMIT             | Excedente           | $32.000 (COP)    |
| AMIT             | Cuota parte         | $108.800 (COP)   |
| AMIT             | Acuerdo facultativo | $340.000 (COP)   |
| Daños materiales | Excedente           | $285.320 (COP)   |
| Daños materiales | Cuota parte         | $970.085 (COP)   |
| Daños materiales | Acuerdo facultativo | $3.031.509 (COP) |
| Terremoto        | Excedente           | $322.681 (COP)   |
| Terremoto        | Cuota parte         | $1.226.187 (COP) |
| Terremoto        | Acuerdo facultativo | $3.428.492 (COP) |
Given se va a consultar poliza expedida 1
And modifico la fecha de vigencia <fechaModificacion>
When seleccione la opcion siguiente en la modificacion
And ingrese las entradas en cambio de poliza de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA            | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Maquinaria y equipo |                     |                      | Valor Asegurable                 | 20000000000    |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales     | Valor asegurado danos materiales | 20000000000    |
| Información de Artículos | Maquinaria y equipo |                     | Terremoto            | Valor asegurado terremoto        | 20000000000    |
| Información de Artículos | Maquinaria y equipo |                     | Asonada, motin       | Valor asegurado asonada, motin   | 20000000000    |
| Información de Artículos | Maquinaria y equipo |                     | Rotura de maquinaria | Valor asegurado daño interno     | 20000000000    |
And cotice y expida la poliza
And ingrese al resumen de la poliza expedida
And quiera visualizar la informacion de las primas cedidas nameTarea: PremiumCeding, state: SHIFT
Given se va a consultar poliza expedida 1
When de clic al menu reaseguro
And quiera ingresar a ver primas cedidas: MODIFICACION POLIZA
And quiera ingresar al consolidado de primas cedidas
Then se debe verificar el consolidado de las primas cedidas con bandera: MODIFICACION POLIZA y data:
| riesgo           | tipoContrato        | primaBrutaCedida |
| AMIT             | Excedente           | $147.726 (COP)   |
| AMIT             | Cuota parte         | $0 (COP)         |
| AMIT             | Acuerdo facultativo | $313.918 (COP)   |
| Daños materiales | Excedente           | $1.317.157 (COP) |
| Daños materiales | Cuota parte         | -$1 (COP)        |
| Daños materiales | Acuerdo facultativo | $2.798.952 (COP) |
| Terremoto        | Excedente           | $1.489.638 (COP) |
| Terremoto        | Cuota parte         | $1 (COP)         |
| Terremoto        | Acuerdo facultativo | $3.165.485 (COP) |
When de clic al link volver a reaseguro
And ingrese los motivos de cancelacion de la poliza Motivo: Por petición del cliente, Descripción: Prueba cancelacion de poliza
And ingrese la fecha vigente de cancelacion <fechaCancelacion>
And inicie la cancelacion de la poliza con facultativo
Then se realiza la cancelacion
When ingrese al resumen de la poliza expedida
And quiera visualizar la informacion de las primas cedidas nameTarea: PremiumCeding, state: SHIFT
Given se va a consultar poliza expedida 1
When de clic al menu reaseguro
And quiera ingresar a ver primas cedidas: CANCELACION POLIZA
And quiera ingresar al consolidado de primas cedidas
Then se debe verificar el consolidado de las primas cedidas con bandera: CANCELACION POLIZA y data:
| riesgo           | tipoContrato        | primaBrutaCedida |
| AMIT             | Excedente           | -$16.833 (COP)   |
| AMIT             | Cuota parte         | -$9.539 (COP)    |
| AMIT             | Acuerdo facultativo | -$59.616 (COP)   |
| Daños materiales | Excedente           | -$150.086 (COP)  |
| Daños materiales | Cuota parte         | -$85.048 (COP)   |
| Daños materiales | Acuerdo facultativo | -$531.551 (COP)  |
| Terremoto        | Excedente           | -$169.739 (COP)  |
| Terremoto        | Cuota parte         | -$107.501 (COP)  |
| Terremoto        | Acuerdo facultativo | -$601.161 (COP)  |
When de clic al link volver a reaseguro
When ingrese los motivos de rehabilitacion de la poliza Motivo: Otro, Descripción: Prueba rehabilitacion de poliza
And realice la rehabilitacion de la poliza
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And de clic a rehabilitar poliza
Then se genera la rehabilitacion expedida
When ingrese al resumen de la poliza expedida
And quiera visualizar la informacion de las primas cedidas nameTarea: PremiumCeding, state: SHIFT
Given se va a consultar poliza expedida 1
When de clic al menu reaseguro
And quiera ingresar a ver primas cedidas: REHABILITACION POLIZA
And quiera ingresar al consolidado de primas cedidas
Then se debe verificar el consolidado de las primas cedidas con bandera: REHABILITACION POLIZA y data:
| riesgo           | tipoContrato        | primaBrutaCedida |
| AMIT             | Excedente           | $16.833 (COP)    |
| AMIT             | Cuota parte         | $9.539 (COP)     |
| AMIT             | Acuerdo facultativo | $59.616 (COP)    |
| Daños materiales | Excedente           | $150.086 (COP)   |
| Daños materiales | Cuota parte         | $85.048 (COP)    |
| Daños materiales | Acuerdo facultativo | $531.551 (COP)   |
| Terremoto        | Excedente           | $169.739 (COP)   |
| Terremoto        | Cuota parte         | $107.501 (COP)   |
| Terremoto        | Acuerdo facultativo | $601.161 (COP)   |

Examples:
| descripcionDeAcuerdo     | nombreTarea   | estado  | fechaModificacion | procesoPoliza   | fechaCancelacion |
| Acuerdo Prueba Reaseguro | PremiumCeding | CONTROL | 01/03/2017        | CREACION POLIZA | 31/12/2017       |