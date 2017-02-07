Meta:
@tag equipo: 3
@lote3
@Sprint 13

Narrative:
Como usuario de policyCenter
Quiero ingresar el valor comercial del articulo edificio en las pólizas de MRC
Para poder aplicar coberturas, cuando se tenga valor comercial en el edificio, al seleccionar las coberturas que le aplican a este, en el valor asegurado, venga predeterminado el valor ingresado en Valor comercial y no el de valor de reconstrucción como funciona actualmente.


Scenario: El valor asegurado de las coberturas del edificio debe venir por defecto el Valor comercial
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1968      |MARCELA      |TORRES   |DIRECCION DE RESIDENCIA|CALLE 2I #21-22|Antioquia    |Medellin|INT-3|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas mrc
| TAB                      | TIPO_ARTICULO               | OTRO_ARTICULO_OTROS | COBERTURA  | ENTRADAS             | VALOR_ENTRADAS |
| Información de Artículos | Edificios                   |                     |            | Valor Reconstrucción | 100000000      |
And ingresar valor comercial de cobertura <valorcomercial>
Then verificar el valor asegurado de las coberturas debe venir por defecto el valor comercial

Examples:
|valorcomercial|valorIndice|
|200000000     | 10        |