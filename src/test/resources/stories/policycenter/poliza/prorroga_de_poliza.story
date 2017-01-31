Meta:
@lote2
@tag equipo: 5
@sprint 13

Narrative:
Como usuario de negocio
Quiero prorrogar una poliza de MRC o de Autos


Scenario: Validar opcion de Prorroga
Given voy a cotizar una poliza de autos con la cuenta <cuenta>, agente <agente>, producto <producto>,
asegurado con tipo de documento <tipo_documento> y documento <documento>
When
Then system is in a different state