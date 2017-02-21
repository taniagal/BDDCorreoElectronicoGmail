Meta:
@tag equipo: 2
@lote1
@Sprint 14


Narrative:
Como usuario de PolicyCente
Quiero controlar que el honorario pactado al momento de darle si
Para gestionar las remuneraciones de una poliza

Scenario: Alertas al ingresar honorario pactado incorrectamente
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|oficina| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |agente_oficina|
|4802   | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1979       | CHUCHO        | OZUNA           | DIRECCION DE RESIDENCIA | CALLE 11K #31-31 | Antioquia    | Medellin | INT-3  | DIRECTO      |
When seleccione la opcion SI de honorario pactada e ingrese el valor
| VALOR |
| -5    |
And cotice una poliza
Then mostrar el siguiente mensaje de bloqueo
|mensaje                                       |
|El honorario registrado, debe ser mayor a cero|
When seleccione la opcion SI de honorario pactada e ingrese el valor
| VALOR |
| AB    |
And cotice una poliza
Then se debe mostrar un mensaje <mensajeerror> de error
When seleccione la opcion SI de honorario pactada e ingrese el valor
| VALOR |
| 1     |
And cotice una poliza
Then mostrar el siguiente mensaje de bloqueo
|mensaje                                                                       |
|El honorario registrado, es mayor al honorario matriculado por favor verifique|

Examples:
|mensajeerror                                   |
|Honorario Pactado : debe ser un valor numérico.|
