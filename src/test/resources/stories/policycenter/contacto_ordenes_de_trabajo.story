Contacto Ordenes De Trabajo

Meta: @lote3

@issue #CDSEG-875
@tag automator: eliana_alvarez, sprint:1
@Sprint 1
@local

Narrative:
Como usuario
Quiero ser capaz de ver la informacion de nivel de contacto
para obtener información de órdenes de trabajo


Scenario: Ver informacion de las transacciones asociadas al contacto
GivenStories: stories/policycenter/login_policy.story
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones por estado <filtroEstado>
Then debe mostrarme el listado de transacciones con su respectiva informacion: numero de poliza <poliza>, producto <producto>, transaccion <transaccion>, tipo <tipo>, estado <estado>, participante <participante>

Examples:
| tipoContacto         | nombre | apellido | filtroEstado | poliza        | producto | transaccion | tipo       | estado   | participante |
| CEDULA DE CIUDADANIA | DORIAN | EASTMOND | Completo     | TEST_22222222 | Autos    | 22222222    | Cotización | Expedida | Super User   |

Scenario: Ver informacion de transacciones sin registros
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones del contacto
Then se muestra el mensaje informativo de transaccion no encontrada <mensaje>

Examples:
| tipoContacto         | nombre | apellido | mensaje                                      |
| CEDULA DE CIUDADANIA | Ray    | Newton   | El contacto no tiene transacciones asociadas |

Scenario: Ver informacion filtrada por estado
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones por estado <filtroEstado>
Then debe mostrarme el listado de transacciones filtradas por estado <filtroEstado>

Examples:
| tipoContacto         | nombre | apellido | filtroEstado |
| CEDULA DE CIUDADANIA | DORIAN | EASTMOND | Completo     |

Scenario: Ver informacion filtrada por tipo de transaccion
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones por estado <filtroEstado>
And consulte las transacciones por tipo de transaccion <filtroTransaccion>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroTransaccion>

Examples:
| tipoContacto         | nombre | apellido | filtroEstado | filtroTransaccion |
| CEDULA DE CIUDADANIA | DORIAN | EASTMOND | Todos        | Cotización        |

Scenario: Ver informacion filtrada por producto
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones por estado <filtroEstado>
And consulte las transacciones por tipo de transaccion <filtroTransaccion>
And consulte las transacciones por tipo de transaccion <filtroProducto>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroProducto>

Examples:
| tipoContacto         | nombre | apellido | filtroEstado | filtroTransaccion | filtroProducto |
| CEDULA DE CIUDADANIA | Dorian | Eastmond | Todos        | Todos             | Autos          |

Scenario: validar que no se visualizan polizas hijas de una colectiva
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones del contacto
Then no debo ver la poliza <transaccion> asociada a una colectiva en las transacciones del contacto

Examples:
| tipoContacto         | nombre   | apellido | transaccion |
| CEDULA DE CIUDADANIA | Yurledys | Gallego  | 34222225    |
