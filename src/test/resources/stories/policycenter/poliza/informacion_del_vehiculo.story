Meta:
@lote2
@issue #SUGWUSC-15123
@tag equipo: 3


Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de registrar toda la informacion del vehiculo

Scenario: Ingreso de informacion del vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta     | producto | tipoPoliza |
| C000222333 | Autos    | Individual |
When vaya a agregar un vehiculo con los datos:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | medioVenta |
| AK0249 | 2011   | 01601225         | MEDELLIN           | Particular        | PR3B4  | SnR4  | 17900000        | null      | null    | 2    | Plan Autos Básico | Televentas |
And ingrese el beneficiario o conductor <tipoDocumento> <numeroDocumento> en los intereses adicionales
Then el sistema debe permitir pasar a la siguinete pagina

Examples:
| numeroCuenta | nomProducto | tipoDocumento        | numeroDocumento |
| C000222333   | Autos       | CEDULA DE CIUDADANIA | 1234567892      |

Scenario: Validacion de caracteres especiales en campos informacion del vehiculo
Given estoy cotizando una poliza:
| cuenta     | producto | tipoPoliza |
| C000222333 | Autos    | Individual |
When vaya a agregar un vehiculo con los datos:
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis                 |motor                       |valor_asegurado|descuento|recargo|zona|plan             |medioVenta|
|AKN0099|2011  |01601225        |MEDELLIN          |Particular       |PR3B4_-/-#$%&/()=?¡¿'  |86-51/*4213486+145646!"_#$% |17900000       |9,9999   |100    |2   |Plan Autos Básico|Televentas|
Then el sistema NO debe permitir pasar a la siguinete pagina

Examples:
| numeroCuenta | nomProducto |
| C000222333   | Autos       |


Scenario: Validar campos de valores asegurados, accesorios y tope definido por perfil
Given estoy cotizando una poliza:
| cuenta     | producto | tipoPoliza |
| C000222333 | Autos    | Individual |
When vaya a agregar un vehiculo con los datos:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |
| AKU009 | 2011   | 01601225         | MEDELLIN           | Particular        | PR3B4  | SnR4  | 17900000        | null      | null    | 2    | Plan Autos Clásico | Televentas |
And ingrese los valores de accesorios y <valorAccesorio> <valorAccesorioEsp> valor de bonificacion tecnica <boniTecnica> y comercial <boniComercial>
Then el sistema debe totalizar el valor asegurado y mostrar un mensaje de error <mensaje>

Examples:
| numeroCuenta | nomProducto | valorAccesorio | valorAccesorioEsp | boniComercial | boniTecnica | mensaje                                              |
| C000222333   | Autos       | 1750000        | 4000000           | 25            | 30          | La suma de las bonificaciones no debe ser mayor a 50 |
