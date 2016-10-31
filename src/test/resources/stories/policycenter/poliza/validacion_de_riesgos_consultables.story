Validacion de riesgos consultables

Meta:
<<<<<<< HEAD

Scenario: 1 Validacion de riesgos consultables (tomador adicional,asegurador,direccion) al cotizar nueva poliza

Meta:
=======
@lote1
>>>>>>> develop
@Story CDSEG-3124
@URL https://jira.suramericana.com.co/browse/CDSEG-3124
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

<<<<<<< HEAD
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When quiera agregar un tomador adicional que es riesgo consultable <cedula>
And intente ingresar una nueva ubicacion
And ingrese las entradas de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100            |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100            |

Then se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras
| MENSAJES_WORKSPACE                                                                                                                                                                                                                                            |
| El asegurado es un riesgo no estándar|
| El tomador es un riesgo no estándar  |
| La dirección es un riesgo no estándar|


Examples:
| numSubscripcion | rolUsuario | cedula  | tipoBeneficiario |
| 22266771        | Asesor     | 9876543 | Asegurado        |



Scenario: 2 Validacion de riesgos consultables (tomador, tomador adicional,beneficiario,basegurador,direccion) al modificar nueva poliza

Meta: @manual
@Story CDSEG-3124
@URL https://jira.suramericana.com.co/browse/CDSEG-3124
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given que estoy en la informacion de la poliza con numero(s) de subscripcion <numSubscripcion>
When  quiero agregar un tomador adicional que es riesgo consultable <cedula>
And intente ingresar una nueva ubicacion(es)
And ingrese las entradas de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
Then se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras

Examples:
| numPoliza  | rolUsuario |
| 6076942934 | Asesor     |

Scenario: 3 Validacion de riesgos consultables (tomador, tomador adicional,beneficiario,basegurador,direccion) al renovar nueva poliza

Meta: @manual
@Story CDSEG-3124
@URL https://jira.suramericana.com.co/browse/CDSEG-3124
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8
=======
Scenario: 1 Validacion de riesgos consultables en cotizacion de poliza
Meta:
@manual
Given que estoy en el resumen de la cuenta <numCuenta> con el rol <rolUsuario>
When ingrese a cotizar una nueva poliza con la informacion: <NomAgente>, <Organizacion>, <Canal>, <Producto>
And quiera agregar un tomador adicional que es riesgo consultable <cedula>
And ingrese la informacion del asegurado y beneficiario
Then se deben validar en Riesgos consultables el tomador, tomadores adicionales, asegurados , beneficiarios, direcciones y se debe mostrar el mensaje por cada una de las figuras
>>>>>>> develop

Given que estoy en la informacion de la poliza con numero(s) de subscripcion <numSubscripcion>
When  quiero agregar un tomador adicional que es riesgo consultable <cedula>
And intente ingresar una nueva ubicacion(es)
And ingrese las entradas de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
Then se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras

Examples:
| numPoliza  | rolUsuario |
| 6076942934 | Asesor     |

Scenario: 4 Validacion de riesgos consultables (tomador, tomador adicional,beneficiario,basegurador,direccion) al expedir nueva poliza

Meta: @manual
@Story CDSEG-3124
@URL https://jira.suramericana.com.co/browse/CDSEG-3124
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given que estoy en la informacion de la poliza con numero(s) de subscripcion <numSubscripcion>
When  quiero agregar un tomador adicional que es riesgo consultable <cedula>
And intente ingresar una nueva ubicacion(es)
And ingrese las entradas de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
Then se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras

Examples:
| numPoliza  | rolUsuario |
| 6076942934 | Asesor     |