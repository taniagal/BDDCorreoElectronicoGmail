Meta:
@lote2
@tag equipo: 5
@sprint 14

Narrative:
Como usuario de negocio
Quiero que al selecionar un plan basico no se soliciten responsibilades diferentes a las civiles
Para que no se requieran validaciones de inspeccion


Scenario: validar inspeccion en poliza nueva
GivenStories: stories/policycenter/login_policy.story
Given voy a cotizar una poliza de autos con la cuenta, oficina, agente, producto, asegurado con tipo de documento y documento
| tipoDocumento        | documento | cuenta     | producto |agente_oficina| oficina |
| CEDULA DE CIUDADANIA | 71318883  | C000888888 | Autos    | DIRECTO      | 1073    |
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              |
| TYU130 | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Autos Básico |
And ingrese las coberturas basicas:
|limite|deducible|abogado |PLlaves |
|640.  |0        |Si      |Si      |
And intente cotizar
Then expido la poliza y voy al archivo de poliza

Examples:
||
||