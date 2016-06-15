Meta:
@issue #SUGWUSC-14970

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Feature: Detalles de un contacto

Antecedents: HU Search Contact y HU Metodos de Entrada de Direcciones
#Pendiente por definir en la historia la validacion de direcciones con la historia New address input modes


Scenario: Editar detalles de contacto de tipo persona natural

GivenStories: stories/policycenter/crear_nuevo_contacto_natural.story
When quiera editar la informacion del contacto con segundo nombre <segundo_nombre>
And profesion <profesion>, estado civil <estado_civil>,tipo familia <tipo_familia>
And telefono celular <telefono_celular>
And segundo apellido <segundo_apellido>, telefono trabajo <telefono_trabajo>
And correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>,telefono residencial<telefono_residencial>
Then se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios

Examples:
|tipo_documento        |documento  |primer_nombre |primer_apellido |segundo_nombre   |segundo_apellido   |tipo_direccion |direccion       |profesion  |estado_civil   |tipo_familia |telefono_celular    |telefono_residencial  |telefono_trabajo  |correo_electronico_primario  |correo_electronico_secundario|
|CEDULA DE CIUDADANIA  |564-36-5489|SASHA         |AKERMAN         |KAREN            |PEREZ              |Vivienda       |CALLE 54B #50-25|ABOGADO    |Soltero        |Nuclear      |354-985-1236        |789-7856          |456-7896      |primario@mail.com            |secundario@mail.com         |


Scenario: Editar detalles de contacto de tipo persona juridica

GivenStories: stories/policycenter/crear_nuevo_contacto_juridico.story
When quiera editar la informacion del contacto con razon social <razon_social>, nombre comercial <nombre_comercial>, actividad comercial <actividad_comercial>
And numero de empleados <numero_empleados>, valor activos <valor_activos>, ventas anuales <ventas_anuales>
And telefono oficina <telefono_oficina>, correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>
Then se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios de persona juridica


Examples:
|razon_social   |tipo_direccion |direccion        |nombre_comercial  |actividad_comercial                    |numero_empleados  |valor_activos  |ventas_anuales |telefono_oficina  |correo_electronico_primario  |correo_electronico_secundario|
|UMBRELLA SA    |Vivienda       |CALLE 54B #50-25 |BDD Sura          |Acabado de productos textiles          |400               |190000000      |135000000      |888-7896      |primario@mail.com            |secundario@mail.com          |

