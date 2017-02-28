Direcciones De Contacto Vinculadas

Meta: @lote3

@issue #CDSEG-732, CDSEG-876
@tag equipo: 1, sprint:3
@Sprint 3

Narrative:
Como usuario PolicyCenter
quiero poder actualizar la direccion de un contacto que este asociada a otros contactos
para mantener la informacion actualizada de direcciones

Scenario: Edicion del campo Pais validando que departamento y ciudad se actualizan a ninguno
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And que me encuentro en los contactos de la cuenta
When seleccione el contacto a editar <nombreContacto>
And ingrese a editar la direccion e ingrese el pais <pais>
Then el campo departamento debe tener el valor <departamento>
And el campo ciudad debe tener el valor <ciudad>

Examples:
| numCuenta  | nombreContacto  | pais     | departamento | ciudad    |
| C000484848 | RICARDO GIRALDO | Colombia | Antioquia    | MEDELLLIN |


Scenario: Edicion del campo Direccion validando que se estandariza la direccion ingresada
Given que voy a buscar la cuenta <numCuenta>
And que me encuentro en los contactos de la cuenta
When seleccione el contacto a editar <nombreContacto>
And ingrese a editar la direccion por <direccionSinEstandarizar>
Then la direccion debe quedar estandarizada <direccionEstandarizada> del contacto <nombreContacto>

Examples:
| numCuenta  | direccionSinEstandarizar | direccionEstandarizada | nombreContacto  |
| C000484848 | CARRERA 65 48 162        | CR 65 # 48 - 162       | RICARDO GIRALDO |



Scenario: consultar direccion de un contacto que tiene una direccion asociada a otro contacto
Given que voy a buscar la cuenta <numCuenta>
And que me encuentro en los contactos de la cuenta
When cuando vincule las direcciones del contacto <nombreContactoUno> y contacto <nombreContactoDos> y la desee editar
Then me debe mostrar la siguiente informacion:
| pais     | departamento | ciudad   | direccion        | tipoDeDireccion       | descripcion                                |
| Colombia | Antioquia    | MEDELLIN | CR 65 # 48 - 162 |DIRECCION DE RESIDENCIA| Created by the Address Builder with code 0 |

Examples:
| numCuenta  | nombreContactoUno | nombreContactoDos |
| C000484848 | OSCAR GOMEZ       | CARLOS PERALTA    |



Scenario: actualizar direccion solo ingresando campos obligatorios
Given que voy a buscar la cuenta <numCuenta>
And que me encuentro en los contactos de la cuenta
When ingrese solo informacion obligatoria
Then me debe mostrar esta informacion:
| pais     | departamento | ciudad   | direccion        | tipoDeDireccion       | descripcion |
| Colombia | Antioquia    | MEDELLIN | CR 65 # 48 - 162 |DIRECCION DE RESIDENCIA|             |
Examples:
| numCuenta  |
| C000484848 |

Scenario: visualizar los contactos que hacen uso de la direccion de otro contacto
Given que voy a buscar la cuenta <numCuenta>
And que me encuentro en los contactos de la cuenta
When quiera actualizar la direccion de un contacto que tiene otros contactos que la usan
Then me debe validar la informacion de los contactos que usan esa direccion:
|nombre|primaria|telefono|correo|
| RICARDO GIRALDO | Sí | 408-2211 | 0019@guidewire.com |
| OSCAR GOMEZ     | Sí | 408-2211 | 0010@guidewire.com |
| CARLOS PERALTA  | Sí | 408-2211 | 0037@guidewire.com |
Examples:
| numCuenta  |
| C000484848 |

Scenario: validar las etiquetas de los campos
Given que voy a buscar la cuenta <numCuenta>
And que me encuentro en los contactos de la cuenta
When seleccione el contacto a editar <nombreContacto>
And seleccione la opcion para editar la direccion
Then los nombres de las etiquetas de la ventana son correctos para el titulo <titulo> y los botones <botonLigagas> y <botonDesligar>

Examples:
| numCuenta  | nombreContacto  | titulo                  | botonLigagas                             | botonDesligar                             |
| C000484848 | RICARDO GIRALDO | Detalle de la dirección | Actualizar todas las direcciones ligadas | Actualizar sólo esta dirección y desligar |

Scenario: validar cuando una direccion no se puede estandarizar la deje como la ingresa el usuario
Given que voy a buscar la cuenta <numCuenta>
And que me encuentro en los contactos de la cuenta
When seleccione el contacto a editar <nombreContacto>
And seleccione la opcion para editar la direccion
And ingrese a editar la direccion por <direccion> en la ventana de contactos vinculados
Then la direccion debe quedar como la ingreso el usuario <direccionUsuario> del contacto <nombreContacto>

Examples:
| numCuenta  | nombreContacto  | direccion                                                                | direccionUsuario                                                         |
| C000484848 | RICARDO GIRALDO | Calle 89 F con circular 1 numero 77 FF 77 avenida guayabal por el centro | CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO |

Scenario: validar se actualiza la direccion vinculada de todos los contactos
Given que voy a buscar la cuenta <numCuenta>
And que me encuentro en los contactos de la cuenta
Then la direccion <direccionVinculada> fue actualizada <nombreContacto>

Examples:
| numCuenta  | nombreContacto  | direccionVinculada                                                       |
| C000484848 | RICARDO GIRALDO | CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO |
| C000484848 | CARLOS PERALTA  | CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO |
| C000484848 | OSCAR GOMEZ     | CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO |

Scenario: validar cuando se actualiza y se desliga la direccion del contacto
Given que voy a buscar la cuenta <numCuenta>
And que me encuentro en los contactos de la cuenta
When seleccione el contacto a editar <nombreContacto>
And seleccione la opcion para editar la direccion
And ingrese a editar la direccion por <direccion> en la ventana de contactos vinculados y desligue la direccion
Then las direcciones fueron desvinculas de los contactos:
| contactoDesligado | direccionDesligada                                                       |
| RICARDO GIRALDO   | CR 65 # 48 - 162                                                         |
| CARLOS PERALTA    | CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO |
| OSCAR GOMEZ       | CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO |

Examples:
| numCuenta  | nombreContacto  | direccion          |
| C000484848 | RICARDO GIRALDO | Carrera 65 #48-162 |

Scenario: validar en la creacion de contacto secundario se puede seleccionar la misma direccion de otro contacto
Given que voy a buscar la cuenta <numCuenta>
And que me encuentro en los contactos de la cuenta
And quiera crear un contacto secundario persona natural
When vaya a desplegar la lista de contactos para asignar la direccion
Then la lista de contactos debe ser la siguiente:
| contactosAsociados                     |
| RICARDO GIRALDO (Titular de la cuenta) |
| CARLOS PERALTA (Asegurado nombrado)    |
| OSCAR GOMEZ (Asegurado nombrado)       |
And debo poder asociar una direccion de otro contacto y se debe asociar la dirección seleccionada al nuevo contacto  y mostrar los datos de la dirección
| pais     | departamento | ciudad   | direccion        | tipoDireccion         | descripcion                                |
| Colombia | Antioquia    | <ninguno>| CR 65 # 48 - 162 |DIRECCION DE RESIDENCIA| Created by the Address Builder with code 0 |

Examples:
| numCuenta  |
| C000484848 |