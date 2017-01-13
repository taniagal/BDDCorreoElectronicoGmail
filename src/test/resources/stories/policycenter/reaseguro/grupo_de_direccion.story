Grupo De Direccion

Meta:
@lote4
@issue #
@sprint 8
@tag automator: jonathan_mejia_leon
@local

Narrative:


Scenario: Validacion de calculos en porcentaje de contratos NO FACULTATIVOS 100%
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|10/10/1973      |EUGENIO      |BUSTAMANTE     |DIRECCION DE RESIDENCIA|CALLE 27a #60-68|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |
| Colombia| Antioquia   | Medellin | CR 45 30 30 | Fabricación de otros artículos textiles n.c.p|
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios           |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor Asegurable                 | 100000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
When ingrese a la opcion de reaseguro
Then se debe validar los valores del CP, monto retenido y cedido del contrato
And se debe validar los valores del EX


Examples:
|fechaInicioVigencia|
|01/01/2016         |