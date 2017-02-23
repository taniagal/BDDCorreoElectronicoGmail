Meta:
@lote3
@sprint 14
@tag equipo: 3

Narrative:
Como usuario de Policy Center
Quiero poder visualizar la información de facturación de las pólizas  asociadas y relacionadas a una cuenta
Para mostrar el termino de póliza correspondiente

Scenario: Validar la busqueda de transacciones de poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1973       | MONICA        | LOPEZ          | DIRECCION DE RESIDENCIA | CALLE 58F #25-83 | Antioquia    | Medellin | INT-3  |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And intente ingresar al modulo de transacciones de poliza
Then se debe realizar busqueda por transaccion de poliza <numeroTransaccion>


Examples:
| |
| |