```
#!python


```
## Automatización de pruebas funcionales con Serenity-BDD ##

## Proyecto Core de Seguros ##

En el presente proyecto se realizaran las pruebas funcionales automatizadas para los diferentes modulos de la aplicación Guidewire: Policy, Claims y Billing.

Se utiliza **BDD** (Behavior-Driven Development o Desarrollo Guiado por el Comportamiento) para la elaboración de pruebas funcionales automatizadas, a través del framework **JBehave** con el lenguaje Gherkin con una estructura y sintaxis básica  en lenguaje de negocio. Igualmente se utilizan otros frameworks como lo son **Maven**, usado para la gestión y construcción del proyecto, **Selenium** como entorno de pruebas para aplicaciones Web y **Serenity-BDD** como administrador del proyecto integrando JBehave y Selenium para la ejecución de las preubas, generando el informe de ejecución entre otros como la comunicación con **Jira** para insertar comentarios a las historias de usuario.


### ¿Como realizar la instalación? ###

* Descargar o clonar el proyecto BDDCoreSura

* Contar con las herramientas relacionadas en la [**wiki**](https://bitbucket.org/suracore/bddcoresura/wiki/Home), especialmente con un IDE de desarrollo como IntelliJIDEA o Eclipse.

* Cómo ejecutar las pruebas? en el directorio "bddcoresura\src\test\java\com\sura\" se encuentran las clases que ejecutan los test para cada uno de los módulos (PolicyCenter, Claims y Billing), utilizando el IDE IntelliJIDEA, dentro de la clase se encuentra el botón ejecutable "Run Test".

Igualmente desde consola se puede realizar la ejecución con el siguiente comando:

**mvn clean verify serenity:aggregate**

* Una vez ejecutado se crea el directorio "target\site\serenity\", con un archivo html "index.html" que corresponde al informe de resultados para la última ejecución realizada.



En el siguiente link se encuentra la wiki con un mayor detalle técnico con la explicación del ejemplo utilizado en el proyecto para conocer cómo crear una prueba desde la historia de usuario:

[**wiki**](https://bitbucket.org/suracore/bddcoresura/wiki/Home)