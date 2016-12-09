Cotizacion MRC

Meta: @lote3

@issue #CDSEG-774
@tag automator: diego_cardona_acevedo
@local
@Sprint 3

Narrative:
Como usuario de Policy Center
Quiero porder solicitar una cotizacion
Asi ver los detalles de la cotizacion de una poliza MRC

Scenario: validacion de exclusividad en la cotizacion
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000777777|Sura        |Multiriesgo corporativo|Canal Tradicional|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And borro el articulo anterior
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
And voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
And seleccione el agente <agente>
And seleccione el producto <producto> para expedir la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And borro el articulo anterior
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
Then no debe permitir cotizar; se debe mostrar el mensaje de error <mensaje>

Examples:
|cuenta    |producto                |agente  |mensaje|
|C000777777|Multiriesgo corporativo |DIRECTO |ya tiene una cotización en curso para el producto seleccionado para la oficina SURA|