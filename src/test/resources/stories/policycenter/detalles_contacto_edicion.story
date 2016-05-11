
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Feature: Contact_detail


Antecedents: HU Search Contact y HU Metodos de Entrada de Direcciones
# Pendiente por definir en la historia la validacion de direcciones con la historia New address input modes

Scenario: Editar detalles de contacto de tipo persona natural

Given Se tiene y se ha consultado la informacion detallada de un contacto tipo persona natural con nombre
<primer_nombre> y apellido <primer_apellido>, tipo direccion <tipo_direccion>, direccion <direccion>,
tipo documento <tipo_documento>, documento <documento>, y con el usuario <user>, con contrasenia <pass> y pais <country>
When quiera editar la informacion del contacto con perimer nombre <primer_nombre>,
segundo nombre <segundo_nombre>, primer apellido <primer_apellido>, segundo apellido <segundo_apellido>,
fecha fallecimiento <fecha_fallecimiento>, causa fallecimiento <causa_fallecimiento>, profesion <profesion>,
estado civil <estado_civil>, tipo familia <tipo_familia>,telefono celular <telefono_celular>,telefono residencial
<telefono_residencial>, telefono trabajo <telefono_trabajo>,correo electronico primario <correo_electronico_primario>,
 correo electronico secundario <correo_electronico_secundario>
Then se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios

Examples:
|country |user    |pass     |tipo_documento        |documento  |primer_nombre|primer_apellido |segundo_nombre   |segundo_apellido   |tipo_direccion |direccion       |fecha_fallecimiento  |causa_fallecimiento    |profesion  |estado_civil   |tipo_familia |telefono_celular    |telefono_residencial  |telefono_trabajo  |correo_electronico_primario  |correo_electronico_secundario|
|Colombia|pedrvevi|pedrvevi |CEDULA DE CIUDADANIA  |564-36-5489|SASHA         |AKERMAN        |KAREN            |PEREZ              |Vivienda       |CALLE 54B #50-25 |12/12/2015           |causa de fallecimiento |ABOGADO    |Soltero        |Nuclear      |654-985-1236        |789-785-1236          |456-789-1236      |primario@mail.com            |secundario@mail.com          |




Scenario: Editar detalles de contacto de tipo persona juridica

Given Se ha consultado la informacion detallada de un contacto tipo persona juridica con nombre <razon_social>,
tipo de direccion <tipo_direccion> y direccion <direccion>, con el usuario <user>, con contrasenia <pass> y pais <country>
When quiera editar la informacion del contacto con razon social <razon_social>, nombre comercial <nombre_comercial>,
actividad comercial <actividad_comercial>, numero de empleados <numero_empleados>, valor activos <valor_activos>,
 ventas anuales <ventas_anuales>, telefono oficina <telefono_oficina>, correo electronico primario <correo_electronico_primario>,
  correo electronico secundario <correo_electronico_secundario>
Then se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios de persona juridica

Examples:
|country |user    |pass     |razon_social   |tipo_direccion |direccion        |nombre_comercial  |actividad_comercial                    |numero_empleados  |valor_activos  |ventas_anuales |telefono_oficina  |correo_electronico_primario  |correo_electronico_secundario|
|Colombia|pedrvevi|pedrvevi |UMBRELLA       |Vivienda       |CALLE 54B #50-25 |BDD Sura          |FABRICACION DE RECIPIENTES DE MADERA   |400               |190000000      |135000000      |888-789-1236      |primario@mail.com            |secundario@mail.com          |

