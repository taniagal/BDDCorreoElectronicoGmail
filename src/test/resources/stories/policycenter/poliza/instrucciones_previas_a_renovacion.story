Instrucciones previas a renovacion
Meta: @lote4

Narrative:
las Instrucciones previas a la renovación que se quieren para el producto multirriesgo corporativo son :
-Consultar Suscriptor (asignar a)
-Consultar Gerente Regional / Comercial (asignar a)
-No tomada
-No renovable (razon de no renovación)
-No renovable y consultar asegurador (asignar a y razón de no renovación)

Las opciones de no renovación para las opciones No renovable deben ser:
- Siniestralidad o resultado de la cuenta
- Apectos técnicos
- Riesgo no objetivo
- Reaseguro insuficiente
- No cumple condiciones de licitación

Las opciones de no renovación para las opciones No tomada deben ser:
- Se asegura con otra compañía
- Costo de la póliza

Las demás funciones se dejan  como vienen de caja GW y no requiere cambios.

Scenario: 1 Validacion que existan todas las instrucciones esperadas
Meta: @lote4
@Story CDSEG-907
@URL https://jira.suramericana.com.co/browse/CDSEG-907
@tag automator:andres_alarcon_guerrero, informer:juan_esteban_restrepo, sprint:7
@Sprint 7

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When desee seleccionar instrucciones previas a la renovacion
Then espero ver las opciones de instrucciones siguientes
| INSTRUCCIONES                          |
| Consultar Gerente Regional / Comercial |
| Consultar Suscriptor                   |
| No renovable                           |
| No renovable y consultar al asegurador |
| No tomada                              |

Examples:
| numPoliza     | rolUsuario | descripcion |
| TEST_22222236 | Asesor     |             |


Scenario: 2 Validacion que existan todas las razones de No renovable
Meta: @lote4
@Story CDSEG-907
@URL https://jira.suramericana.com.co/browse/CDSEG-907
@tag automator:andres_alarcon_guerrero, informer:juan_esteban_restrepo, sprint:7
@Sprint 7

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When desee seleccionar instrucciones previas a la renovacion
And seleccione instruccion No renovable previa a la renovacion
And despliegue Razón de no renovación
Then debe visualizarse las siguientes razones
| RAZONES                                 |
| Aspectos técnicos                       |
| No cumple condiciones de licitación     |
| Reaseguro insuficiente                  |
| Riesgo no objetivo                      |
| Siniestralidad o resultado de la cuenta |

Examples:
| numPoliza     | rolUsuario | descripcion |
| TEST_22222236 | Asesor     |             |

Scenario: 3 Validacion que existan todas las razones de No renovable y consultar al asegurador
Meta: @lote4
@Story CDSEG-907
@URL https://jira.suramericana.com.co/browse/CDSEG-907
@tag automator:andres_alarcon_guerrero, informer:juan_esteban_restrepo, sprint:7
@Sprint 7

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When desee seleccionar instrucciones previas a la renovacion
And seleccione instruccion No renovable y consultar al asegurador previa a la renovacion
And despliegue Razón de no renovación
Then debe visualizarse las siguientes razones
| RAZONES                                 |
| Aspectos técnicos                       |
| No cumple condiciones de licitación     |
| Reaseguro insuficiente                  |
| Riesgo no objetivo                      |
| Siniestralidad o resultado de la cuenta |

Examples:
| numPoliza     | rolUsuario | descripcion |
| TEST_22222236 | Asesor     |             |

Scenario: 4 Validacion que existan todas las razones de No tomada
Meta: @lote4
@Story CDSEG-907
@URL https://jira.suramericana.com.co/browse/CDSEG-907
@tag automator:andres_alarcon_guerrero, informer:juan_esteban_restrepo, sprint:7
@Sprint 7

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When desee seleccionar instrucciones previas a la renovacion
And seleccione instruccion No tomada previa a la renovacion
And despliegue Razón de no renovación
Then debe visualizarse las siguientes razones
| RAZONES                      |
| Costo de la póliza           |
| Se asegura con otra compañía |

Examples:
| numPoliza     | rolUsuario | descripcion |
| TEST_22222236 | Asesor     |             |