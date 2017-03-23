Meta:
@lote4
@tag equipo: 5, sprint: 14

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder administrar la asociacion entre canal, oficina y medio de venta

Scenario: Menu medios de venta y gestores
GivenStories: stories/policycenter/login_policy.story
Given estoy en el menu de administracion
When seleccione la opcion de  configuracion red comercial
And deben aparecer las siguientes opciones:
| opciones                  |
| Canales                   |
| Medios de venta           |
| Oficinas por canal        |
| Medios de venta por canal |
And cuando vaya a la opciones medios de venta
Then deben aparecer las siguientes opciones por medio de venta:
| opciones              |
| Código medio de venta |
| Medio de venta        |
| Activo                |
And los botones buscar y restablecer
Examples:
|  |
|  |

Scenario: Menu oficinas por canal
Given estoy en el menu de administracion
When cuando vaya a la opcion oficinas por canal
Then deben aparecer las siguientes opciones por oficina:
| opciones               |
| Canal comercial        |
| Canal guidewire        |
| Organización guidewire |
| Activo                 |
| Oficina                |
And los botones buscar y restablecer
Examples:
|  |
|  |

Scenario: Menu canales
Given estoy en el menu de administracion
When cuando vaya a la opcion canales
Then deben aparecer las siguientes opciones por canal:
| opciones     |
| Código canal |
| Canal        |
| Activo       |
And los botones buscar y restablecer
Examples:
|  |
|  |

Scenario: Crear nuevo canal
Given estoy en el menu de administracion
When seleccione la opcion de  configuracion red comercial
And cuando vaya al menu acciones a crear un nuevo canal
Then deben aparecer las siguientes opciones por canal:
| opciones     |
| Código canal |
| Canal        |
| Activo       |
Examples:
|  |
|  |

Scenario: Menu medio de venta por canal
Given estoy en el menu de administracion
When seleccione la opcion de  configuracion red comercial
And cuando vaya a la opcion medio de venta por canal
Then deben aparecer las siguientes opciones por canal:
| opciones        |
| Medio de venta  |
| Canal comercial |
| Activo          |
And cuando agrege un canal comercial:
| canalComercial                   | medioDeVenta |
| CC001 - Bancaseguros bancolombia | <ninguno>    |
And se deben mostrar los medios de venta asociados a ese canal:
| mediosDeVentaAsociados | medioDeVentaPorDefecto |
| Puntos bancolombia     | No                     |
| Televentas             | No                     |
| Venta en linea         | No                     |
And vaya al menu acciones a adicionar medios de venta a un canal
And agrego el canal <canalCom> y le adiciono el medio de venta <medioVenta> que voy a asociarle
And debe adicionarse satisfactoriamente el medio de venta al canal

Examples:
| canalCom                         | medioVenta           |
| CC001 - Bancaseguros bancolombia | 9 - Puntos delegados |