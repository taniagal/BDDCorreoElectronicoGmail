Meta:
@lote1
@sprint 9
@tag equipo: 4
@local

Narrative:
Como usuario de policy center
Al cotizar una poliza de MRC quiero ser capaz de registrar toda la información del riesgo.


Scenario:  Tarifa MRC - Cobertura Terremoto en Antioquia
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|cuenta     |organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                    |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Acabado de productos textiles|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Terremoto |
And cotice el articulo
Then debo poder ver el valor de la prima <prima> en la cotizacion

Examples:
|prima  |
|101.667|



Scenario:  Tarifa MRC - Cobertura Terremoto en Caldas con deducible
Given estoy cotizando una poliza de mrc:
|cuenta     |organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad   |direccion        |descripcion  |actividad                    |
|Caldas      |Manizales|CR 44 A # 43 - 00|Edificio Core|Acabado de productos textiles|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Terremoto |
And seleccione la opcion de deducible en si
And agrego el valor comercial <valor> y el indice variable <valor_indice>
And cotice el articulo
Then debo poder ver el valor de la prima <prima> en la cotizacion

Examples:
|prima  |valor    |valor_indice|departamento|ciudad   |direccion        |descripcion  |actividad|
|154.000|120000000|0           |Caldas      |Manizales|CR 44 A # 44 - 00|Edificio Core|Acabado de productos textiles|



Scenario:  Tarifa MRC - Cobertura Terremoto en Caldas sin deducible
Given estoy cotizando una poliza de mrc:
|cuenta     |organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad   |direccion        |descripcion  |actividad                    |
|Caldas      |Manizales|CR 44 A # 43 - 00|Edificio Core|Acabado de productos textiles|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Terremoto |
And seleccione la opcion de deducible en no
And agrego el valor comercial <valor> y el indice variable <valor_indice>
And cotice el articulo
Then debo poder ver el valor de la prima <prima> en la cotizacion

Examples:
|prima  |valor    |valor_indice|departamento|ciudad   |direccion        |descripcion  |actividad|
|128.333|120000000|0           |Caldas      |Manizales|CR 44 A # 46 - 00|Edificio Core|Acabado de productos textiles|



Scenario: Tarifa MRC - Cobertura AMIT
Given estoy cotizando una poliza de mrc:
|cuenta     |organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                    |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Acabado de productos textiles|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Asonada,Terremoto|
And cotice el articulo
Then debo poder ver el valor de la prima <prima> en la cobertura

Examples:
|prima|departamento|ciudad  |direccion        |descripcion  |actividad|
|5.351|Antioquia   |Medellin|CR 44 A # 47 - 00|Edificio Core|Acabado de productos textiles|