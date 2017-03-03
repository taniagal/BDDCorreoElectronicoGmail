Meta:
@lote3
@tag equipo: billing
@sprint 12

Narrative:
Como usuario de Policy Center
requiero realizar validaciones en la pantalla de pagos  para una adecuada gestión de los cobros flotantes.



Scenario: Tipo flotante Automatico(Multiriesgo)
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |LUISPAGO     |AKERMAN        |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                    | medioVenta |
|Antioquia   |Medellin|CR 44 A # 43 - 07|Edificio Core|Acabado de productos textiles| Televentas |
And seleccione algunos articulos y sus cobertura:
| articulo        | valor_asegurable | coberturas|exposicionpromedio|
| FloatExixtences | 100000000        | Danos     |10000             |
And haga clic en el boton Aceptar
And en la pantalla "Edificios y ubicaciones" debe permitir seleccionar el tipo de flotante:
|tipo      |
|Automatico|
Then en la pantalla de payment en el item schedule debe asignar por default plan type "Installment plan" no editable.
El item "audits" debe aparecer por default "SI" y tampoco es editable:
|tipo      |metodoFacturacion|tipoPlan          |auditoria|
|Automatico|Factura directa  |Installment Plan  |SI       |
Examples:
||
||


Scenario: Tipo flotante Declarativo(Multiriesgo)
Given estoy cotizando una poliza de mrc:
|oficina|agente_oficina|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1059   |DIRECTO       |Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MARIOPAN     |APAGO          |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                    | medioVenta |
|Antioquia   |Medellin|CR 44 A # 43 - 07|Edificio Core|Acabado de productos textiles| Televentas |
And seleccione algunos articulos y sus cobertura:
| articulo        | valor_asegurable | coberturas|exposicionpromedio|
| FloatExixtences | 100000000        | Danos     |10000             |
And haga clic en el boton Aceptar
And en la pantalla "Edificios y ubicaciones" debe permitir seleccionar el tipo de flotante:
|tipo       |
|Declarativo|
Then en la pantalla de payment en el item schedule debe asignar por default plan type "Reporting Plan" no editable.
El item "audits" debe aparecer por default "No" editable:
|tipo      |metodoFacturacion|tipoPlan        |auditoria|
|Declarativo|Factura directa |Reporting Plan  |NO       |
Examples:
||
||
