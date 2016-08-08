Agregar Riesgos Poliza Colectiva

Meta:

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de poder ingresar un riesgo a una póliza colectiva de Autos


Scenario: Validar la creacion de un riesgo con cuenta nueva
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
And de clic en agregar riesgo para ir a la ventana de riesgos
And de clic en agregar riesgo para agregar un riesgo a la poliza colectiva