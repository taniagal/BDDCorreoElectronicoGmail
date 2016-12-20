Cotizacion Renovacion Pa

Meta: @lote2

@issue #CDSEG-842
@tag automator: diego_cardona_acevedo
@local
@Sprint 6

Narrative:
Como usuario de policy center
Quiero poder realizar la cotizacion de la renovacion de una poliza de personal autos ya sea de forma manual o automatica

Scenario: Validar la informacion del detalle de la cotizacion
GivenStories: stories/policycenter/login_policy.story
Given se ha realizado la renovacion de la cotizacion <cotizacion>
When ingrese revisar la cotizacion
Then se debe mostrar la informacion del detalle de cotizacion por riesgo, donde se muestre:
|placa  |modelo |codigoFasecolda |marca |linea |
|BLE960 |2016   |52525252        |AUDI  |TT 8S 2.0 TFSI CO - TP 2000CC T |
And en el detalle por coberturas mostrar:
| cobertura                          | terminoCobertura | prima       | subtotal            | subtotalPrimas      |
| Cobertura de Responsabilidad Civil | 32.000.000       | $254.396,00 | $1.435.051,00 (COP) | $1.435.051,00 (COP) |
And se debe ver la direccion del tomador de la poliza la cual se indico como principal
| direccion                            |
| CR 65 # 48 - 162, MEDELLIN, Colombia |
And se debe mostrar en la columna Termino el limite o deducible de la cobertura en el caso de que aplique
|limite     |deducible |
|32.000.000 |0         |
And se debe mostrar la informacion general de la poliza cotizada con los siguientes datos:
| numeroPoliza  | numeroRenovacion | tomador          | tipoDocumento        | numeroDocumento | direccion                            | tipoDireccion           | descripcionDireccion                       | empresaAseguradora        | primaTotal          | iva               | costoTotal          |
| TEST_22222122 | 22222333         | JOSE PAEZ ALZATE | CEDULA DE CIUDADANIA | 9876543         | CR 65 # 48 - 162, MEDELLIN, Colombia | DIRECCION DE RESIDENCIA | Created by the Address Builder with code 0 | Acme Low Hazard Insurance | $1.435.051,00 (COP) | $229.608,00 (COP) | $1.664.659,00 (COP) |

Examples:
|cotizacion |
|22222333   |