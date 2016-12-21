Cuentas Asociadas A Contacto

Meta: @lote1

@issue #CDSEG-976
@tag automator: eliana_alvarez, sprint:1
@Sprint 1

Narrative:
como usuario
quiero visualizar las cuentas asociadas a un contacto seleccionado
para conocer la informacion de la cuenta a la que se le asociaran las polizas

Scenario: Visualizar todas las cuentas asociadas a un contacto
GivenStories: stories/policycenter/login_policy.story
Given que voy a consultar un contacto
When consulte  un contacto con cuentas asociadas como: <nombre> <apellido>
Then se muestra la lista de cuentas asociadas con nombre: <nombreConsulta>, direccion: <direccion>, tel: <telefono>, email: <email> y rol: <rol>

Examples:
| nombre   | apellido | nombreConsulta                | direccion                            | telefono | email              | rol                |
| Yurledys | Gallego  | YURLEDYS PAOLA GALLEGO TORRES | CR 65 # 48 - 162, MEDELLIN, Colombia | 408-2211 | 0003@guidewire.com | Asegurado nombrado |

Scenario: Visualizar pantalla vacia para las cuentas asociadas a un contacto
Given que voy a consultar un contacto
When consulte  un contacto sin cuentas asociadas como: <nombre> <apellido>
Then se muestra el mensaje informativo <mensaje>
Examples:
| nombre | apellido | mensaje                                       |
| Ray    | Newton   | El contacto no está asociado a ninguna cuenta |