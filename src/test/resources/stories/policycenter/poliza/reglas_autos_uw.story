Reglas autos uw

Meta:
@lote3
@issue #CDSEG-4621
@sprint 11
@tag team: 3
@local



Scenario: Solicitar aprobación - Perfil normal
Meta: @manual
Given Que un usuario con perfil normal esta haciendo una transacción en una póliza
When Se genere una autorización de una de las reglas de negocio
Then Se podrá solicitar aprobación y de manera automática se crea una actividad para que sea evaluada por un autorizador.

Examples:
||
||

Scenario: Revisar actividad perfil autorizador
Meta: @manual
Given Que un usuario con perfil autorizador tiene una actividad pendiente en su escritorio
When Ingrese a revisar la regla contenida en la actividad
Then Se podrá autorizar por una de las opciones de tiempo parametrizadas
And Se podrá rechazar la autorización solicitada

Examples:
||
||


Scenario: Notificar cierre de actividad
Meta: @manual
Given Que un usuario autorizador finaliza su actividad
When Rechace o autorice la actividad asignada
Then Se debe enviar al usuario que solicito la aprobación una actividad de notificación con la respuesta del autorizador

Examples:
||
||


Scenario: Finalizar transacción rechazada
Meta: @manual
Given Que se notifica el cierre de la actividad y se rechazó
When Ingrese a la transacción que tiene la actividad rechazada e intente expedir
Then No se puede finalizar la transacción de la póliza

Examples:
||
||

Scenario: Finalizar transacción aprobada
Meta: @manual
Given Que se notifica el cierre de la actividad y se aprobó
When Ingrese a la transacción que tiene la actividad aprobada e intente expedir
Then Se debe expedir la transacción de la póliza

Examples:
||
||