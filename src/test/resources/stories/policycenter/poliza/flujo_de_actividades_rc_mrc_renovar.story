Meta:
@lote4
@tag equipo: 2
@Sprint 9

Narrative:
Como usuario de policy center quiero poder solicitar autorización a los comites de Riesgos consultables
quiero poder solicitar autorización a los comites de Riesgos consultables
para poder cotizar o expedir una poliza


Scenario: Validar que se genere actividad de riesgo consultable al renovar una poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C002888992|Multiriesgo corporativo|
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                                 |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Core de Seguros|Actividades de agencias de empleo temporal|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Danos     |
And cotice el articulo
And expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And ingrese a edificios y ubicaciones en renovacion de poliza
And intente ingresar una nueva ubicacion en renovacion de poliza
And ingrese las entradas en renovacion de poliza de las diferentes coberturas con interes <cedula><tipodocumento> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100000000      |
And se solicite aprobacion para los riesgos en renovacion de poliza
Then se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable en renovacion de poliza

Examples:
| rolUsuario | cedula  | tipoBeneficiario | tipodocumento        |
| Asesor     | 9876543 | Asegurado        | CEDULA DE CIUDADANIA |