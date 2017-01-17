Proceso automatico cancelacion billing

Meta:
@lote3
@issue #CDSEG-4621
@sprint 11
@tag team: 3
@local



Scenario: Cancelar pólizas Autos
Meta: @manual
Given Billing me informo las pólizas a cancelar automaticamente
When Se cancelen las pólizas
Then Deben quedar canceladas las pólizas con un motivo de cancelación  por no pago
And Se debe cancelar a la fecha de morosidad que informe Billing y con el método de prorrata

Examples:
||
||

Scenario: Cancelar pólizas MRC
Meta: @manual
Given Billing me informo las pólizas a cancelar automaticamente
When Se cancelen las pólizas
Then Deben quedar canceladas las pólizas con un motivo de cancelación  por no pago
And Se debe cancelar a la fecha de morosidad que informe Billing y con el método de prorrata

Examples:
||
||