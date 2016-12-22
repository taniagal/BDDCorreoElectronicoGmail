Cotizacion De Cancelacion

Meta:
@lote1
@issue #USC-14740
@tag automator: juan_carlos_restrepo
@local
Sprint 8

Narrative:
Como usuario del policy center
Quiero ser capaz de cotizar una cancelación de pólizas de autos.

Scenario: mostrar datos generales de poliza y valores al cotizar
Meta:
@manual
Given que existe una <poliza> y esta dentro de la vigencia en claims y billing
When necesito iniciar la cancelacion
And realice el proceso de cancelacion completo
Then se deben mostrar los campos informativos de la cancelacion

Examples:
|poliza       |
|TEST_22221241|


Scenario: mostrar datos generales de poliza y valores al cotizar (manual)
Meta:
@manual
Given que existe una <poliza> y esta dentro de la vigencia en claims y billing
When  se valide el tipo de interes adicional del beneficiario de la poliza
And Este en la pantalla de confirmación de la cancelacion y se identifique que el tipo de beneficiario es oneroso
Then Se debe mostrar un <mensaje> de alerta

Examples:
|poliza       |mensaje|
|TEST_22221241|La póliza que intenta cancelar tiene asociado el beneficario oneroso|



