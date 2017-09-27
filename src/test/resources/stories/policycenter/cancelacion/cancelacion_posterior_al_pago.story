Meta:
@lote8
@tag equipo: 1, sprint: modelo de autorizaciones

Narrative: Cuando se desea cancelar la póliza en una fecha posterior al último pago del cliente.

Scenario: Cancelación posterior al último pago del cliente
Given carga de aplicacion de Policy: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When logueo en PolicyCenter Lab: Colombia, suragwsu y suragwsu se debe mostrar: Mis actividades
And voy a cotizar poliza de autos individual:
| cuenta     | producto | oficina | agente_oficina                     | tipoPoliza |
| 2582024763 | Autos    | 4029    | LAS LLAVES DEL CORAZON LTDA. CQLII | Individual |
And ingrese la Fecha Inicio Vigencia: -25
And ingrese datos del asegurado de policy <tipo_documento> <documento>
And ingrese los datos del vehiculo que va asegurar:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis    | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta | cero_kilometros |
| random | 2018   | 08008011         | MEDELLIN           | Particular        | asdfghjkl | asdfghjkl | 57500000        | null      | null    | 2    | Plan Autos Global  | Asesor     | Si              |
And clic a la pantalla de coberturas
And seleccione todas las coberturas del plan:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 3.040  | 0         | 0   | 850 | 40. | Asistencia Global  | 0   | 850 | 40 | 20   |  20  |         |
And expedir poliza y capturar el numero
And voy al resumen de la poliza
And aprobar la cancelacion de la poliza
|motivo                  |descripcion                  |Fecha|
|Por petición del cliente|Prueba cancelacion con Policy| 1 |
And ingrese a la opcion plan de trabajo

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 9923424349 |