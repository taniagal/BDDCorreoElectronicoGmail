Informacion De Poliza Colectiva

Meta:

@issue #CDSEG-862

Narrative:
Narrative:
Como usuario de Policy Center
Quiero ser capaz de crear polizas colectivas e individuales
Para las diferentes organizaciones, canales y productos

Scenario: Validar la informacion de poliza colectiva de acuerdo a las opciones seleccionadas
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> con el cual deseo expedir la poliza
Then Debo ver la siguiente informacion de la poliza
