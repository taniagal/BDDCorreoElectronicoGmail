Meta:
@lote4
@tag equipo: 1
@Sprint 13

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de buscar una poliza asociada a un contacto
Para ver el detalle de la misma

Scenario: Consultar polizas por numero de poliza no existente
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar una poliza
When la busco por numero de poliza <buscarNumeroPoliza>
Then debe mostrar el mensaje <mensaje>

Examples:
| buscarNumeroPoliza | mensaje                             |
| 34565456543        | La búsqueda no devolvió resultados. |


Scenario: Consulta sin resultados al ingresar poliza riesgo
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas con interes <documento><tipodocumento><tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios         |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
| Interes Adicional        | Interes Adicional |                     |                  | NULL                             | 00000          |
And expido la poliza
And voy a buscar la  poliza
Then debe mostrar el mensaje <mensaje>


Examples:
| numSubscripcion | documento  | tipoBeneficiario |  tipodocumento        | mensaje                             |
| 33355336        | 1060447895 | Asegurado        |  CEDULA DE CIUDADANIA |La búsqueda no devolvió resultados.  |

Scenario: Consulta de  poliza por numero de cuenta existente
When la busco por numero de cuenta <numeroCuenta>
Then se debe visualizar la siguiente información:
| numeroPoliza  | nombreAsegurado | numeroCuenta | producto                | estado   | fechaVigencia | fechaExpiracion | agente | tipoPoliza |
| TEST_33355481 | EVANS RENE      | C002888991   | Multiriesgo corporativo | Vigentes | 21/12/2016    | 21/12/2017      | SURA   | Colectiva  |

Examples:
| numeroCuenta |
| C002888991   |

Scenario: Consultar polizas por numero de cuenta existente
When la busco por numero de cuenta <numeroCuenta>
Then se debe visualizar la siguiente información:
| numeroPoliza  | nombreAsegurado                 | numeroCuenta | producto                | estado     | fechaVigencia | fechaExpiracion | agente | tipoPoliza        |
| TEST_22222222 | DORIAN STIWAR EASTMOND PULGARIN | C001888888   | Autos                   | Programado | 04/18/2016    | 10/18/2016      | SURA   | Póliza individual |
| TEST_22222236 | DORIAN STIWAR EASTMOND PULGARIN | C001888888   | Multiriesgo corporativo | Vigentes   | 20/11/2016    | 20/11/2017      | SURA   | Póliza individual |

Examples:
| numeroCuenta |
| C001888888   |

Scenario: Consultar polizas por numero de cuenta no existente
When la busco por numero de cuenta <numeroCuenta>
Then debe mostrar el mensaje <mensaje>

Examples:
| numeroCuenta | mensaje                             |
| 9988899988   | La búsqueda no devolvió resultados. |

Scenario: Consultar polizas solo por producto
When la busco por producto <producto>
Then debe mostrar el mensaje <mensaje>

Examples:
| producto | mensaje                                                          |
| Autos    | Se debe especificar al menos número de póliza o número de cuenta |

Scenario: Consultar polizas solo por agente
When la busco por agente <agente>
Then debe mostrar el mensaje <mensaje>

Examples:
| agente | mensaje                                                          |
| SURA   | Se debe especificar al menos número de póliza o número de cuenta |

Scenario: Consultar polizas solo por codigo agente
When la busco por codigo de agente <codigoAgente>
Then debe mostrar el mensaje <mensaje>

Examples:
| codigoAgente | mensaje                                                          |
| 4999         | Se debe especificar al menos número de póliza o número de cuenta |

Scenario: Consultar polizas por numero de cuenta y producto
When la busco por numero de cuenta <numeroCuenta> y producto <producto>
Then se debe visualizar la siguiente información:
| numeroPoliza  | nombreAsegurado                 | numeroCuenta | producto | estado     | fechaVigencia | fechaExpiracion | agente | tipoPoliza       |
| TEST_22222222 | DORIAN STIWAR EASTMOND PULGARIN | C001888888   | Autos    | Programado | 04/18/2016    | 10/18/2016      | SURA   | Póliza individual|

Examples:
| numeroCuenta | producto |
| C001888888   | Autos    |

Scenario: Consultar polizas por numero de cuenta y agente
When la busco por numero de cuenta <numeroCuenta> y agente <agente>
Then se debe visualizar la siguiente información:
| numeroPoliza  | nombreAsegurado                 | numeroCuenta | producto | estado     | fechaVigencia | fechaExpiracion | agente | tipoPoliza       |
| TEST_22222222 | DORIAN STIWAR EASTMOND PULGARIN | C001888888   | Autos    | Programado | 04/18/2016    | 10/18/2016      | SURA   | Póliza individual|

Examples:
| numeroCuenta | agente |
| C001888888   | SURA   |

Scenario: Consultar polizas por numero de cuenta  y codigo de agente
When la busco por numero de cuenta <numeroCuenta> y codigo de agente <codigoAgente>
Then se debe visualizar la siguiente información:
| numeroPoliza  | nombreAsegurado                 | numeroCuenta | producto | estado     | fechaVigencia | fechaExpiracion | agente | tipoPoliza       |
| TEST_22222222 | DORIAN STIWAR EASTMOND PULGARIN | C001888888   | Autos    | Programado | 04/18/2016    | 10/18/2016      | SURA   | Póliza individual|

Examples:
| numeroCuenta | codigoAgente |
| C001888888   | 4999         |

Scenario: Consultar polizas por numero de cuenta, producto y codigo de agente
When la busco por numero de cuenta <numeroCuenta>, producto <producto> y codigo de agente <codigoAgente>
Then se debe visualizar la siguiente información:
| numeroPoliza  | nombreAsegurado                 | numeroCuenta | producto | estado     | fechaVigencia | fechaExpiracion | agente | tipoPoliza       |
| TEST_22222222 | DORIAN STIWAR EASTMOND PULGARIN | C001888888   | Autos    | Programado | 04/18/2016    | 10/18/2016      | SURA   | Póliza individual|

Examples:
| numeroCuenta | producto | codigoAgente |
| C001888888   | Autos    | 4999         |

Scenario: Consultar polizas por numero de cuenta que no existe, producto y codigo de agente
When la busco por numero de cuenta <numeroCuenta>, producto <producto> y codigo de agente <codigoAgente>
Then debe mostrar el mensaje <mensaje>

Examples:
| numeroCuenta | producto | codigoAgente | mensaje                             |
| C001887545   | Autos    | 4999         | La búsqueda no devolvió resultados. |


Scenario: Consultar polizas por numero de cuenta que no existe y producto
When la busco por numero de cuenta <numeroCuenta> y producto <producto>
Then debe mostrar el mensaje <mensaje>

Examples:
| numeroCuenta | producto | mensaje                             |
| C001887456   | Autos    | La búsqueda no devolvió resultados. |

Scenario: Consultar polizas por numero de cuenta que no existe y agente
When la busco por numero de cuenta <numeroCuenta> y agente <agente>
Then debe mostrar el mensaje <mensaje>

Examples:
| numeroCuenta | agente | mensaje                             |
| C001887456   | SURA   | La búsqueda no devolvió resultados. |

Scenario: Consultar polizas por numero de cuenta  y codigo de agente no relacionado a la poliza
When la busco por numero de cuenta <numeroCuenta> y codigo de agente <codigoAgente>
Then debe mostrar el mensaje <mensaje>

Examples:
| numeroCuenta | codigoAgente      | mensaje                             |
| C001888888   | QA1PRODUCERCODE01 | La búsqueda no devolvió resultados. |