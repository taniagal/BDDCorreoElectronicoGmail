Meta:
@lote2
@sprint 14
@tag equipo: 5

Narrative:
Como usuario del negocio con el perfil de  Agente, CSR, Asegurador, o Gerente
Deseo poder visualizar el resumen de una informacion de la poliza de mrc
Para Verificar la informacion de la poliza visualizada de mrc

Scenario: verificacion de nuevos campos en resumen de poliza mrc con coaseguro
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 08/12/1973       | MARIA         | OSPINA          | DIRECCION DE RESIDENCIA | CALLE 48F #25-83 | Antioquia    | Medellin | INT-3  |
When puedo ingresar los datos del coaseguro
And agregue las aseguradoras y su porcentaje de participacion
|aseguradora     |participacion|
|Sura            |60           |
|ACE SEGUROS S.A.|40           |
And acepte el coaseguro
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion en edificios
| pais     | departamento | ciudad   | direccion   | actividadEconomica            |medioVenta|
| Colombia | Antioquia    | Medellin | CR 52 22a 12 | Acabado de productos textiles|Televentas|
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
Then verifico que se encuentren los siguientes datos
|txtTipoPlazo |txtPolizaFinaciada|
|Tipo de plazo|Póliza financiada |
And verifico los datos de coseguro
|lblAseguradora|lblParticipacion  |lblLider|lblTCoaseguro  |lblTpCoaseguro   |
|Aseguradora   |% de participación|Líder   |Tiene Coaseguro|Tipo de coaseguro|

Examples:
||
||