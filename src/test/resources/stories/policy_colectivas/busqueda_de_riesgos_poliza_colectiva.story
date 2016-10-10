Busqueda De Riesgos Poliza Colectiva

Meta:

@issue #CDSEG-2793
@tag automator: Jonathan Mejia, sprint:8
@Sprint 8
@local

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de buscar un riesgo de una póliza colectiva de Autos


Scenario: Buscar riesgo existente por placa
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
When vaya a consultar las transacciones de la poliza colectiva
And de clic en el numero de <poliza> de transacciones poliza colectiva
And de clic en riesgos
And realice la busqueda por la placa <placa>
Then debe listar la informacion del riesgo
| placa  | claseVehiculo        | modelo | marca| linea |
| BLE125 | Camperos y pickups   | 2016   | Mazda| MPV   |

Examples:
| numCuenta  | placa  | poliza   |
| C000888888 | BLE125 | 22221910 |

Scenario: Buscar riesgo no existente por placa
Given que voy a buscar la cuenta <numCuenta>
When vaya a consultar las transacciones de la poliza colectiva
And de clic en el numero de <poliza> de transacciones poliza colectiva
And de clic en riesgos
And realice la busqueda por la placa <placa>
Then debe generar error con el mensaje <mensaje>

Examples:
| numCuenta  | placa  | mensaje |
| C000888888 | BLE869 | El riesgo N.° BLE869 no se encuentra o no tiene permiso de acceso al mismo. |