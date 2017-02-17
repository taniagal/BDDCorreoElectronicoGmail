Meta:
@lote4
@tag equipo: 5
@sprint 14

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder administrar la asociacion entre canal, oficina y medio de venta

Scenario: Menu medios de venta y gestores
GivenStories: stories/policycenter/login_policy.story
Given estoy en el menu de administracion
When seleccione la opcion de  configuracion red comercial
And deben aparecer las siguientes opciones:
|opciones           |
|Canales            |
|Medios de venta    |
|Oficinas por canal |
And cuando vaya a la opciones medios de venta
And deben aparecer las siguientes opciones por medio de venta:
|opciones              |
|Código medio de venta |
|Medio de venta        |
|Activo                |
And los botones buscar y restablecer
And cuando vaya a la opcion oficinas por canal
And deben aparecer las siguientes opciones por oficina:
|opciones                  |
|Código sura oficina       |
|Canal comercial           |
|Canal guidewire           |
|Organización guidewire    |
|Activo                    |
And los botones buscar y restablecer
And cuando vaya a la opcion canales
And deben aparecer las siguientes opciones por canal:
|opciones     |
|Código canal |
|Canal        |
|Activo       |
And los botones buscar y restablecer

Examples:
||
||


