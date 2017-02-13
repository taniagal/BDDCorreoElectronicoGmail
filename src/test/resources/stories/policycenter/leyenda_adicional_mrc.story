Meta:
@lote2
@tag equipo: 5
@sprint 14

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder buscar elementos especificos asociados a una cuenta o directiva
Para poder usar un amplio conjunto de criterios de busqueda, con el fin ademas de encontrar una cuenta especifica,
una actividad, una transaccion de politica, una actividad, un codigo de productor etc.

Scenario: Validar campo leyenda adicional en poliza nueva
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| organizacion | producto                | tipo_documento       | numeroDocumento | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 1025963247      | 10/10/1974       | ANDREA        | GARABITO        | DIRECCION DE RESIDENCIA | CALLE 28F #60-68 | Antioquia    | Medellin | INT-3  |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And ingrese una leyenda adicional <leyendaAdicional>
And ingrese la entrada de las diferentes coberturas mrc
|TAB                      | TIPO_ARTICULO          | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                | VALOR_ENTRADAS |
|Información de Artículos | Edificios              |                     |                  | Valor Reconstrucción                    | 200000000      |
|Información de Artículos | Edificios              |                     | Danos materiales | Valor asegurado danos materiales        | 200000000      |
Then cotice y expida la poliza
Examples:
| envio    | departamento | ciudad   | direccion         | descripcion   | actividad                     | numCuenta  | razon   | numCotizacion | leyendaAdicional |
| 22222211 | Antioquia    | Medellin | CR 44 A # 45 - 00 | Edificio Core | Acabado de productos textiles | C002888989 | Cartera |               | leyenda          |

Scenario: Validar campo leyenda adicional en modificacion de poliza
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C000112402|Multiriesgo corporativo|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And intente ingresar una nueva ubicacion con <leyendaAdicional>
And ingrese las entradas en cambio de poliza de las diferentes coberturas
| TAB                      | TIPO_ARTICULO             | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Existencias Flotantes     |                     |                  | Valor asegurado máximo           | 100000000      |
| Información de Artículos | Existencias Flotantes     |                     |                  | Exposición promedio              | 10000          |
| Información de Artículos | Existencias Flotantes     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
Then cotice y expida la poliza
Examples:
|rolUsuario|leyendaAdicional|
|          |leyendas        |
