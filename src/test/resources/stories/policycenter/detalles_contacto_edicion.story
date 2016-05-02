
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Feature: Contact_detail


Antecedents: HU Search Contact y HU Metodos de Entrada de Direcciones
# Pendiente por definir en la historia la validacion de direcciones con la historia New address input modes

Scenario: Editar detalles de contacto de tipo persona natural


Given Se ha consultado la informacion detallada de un contacto con nombre <primer_nombre> y apellido <primer_apellido>
tipo persona natural con el usuario <user>, con contrasenia <pass> y pais <country>
When quiera editar la informacion del contacto con perimer nombre <primer_nombre>, segundo nombre <segundo_nombre>, primer apellido <perimer_apellido>, segundo apellido <segundo_apellido>,
fecha fallecimiento <fecha_fallecimiento>, causa fallecimiento <causa_fallecimiento>, profesion <profesion>,
estado civil <estado_civil>, tipo familia <tipo_familia>, telefono primario <telefono_primario>, telefono celular <telefono_celular>,
telefono residencial <telefono_residencial>, telefono trabajo <telefono_trabajo>,
correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>
Then se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios

Examples:
|country    |user    |pass     |primer_nombre|primer_apellido |SEGUNDO_NOMBRE   |SEGUNDO_APELLIDO   |FECHA_FALLECIMIENTO  |CAUSA_FALLECIMIENTO |PROFESION  |ESTADO_CIVIL   |TIPO_FAMILIA    |TELEFONO_PRIMARIO  |TELEFONO_CELULAR    |TELEFONO_RESIDENCIAL  |TELEFONO_TRABAJO  |CORREO_ELECTRONICO_PRIMARIO  |CORREO_ELECTRONICO_SECUNDARIO  |
|Colombia|pedrvevi|pedrvevi |nombre       |apellido        |segundo nombre  | segundo apellido      |12/12/2015        |causa de fallecimiento |profesion  |estado civil   |tipo familia    |oficina            |3001231212          |1234567               |1234567           |primario@mail.com            |secundario@mail.com            |

