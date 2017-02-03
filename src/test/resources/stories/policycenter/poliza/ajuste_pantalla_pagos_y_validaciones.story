ajuste_pantalla_pagos_y_validaciones
Meta:
@lote1
@tag equipo: billing
@sprint 12

Narrative:
Como usuario de Policy Center
requiero realizar validaciones en la pantalla de pagos  para una adecuada gestión de los cobros flotantes.



Scenario: Tipo flotante Automatico(Multiriesgo)
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|oficina|agente_oficina|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1073   |DIRECTO       |Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |LUISPAGO     |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO             | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Existencias Flotantes     |                     |                  | Valor asegurado máximo           | 100000000      |
| Información de Artículos | Existencias Flotantes     |                     |                  | Exposición promedio              | 10000          |
| Información de Artículos | Existencias Flotantes     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
When en la pantalla "Edificios y ubicaciones" debe permitir seleccionar el tipo de flotante:
 |tipo|
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
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO             | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Existencias Flotantes     |                     |                  | Valor asegurado máximo           | 100000000      |
| Información de Artículos | Existencias Flotantes     |                     |                  | Exposición promedio              | 10000          |
| Información de Artículos | Existencias Flotantes     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
When en la pantalla "Edificios y ubicaciones" debe permitir seleccionar el tipo de flotante:
 |tipo|
 |Declarativo|
Then en la pantalla de payment en el item schedule debe asignar por default plan type "Reporting Plan" no editable.
El item "audits" debe aparecer por default "No" editable:
    |tipo      |metodoFacturacion|tipoPlan        |auditoria|
    |Declarativo|Factura directa |Reporting Plan  |NO       |
Examples:
||
||
