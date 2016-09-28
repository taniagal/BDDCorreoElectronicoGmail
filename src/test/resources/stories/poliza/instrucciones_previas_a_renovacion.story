Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Validacion de elementos bloqueados en informacion de la poliza en el proceso del cambio de poliza
Meta:
@Story CDSEG-907
@URL https://jira.suramericana.com.co/browse/CDSEG-907
@tag automator:andres_alarcon_guerrero, informer:alejandro_esteban_villada_marin, sprint:4
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
| TEST_77444226 | Asesor     |             |