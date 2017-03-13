Meta:
@lote3
@tag equipo: 3
@sprint 15

Narrative:
Como usuario de policy center quiero poder excluir riesgos de polizas colectivas de autos o de MRC
para poder cotizar y expedir la cancelación de una poliza con beneficiario oneroso.


Scenario: Validar mensaje de alerta, cuando cancelo una poliza de autos con beneficiario oneroro
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| producto | tipoPoliza | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Autos    | Individual | CEDULA DE CIUDADANIA | 02/12/1990       | CAMILO        | RUIZ            | DIRECCION DE RESIDENCIA | CALLE 54B #50-25 | Antioquia    | Medellin | INT-3  |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese registros del vehiculo con interes adicional:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | medioVenta |
| random | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Modular | Televentas |
And ingrese beneficiario oneroso en los intereses <tipoBeneficiarioOneroso>
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|640.  |0        |Si      |Si      |


Examples:
| tipo_documento       | documento  | tipoBeneficiarioOneroso |
| CEDULA DE CIUDADANIA | 1264567899 | Oneroso Leasing         |