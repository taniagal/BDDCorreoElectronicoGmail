Meta:
@lote3
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
| pais    | departamento| ciudad   | direccion             | actividadEconomica                            | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 13 # 22 - 33 | Fabricación de otros artículos textiles n.c.p | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas              |
| Machine  | 10000000000      | Danos,Asonada,Terremoto |
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
And quiera visualizar la informacion completa de las primas cedidas <nombreTarea>

Examples:
| descripcionDeAcuerdo     | nombreTarea   |
| Acuerdo Prueba Reaseguro | PremiumCeding |