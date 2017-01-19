Meta:
@lote1
@tag automator: juan_carlos_restrepo
@sprint 13

Narrative:
Se tiene una poliza expedida, al momento de realizar una modificación a un articulo con benefeiciario oneroso, se generan alertas.
Ademas se debe solicitar una autorización para expedir la modificación de una póliza con marca de RA especial.

Scenario: Modificación de artículo con beneficiario oneroso en el producto MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|10/10/1968      |ROGELIO         |QUINTERO        |DIRECCION DE RESIDENCIA|CALLE 2I #21-22|Antioquia   |Medellin|INT-3|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And Ingrese la entrada de las diferentes coberturas mrc
| TAB                      | TIPO_ARTICULO          | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Información de Artículos | Edificios              |                     |                  | Valor Reconstrucción                                                                 | 100000000      |
| Información de Artículos | Edificios              |                     | Danos materiales | Valor asegurado danos materiales                                                     | 100000000      |
| Información de Artículos | Maquinaria y equipo    |                     |                  | Valor Asegurable                                                                     | 100000000      |
| Información de Artículos | Maquinaria y equipo    |                     | Terremoto        | Valor asegurado terremoto,temblor de tierra,erupcion volcanica,tsunami y meremoto    |
And Ingresar interes adicional a cada cobertura
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe permitir expedir la poliza

Examples:
|tipo_documento |documento |cotizacion|tipoBeneficiario|cedula |
|NIT            |9202086744|33355337  |Oneroso         | 94537281|