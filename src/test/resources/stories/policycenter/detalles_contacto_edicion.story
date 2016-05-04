
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Feature: Contact_detail


Antecedents: HU Search Contact y HU Metodos de Entrada de Direcciones
# Pendiente por definir en la historia la validacion de direcciones con la historia New address input modes

Scenario: Editar detalles de contacto de tipo persona natural

Given Se ha consultado la informacion detallada de un contacto tipo persona natural con nombre <primer_nombre> y apellido <primer_apellido>
y con el usuario <user>, con contrasenia <pass> y pais <country>
When quiera editar la informacion del contacto con perimer nombre <primer_nombre>,
segundo nombre <segundo_nombre>, primer apellido <primer_apellido>, segundo apellido <segundo_apellido>,
fecha fallecimiento <fecha_fallecimiento>, causa fallecimiento <causa_fallecimiento>, profesion <profesion>,
estado civil <estado_civil>, tipo familia <tipo_familia>, telefono primario <telefono_primario>,
telefono celular <telefono_celular>,telefono residencial <telefono_residencial>, telefono trabajo <telefono_trabajo>,
correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>
Then se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios

Examples:
|country |user    |pass     |primer_nombre|primer_apellido |segundo_nombre   |segundo_apellido   |fecha_fallecimiento  |causa_fallecimiento    |profesion  |estado_civil   |tipo_familia    |telefono_primario  |telefono_celular    |telefono_residencial  |telefono_trabajo  |correo_electronico_primario  |correo_electronico_secundario|
|Colombia|pedrvevi|pedrvevi |HEGIGI       |OIUIOIO         |segundo nombre   |segundo apellido   |12/12/2015           |causa de fallecimiento |ABOGADO    |Soltero        |Nuclear         |Trabajo            |654-985-1236          |789-785-1236            |456-789-1236           |primario@mail.com            |secundario@mail.com          |




Scenario: Editar detalles de contacto de tipo persona juridica

Given Se ha consultado la informacion detallada de un contacto tipo persona juridica con nombre <razon_social> con el usuario <user>, con contrasenia <pass> y pais <country>
When quiera editar la informacion del contacto con razon social <razon_social>, nombre comercial <nombre_comercial>,
actividad comercial <actividad_comercial>, numero de empleados <numero_empleados>, valor activos <valor_activos>,
 ventas anuales <ventas_anuales>, telefono oficina <telefono_oficina>, correo electronico primario <correo_electronico_primario>,
  correo electronico secundario <correo_electronico_secundario>
Then se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios

Examples:
|country |user    |pass     |razon_social   |nombre_comercial  |actividad_comercial                    |numero_empleados  |valor_activos  |ventas_anuales |telefono_oficina  |correo_electronico_primario  |correo_electronico_secundario|
|Colombia|pedrvevi|pedrvevi |Empresa prueba |BDD Sura          |FABRICACION DE RECIPIENTES DE MADERA   |400               |190000000      |135000000      |888-789-1236      |primario@mail.com            |secundario@mail.com          |

