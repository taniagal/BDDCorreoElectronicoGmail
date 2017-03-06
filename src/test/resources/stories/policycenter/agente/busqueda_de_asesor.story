Meta:
@lote 1
@tag equipo: 1, sprint 15

Narrative:
Usuario de policy center
Quiero poder buscar un asesor por codigo y/o descripcion
Para consultar la informacion correspondiente a un asesor

Scenario: validar campos ocultos y la busqueda por codigo de asesor
GivenStories: stories/policycenter/login_policy.story
Given estoy en la busqueda de agentes
When valide los campos de la pantalla
And ingrese un codigo de un asesor <codigoAsesor>
Then debo ver la informacion del agente a continuacion
| codigoAsesor | nombreAsesor                              | estado | organizacion | codigoSucursal | sucursal                    |
| 1681         | SANCHEZ*PULGARIN CQLII**MARIA ANA CECILIA | Active | SURA         | 114            | ASESORES EN DESARROLLO CALI |

Examples:
| codigoAsesor |
| 1681         |

Scenario: validar la busqueda por nombre de asesor
Given estoy en la busqueda de agentes
When ingrese el nombre de un asesor <nombreAsesor>
Then debo ver la informacion del agente a continuacion
| codigoAsesor | nombreAsesor                              | estado | organizacion | codigoSucursal | sucursal                    |
| 1681         | SANCHEZ*PULGARIN CQLII**MARIA ANA CECILIA | Active | SURA         | 114            | ASESORES EN DESARROLLO CALI |

Examples:
| nombreAsesor                              |
| SANCHEZ*PULGARIN CQLII**MARIA ANA CECILIA |

Scenario: validar la busqueda por nombre de asesor y codigo asesor
Given estoy en la busqueda de agentes
When ingrese un codigo de un asesor <codigoAsesor>
And ingrese el nombre de un asesor <nombreAsesor>
Then debo ver la informacion del agente a continuacion
| codigoAsesor | nombreAsesor | estado | organizacion | codigoSucursal | sucursal                    |
| 193          | ASESOR MARIA | Active | SURA         | 114            | ASESORES EN DESARROLLO CALI |

Examples:
| codigoAsesor | nombreAsesor |
| 193          | ASESOR MARIA |

Scenario: validar mensaje cuando ingreso un codigo de asesor que no existe
Given estoy en la busqueda de agentes
When ingrese un codigo de un asesor <codigoAsesor>
Then debo ver el mensaje <mensaje> indicando al usuario lo sucedido

Examples:
| codigoAsesor | mensaje                             |
| ABA111       | La búsqueda no devolvió resultados. |

Scenario: validar mensaje cuando ingreso un nombre de asesor que no existe
Given estoy en la busqueda de agentes
When ingrese el nombre de un asesor <nombreAsesor>
Then debo ver el mensaje <mensaje> indicando al usuario lo sucedido

Examples:
| nombreAsesor | mensaje                             |
| PEPITO PEREZ | La búsqueda no devolvió resultados. |

Scenario: validar la busqueda por nombre de asesor y codigo asesor con alguno de los filtros inconsistente
Given estoy en la busqueda de agentes
When ingrese un codigo de un asesor <codigoAsesor>
And ingrese el nombre de un asesor <nombreAsesor>
Then debo ver el mensaje <mensaje> indicando al usuario lo sucedido

Examples:
| codigoAsesor | nombreAsesor | mensaje                             |
| PPP111       | ASESOR MARIA | La búsqueda no devolvió resultados. |

Scenario: validar mensaje cuando no ingreso por lo menos un filtro de busqueda
Given estoy en la busqueda de agentes
When no ingreso ningun filtro para la consulta
Then debo ver el mensaje <mensaje> indicando al usuario lo sucedido

Examples:
| mensaje                                                |
| Ingresar ya sea nombre de asesor o un código de asesor |