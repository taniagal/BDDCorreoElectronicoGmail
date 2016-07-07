Meta:
@issue #SUGWUSC-14490

Narrative:
Como usuario de policyCenter
Quiero poder ver y agregar coberturas tipo blanket(Agregar las coberturas de este tipo que usa el producto actualmente)al producto MRC

Feature: Gestion de Blankets(Cobertuas Globales)

Scenario:  Agregar una cobertura global a multiples ubicaciones de una poliza de MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When agregue coberturas globales con descripcion <descripcion> , tipo de cobertura <tipoCobertura>, valor <valor> y nombreCobertura <nombreCobertura>
Then debe mostrarme las coberturas incluidas y las ubicaciones cubiertas

Examples:
|cuenta     |producto           |descripcion        |tipoCobertura        | valor    | nombreCobertura |
|C001888888 |Propiedad comercial|cobertura global 1 |Multiples ubicaciones| 15000000 | Danos materiales |

Scenario:  Agregar una cobertura global a una poliza de MRC
Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When agregue coberturas globales con descripcion <descripcion> , tipo de cobertura <tipoCobertura>, valor <valor> y nombreCobertura <nombreCobertura>
Then debe mostrarme las coberturas incluidas y las ubicaciones cubiertas

Examples:
|cuenta     |producto           |descripcion        |tipoCobertura | valor    | nombreCobertura |
|C001888888 |Propiedad comercial|cobertura global 2 |Una cobertura | 15000000 |Rotura de maquinaria|

Scenario:  Validar la seleccion de une unica cobertura global cuando se selecciona el tipo Una Cobertura
Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When agregue coberturas globales con descripcion <descripcion> , tipo de cobertura <tipoCobertura> y nombreCobertura <nombreCobertura>
Then debe mostrarme un mensaje<mensaje> de error

Examples:
|cuenta     |producto           |descripcion        |tipoCobertura |nombreCobertura|mensaje|
|C001888888 |Propiedad comercial|cobertura global 2 |Una cobertura |Gastos adicionales|Debe definir los valores de la cobertura seleccionada|