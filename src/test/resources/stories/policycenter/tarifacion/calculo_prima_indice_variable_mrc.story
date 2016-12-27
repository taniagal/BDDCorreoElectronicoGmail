Calculo Prima Indice Variable Mrc

Meta:
@lote3
@issue #CDSEG-4322
@sprint 12
@tag automator: nelson_jhair_mosquera_palacios


Narrative:
Como usuario de PlicyCenter
Requiero poder realizar los siguientes ajuste para el calculo de la prima de MRC
1. En el resultado de la cotización se debe mostrar el subtotal del locatión.
2. El calculo de la prima del indice variable se debe sumar en cada una de las coberturas, es decir en la rutina se debe incluir

Scenario: Validar valor de interes adicional
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|cuenta     |organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
When seleccione la cobertura:
|valorReconstruccion|valorAsegurado|valorComercial|cobertura|
|120000000          |120000000     |120000000     |Terremoto|
And seleccione la cobertura de daños materiales con valor <valor> e indice variable <valorIndice>
And cotice el articulo
Then debo poder ver el valor de la prima <prima> en la cobertura

Examples:
|valor    |valorIndice|prima  |departamento|ciudad  |direccion        |descripcion  |actividad|
|120000000|5          |125.050|Antioquia   |Medellin|CR 44 A # 73 - 00|Edificio Core|Actividades de agencias de empleo|