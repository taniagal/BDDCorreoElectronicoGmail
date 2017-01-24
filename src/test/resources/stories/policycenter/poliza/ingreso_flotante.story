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
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000112402|Sura        |Multiriesgo corporativo|Canal Tradicional|
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO             | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Existencias Flotantes     |                     |                  | Valor asegurado máximo           | 100000000      |
| Información de Artículos | Existencias Flotantes     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
When intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese las entradas en cambio de poliza de las diferentes coberturas con interes <cedula><tipodocumento> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO             | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Existencias Flotantes     |                     |                  | Valor asegurado máximo           | 100000000      |
| Información de Artículos | Existencias Flotantes     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And se solicite aprobacion para los riesgos en cambio de poliza
And en la pantalla "Edificios y ubicaciones" debe permitir seleccionar el tipo de flotante:
 |tipo|
 |Automatico|
Examples:
| rolUsuario | cedula  | tipoBeneficiario | tipodocumento                   |
| Asesor     | 9876543 | Asegurado        | CEDULA DE CIUDADANIA            |