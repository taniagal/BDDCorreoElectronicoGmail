AjustePantallaPagosyValidaciones

Meta:
@issue #SUGWUSC-1162
@tag automatizador: danny_barrientos, informer:danny_barrientos, sprint:10
@LOB Multiriesgo corporativo
@Sprint 10
Narrative:
"Como usuario de Policy Center
requiero realizar validaciones en la pantalla de pagos  para una adecuada gestión de los cobros flotantes."



Scenario: Asignar tipo de Flotante (Multiriesgo)
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000112400|Sura        |Multiriesgo corporativo|Canal Tradicional|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
Examples:
||
||