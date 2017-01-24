ingreso_flotante
Meta:@lote1
@issue #SUGWUSC-1162
@tag automator: danny_barrientos
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
| organizacion | producto                | tipo_documento       | numeroDocumento | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 11545135        | 10/10/1974       | LUV           | BAR             | DIRECCION DE RESIDENCIA | CALLE 28F #70-80 | Antioquia    | Medellin | INT-3  |
And ingresar informacion de edificio y ubicaciones
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO             | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Existencias Flotantes     |                     |                  | Valor asegurado máximo           | 100000000      |
| Información de Artículos | Existencias Flotantes     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
When debe permitir seleccionar el tipo de flotante:
 |tipo|
 |Automatico|
And realiza la cotizacion,expide la poliza,modifica la poliza e intena ingresar una nueva ubicacion

Examples:
||
||