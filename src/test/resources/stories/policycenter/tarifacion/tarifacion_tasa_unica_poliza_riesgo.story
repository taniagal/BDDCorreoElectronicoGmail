Meta:

Narrative:
Como usuario de Poliy Center requiero ajustar la tarifa tasa única en el nuevo modelo de colectividad, ya que el archivo
debe quedar alojado en la póliza principal y las pólizas riesgos deben tener la posibilidad de poder ir a leer ese archivo
para poder tarifar.

Scenario: validar archivo de tasa unica cargado en la poliza principal
GivenStories: stories/policycenter/login_policy.story
Given que tengo una cotizacion <cotizacion>
When seleccione la opcion informacion de poliza
And valide que este seleccionada la opcion de tasa unica para la poliza principal
And cotice una poliza principal
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debe mostrar el resumen de la poliza expedida con la informacion de cotizacion <infoCotizacion>
And vaya a la poliza riesgo <riesgo>
And valide la carga del archivo de tasa unica en la poliza riesgo
And cotice la poliza riesgo con el asegurado, el auto y las coberturas necesarias
| tipoDocumento        | documento  | placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | limite | deducible | abogado  | PLlaves  | PTH | PPH | GTH | PTD | PPD | GT |
| CEDULA DE CIUDADANIA | 1234567890 | TUU225 | 2011   |                  | MEDELLIN           | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Autos Global | 1.440  | 0         |          | Opción 1 | 0   | 730 | 40  | 0   | 730 | 40 |
And el valor de la prima total y el iva deben ser:
| primaT  | iva    |
| 357.999 | 57.280 |

Examples:
| cotizacion | infoCotizacion                | riesgo   |
| 33335550   | Ver cotización (N.° 33335550) | 33335552 |