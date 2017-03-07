Meta:
@lote1
@sprint 15
@tag equipo: 5

Narrative:
Como usuario de Policy Center con rol de agente, CSR, autorizador o gerente,
Quiero poder reviar el borrador de un cambio de poliza y comparar el cambio contra los valores previos
Para las polizas de multiriesgo corporativo

Scenario: Modificacion de poliza no financiada a financiada mrc
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C000777776|Multiriesgo corporativo|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And seleccione la opcion financiar poliza
And ingrese el numero de cuotas <numeroCuotas> a financiar
And cotice una poliza
Then se debe poder visualizar el valor de la cuota y el numero de cuotas a financiar
|informacionFinanciacion|
|11                     |
|$101.620,00 (COP)      |


