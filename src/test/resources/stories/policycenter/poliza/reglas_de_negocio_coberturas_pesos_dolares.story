
Meta:
@lote1
@tag automator: juan_carlos_restrepo
@issue #CDSEG-764
@sprint 13

Scenario: Validar el monto maximo permitido para algunas coberturas en el producto MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| organizacion | producto                | canal             | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion       | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo | Canal Tradicional | CEDULA DE CIUDADANIA | 10/10/1968       | LOCO          | QUINTERO        | DIRECCION DE RESIDENCIA | CALLE 2I #21-22 | Antioquia    | Medellin | INT-3  |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO                       | COBERTURA                                      | ENTRADAS                                                                                          | VALOR_ENTRADAS |
| Información de Artículos | Maquinaria y equipo                 |                                                | Valor Asegurable                                                                                  | 100000000      |
| Información de Artículos | Maquinaria y equipo                 | Terremoto                                      |                                                                                                   | 100000000      |
| Información de Artículos | Maquinaria y equipo                 | Rotura de maquinaria                           |                                                                                                   | 100000000      |
| Información de Artículos | Existencias Flotantes               |                                                | Valor asegurado máximo                                                                            | 4432350000     |
| Información de Artículos | Existencias Flotantes               | Danos materiales                               | Valor asegurado danos materiales                                                                  | 4432350000     |
| Información de Artículos | Existencias fijas                   |                                                | Valor Asegurable                                                                                  | 4432350001     |
| Información de Artículos | Existencias fijas                   | Danos materiales                               | Valor asegurado danos materiales                                                                  | 4432350001     |
| Coberturas del Riesgo    |                                     | Danos materiales                               | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria                          | 8864700001     |
| Coberturas del Riesgo    |                                     | Todo riesgo construcción y todo riesgo montaje | Valor asegurado todo riesgo construccion y/o todo riesgo montaje dentro de los predios asegurados | 5915800000     |
| Otros Articulos          | Maquinaria y equipo de contratistas |                                                | Valor Asegurable                                                                                  | 1477450001     |
| Otros Articulos          | Maquinaria y equipo de contratistas |                                                | Índice variable                                                                                   | 1              |
| Otros Articulos          | Maquinaria y equipo de contratistas | Danos materiales                               | Valor asegurado danos materiales                                                                  | 1477450001     |
And muestre los mensajes de advertencia para las reglas de coberturas
|mensaje1|mensaje2|
|El valor asegurado del sublimite Deterioro de bienes refigerados por rotura maquinaria en la cobertura de Daños materiales debe ser menor a $8.864.700.000,00 (COP) (US$3.000.000,00).^|El límite de la cobertura todo riesgo construcción y/o montaje dentro de los predios asegurados debe ser máximo $5.909.800.000,00 (COP) (US$2.000.000,00).|
And cotice una poliza
And muestre los mensajes de advertencia para las reglas de coberturas
|mensaje1|mensaje2|mensaje3|
|El valor asegurado del sublimite Deterioro de bienes refigerados por rotura maquinaria en la cobertura de Daños materiales debe ser menor a $8.864.700.000,00 (COP) (US$3.000.000,00).^|El límite de la cobertura todo riesgo construcción y/o montaje dentro de los predios asegurados debe ser máximo $5.909.800.000,00 (COP) (US$2.000.000,00).^|La sumatoria de los valores asegurables de los artículos maquinaria y equipo contratistas de toda la póliza debe ser menor o igual a $1.477.450.000,00 (COP) (US$500.000,00).|
And cotice y expida la poliza

Examples:
| |
| |


Scenario: Validacion deducible terremoto del 2% en expedicion de poliza MRC
Given estoy cotizando una poliza de mrc:
| organizacion | producto                | canal             | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion       | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo | Canal Tradicional | CEDULA DE CIUDADANIA | 10/10/1968       | MARIANA       | PAJON           | DIRECCION DE RESIDENCIA | CALLE 2I #21-22 | Antioquia    | Medellin | INT-3  |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | COBERTURA | ENTRADAS                                                                                  | VALOR_ENTRADAS |
| Información de Artículos | Maquinaria y equipo |           | Valor Asegurable                                                                          | 11819600000    |
| Información de Artículos | Maquinaria y equipo | Terremoto |                                                                                           | 11819600000    |
| Información de Artículos | Maquinaria y equipo | Terremoto | Deducible porcentual terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 2              |
And haga clic en el boton Aceptar
And muestre los mensajes de advertencia para las reglas de coberturas
|mensaje1|
|Para aplicar un deducible del 2% del valor asegurable a la cobertura de terremoto, el valor asegurable total del predio debe ser mayor a $11.819.600.000,00 (COP) (US$4.000.000,00).|

Examples:
| mensajes   |                                                                                                                                                                          |
|  |