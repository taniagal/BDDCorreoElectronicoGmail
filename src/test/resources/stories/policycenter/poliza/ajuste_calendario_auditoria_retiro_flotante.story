Meta:
@lote3
@tag equipo: billing
@sprint 14

Narrative:
Como usuario de Policy Center requiero realizar validaciones al retirar o cancelar la póliza
con artículos flotantes para una adecuada gestión de los cobros flotantes.

Scenario: Cancelacion de poliza con articulo existencia flotante
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|oficina|agente_oficina|organizacion|producto                |tipoPoliza|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1059   |DIRECTO       |Sura        |Multiriesgo corporativo |Individual|CEDULA DE CIUDADANIA|02/12/1990      |DECLARIMAN   |PASCUAL        |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                    |
|Antioquia   |Medellin|CR 44 A # 43 - 07|Edificio Core|Acabado de productos textiles|
And seleccione algunos articulos y sus cobertura:
| articulo        | valor_asegurable | coberturas|exposicionpromedio|
| FloatExixtences | 100000000        | Danos     |10000000          |
And haga clic en el boton Aceptar
And en la pantalla "Edificios y ubicaciones" debe permitir seleccionar el tipo de flotante:
|tipo      |
|Declarativo|
And en la pantalla de payment en el item schedule debe asignar por default plan type "Reporting Plan" no editable. El item "audits" debe aparecer por default "No" editable y se debe seleccionar el plan de informacion:
|tipo      |metodoFacturacion|tipoPlan        |auditoria|planDeInformacion                                        |
|Declarativo|Factura directa |Reporting Plan  |NO       |Informes mensuales por mes calendario, excluir último mes|
And expido la poliza
And ingrese al resumen de la poliza expedida
And ingreso a programa auditoria y verifico el periodo:
|tipo          |estado    |
|Premium Report|Programado|
And necesito iniciar la cancelacion
And seleccione el <motivo> de cancelacion
And ingrese meses de cancelacion:2
And realice la cancelacion de poliza
Then la cancelacion de la poliza es correcta si se muestra el texto: Cancelación Expedida
And ingresar al resumen de la poliza cancelada
And ingreso a programa auditoria y verifico que no tenga los meses de la cancelacion:
|tipo          |estado    |
|Premium Report|Programado|
Examples:
|motivo                  |descripcion                                           |
|Por petición del cliente|Prueba cancelacion  de poliza: Por petición del cliente|
