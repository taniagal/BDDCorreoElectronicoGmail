Busqueda De Riesgos Poliza Colectiva

Meta:

@issue #CDSEG-2793
@tag automator: Jonathan Mejia Leon, sprint:8
@Sprint 8
@local

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de buscar un riesgo de una póliza colectiva de Autos

Scenario: Buscar riesgo existente por placa buscar con minusculas
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
| C000888888 | ble125 | 22221910 |


Scenario: Buscar riesgo no existente por placa
Given que voy a buscar la cuenta <numCuenta>
When vaya a consultar las transacciones de la poliza colectiva
And de clic en el numero de <poliza> de transacciones poliza colectiva
And de clic en riesgos
And realice la busqueda por la placa <placa>
Then debe generar error con el mensaje <mensaje>

Examples:
| numCuenta  | poliza  | placa  | mensaje |
| C000888888 | 22221910| BLE869 | no se encuentra o no tiene permiso de acceso al mismo. |

Scenario: Listar todos los riesgos
Given que voy a buscar la cuenta <numCuenta>
When vaya a consultar las transacciones de la poliza colectiva
And de clic en el numero de <poliza> de transacciones poliza colectiva
And de clic en riesgos
And realice la busqueda por la placa <placa>
And de clic en listar todos los riesgos
Then debe listar los 5 riesgos de la poliza


Examples:
| numCuenta  | placa  |  poliza  |
| C000888888 | BLE123 | 22221910 |

Scenario: Validar accion en listar todos los riesgos cuando todos los riesgos ya estan listados
Meta: @manual
Given que voy a buscar una cuenta <numCuenta>
When vaya a consultar las transacciones en la poliza colectiva
And de clic en el numero de la poliza de transacciones poliza colectiva
And de clic en el boton riesgos
And de clic en el boton listar todos los riesgos
Then no se debe ejecutar ninguna accion

Examples:
| numCuenta  |  poliza  |
| C000888888 | 22221910 |

