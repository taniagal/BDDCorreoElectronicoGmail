Meta:
@tag equipo: 2
@lote1
@Sprint 13

Narrative:
Como usuario de policyCenter
Quiero poder  visualizar  el listado de roles completo para asociar contactos a las  cuantas.


Scenario: validacion de lista roles no asosciados a un contacto
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And y desee crear un nuevo contacto
When debo oprimirClick <oprimirClick> para ver las opciones del menu crear contacto
| Contacto de facturación |
| Nuevo Persona Natural   |
Then el sistema debe validar las opciones al agregar nuevo rol:
| roles                   |
| Contacto de facturación |


Examples:
| numCuenta  | oprimirClick |
| C000888888 | true         |
