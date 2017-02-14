Meta:
@lote3
@tag equipo: billing
@sprint 13

Narrative:
Se requiere habilitar el tipo de flotante "Automático" , al incluir el artículo flotante en un policyChange.
Aplica las mismas reglas definidas en la HU "SUGW USC 1162 AjustePantallaPagosyValidaciones" para el automático.
Al incluir el artículo flotante se debe cobrar a prorrata hasta el final de la vigencia y se genera la auditoria final por el periodo restante.
Aplica si el locations no tiene artículos flotantes.  No se permite ingresar otro artículo flotante al mismo locations.

Colectivas:
Replicar el mismo tipo flotante del artículo vigente.
Habilitar ambos tipos de flotante ("Automático, Declarativo").
Aplica definición al incluir el artículo flotante.

Aplica para multiriesgo

Scenario: Ingreso articulo Flotante (Multiriesgo)
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                        |
|Antioquia   |Medellin|CR 44 A # 85 - 01|Core de Seguros|Actividades de agencias de empleo|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Danos     |
And haga clic en el boton Aceptar
And cotice y expida la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And ingrese las entradas en cambio de poliza de las diferentes coberturas
| TAB                      | TIPO_ARTICULO             | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Existencias Flotantes     |                     |                  | Valor asegurado máximo           | 100000000      |
| Información de Artículos | Existencias Flotantes     |                     |                  | Exposición promedio              | 10000          |
| Información de Artículos | Existencias Flotantes     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
Then validar tipo de mercancia flotante en cambio:
 |tipo|
 |Automatico|
Examples:
||
||