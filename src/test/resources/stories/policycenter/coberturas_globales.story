Coberturas Globales

Meta: @lote3
@issue #CDSEG-738
@sprint 3
@tag automator: nelson_jhair_mosquera_palacios
@local

Narrative:
Como usuario de policyCenter
Quiero poder ver y agregar coberturas tipo blanket(Agregar las coberturas de este tipo que usa el producto actualmente)al producto MRC

Feature: Gestion de Blankets(Cobertuas Globales)

Scenario:  Agregar una cobertura global a multiples ubicaciones de una poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal           |
|C1060447895|Sura       |Multiriesgo corporativo|Canal Tradicional|
When agregue coberturas globales con datos:
|descripcion       |tipo_cobertura       |valor   |nombre_cobertura|
|cobertura global 1|Multiples ubicaciones|15000000|Danos materiales|
Then debe mostrarme las coberturas incluidas y las ubicaciones cubiertas
Examples:
||
||


Scenario:  Agregar una cobertura global a una poliza
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal           |
|C1060447895|Sura       |Multiriesgo corporativo|Canal Tradicional|
When agregue coberturas globales con datos:
|descripcion       |tipo_cobertura|valor   |nombre_cobertura    |
|cobertura global 2|Una cobertura |15000000|Rotura de maquinaria|
Then debe mostrarme las coberturas incluidas y las ubicaciones cubiertas

Examples:
||
||

Scenario:  Validar la seleccion de une unica cobertura global cuando se selecciona el tipo Una Cobertura
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal           |
|C1060447895|Sura       |Multiriesgo corporativo|Canal Tradicional|
When agregue una cobertura global con datos:
|descripcion       |tipo_cobertura|valor   |nombre_cobertura  |
|cobertura global 2|Una cobertura |15000000|Gastos adicionales|
Then debe mostrarme un mensaje<mensaje> de error

Examples:
|mensaje                                              |
|Debe definir los valores de la cobertura seleccionada|