Meta:
@lote8
@tag equipo: 1, sprint: Modelo Autorizaciones

Narrative:
Al hacer una cancelación de poliza con fecha retroactiva que supere 30 días, el sistema debe generar automáticamente un mensaje indicando que se requiere una autorización.
Se debe aprobar ó rechazar la autorizacion con el perfil correspondiente y luego expedir la poliza.


Scenario: Generar una cancelacion de poliza donde se levante autorizacion por retroactividad
Given carga de aplicacion: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When se va a loguear en PolicyCenter Lab: Colombia, suragwsu y suragwsu se debe mostrar: Mis actividades


Then system is in a different state