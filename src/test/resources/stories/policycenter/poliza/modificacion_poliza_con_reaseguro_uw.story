Meta:
@lote4
@tag equipo: 3
@Sprint 13


Narrative:
Se tiene una poliza expedida, al momento de realizar una modificación a un articulo con benefeiciario oneroso, se generan alertas.
Ademas se debe solicitar una autorización para expedir la modificación de una póliza con marca de RA especial.

Scenario: UW - poliza en reaseguro especial - poliza nueva en el producto MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| organizacion | producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion       | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1968       | ROGELIO       | PATAQUIBA       | DIRECCION DE RESIDENCIA | CALLE 2I #21-22 | Antioquia    | Medellin | INT-3  |
When seleccione la poliza como reaseguro especial
And diligencie los campos de reaseguro aceptado
| comision | deposito | impuesto | transferencia |
| 100      | 100      | 100      | 100           |
And ingresa el asegurado <opcionAgregar>
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas mrc
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 200000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 200000000      |
And intente cotizar y expedir la poliza
And ingrese a analisis de riesgo
And realice la aprobacion especial
And acepto la expedicion de poliza
And acepto la expedicion de poliza
And expido la poliza
Then se debe generar un UW issue para poder expedir la póliza nueva <mensaje>

Examples:
| tipoId               | numeroId   | opcionAgregar  | mensaje                                                                |
| CEDULA DE CIUDADANIA | 1234567890 | Del Directorio | La póliza tiene reaseguro especial y la expedición debe ser autorizada |