Validacion de riesgos consultables

Meta: @lote1
Scenario: 1 Validacion de riesgos consultables en cotizacion de poliza

Meta: @lote1
@Story CDSEG-3124
@URL https://jira.suramericana.com.co/browse/CDSEG-3124
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given que estoy en el resumen de la cuenta <numCuenta> con el rol <rolUsuario>
When ingrese a cotizar una nueva poliza con la informacion: <NomAgente>, <Organizacion>, <Canal>, <Producto>
And quiera agregar un tomador adicional que es riesgo consultable <cedula>
And ingrese la informacion del asegurado y beneficiario
Then se deben validar en Riesgos consultables el tomador, tomadores adicionales, asegurados , beneficiarios, direcciones y se debe mostrar el mensaje por cada una de las figuras


Examples:
| numCuenta    | rolUsuario|NomAgente             |Organizacion  |Canal                 |Producto               |
| C000888888   | Asesor    |DIRECTO > 4999        |Sura          |Canal Tradicional     |Multiriesgo corporativo|

