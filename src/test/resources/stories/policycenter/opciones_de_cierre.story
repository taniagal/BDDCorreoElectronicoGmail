Meta:
@lote2
@tag equipo: 2
@sprint 13

Narrative:
Como
I want to perform an action
So that I can achieve a business goal

Scenario: Validar informacion al declinar una poliza
Given estoy cotizando una poliza basado en otro envio <envio>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
When ingrese a opciones de cierre
Then deben aparecer todas las razones de declinar poliza
|razones                                        |
|Siniestros                                     |
|Cartera                                        |
|Sin respaldo de reaseguradores o coaseguradores|
|Riesgo no objetivo                             |
|No acuerdo de pago                             |

Examples:
|envio   |
|22228589|