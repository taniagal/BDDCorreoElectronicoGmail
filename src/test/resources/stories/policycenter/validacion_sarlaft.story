Validacion Sarlaft

Meta:

@lote4
@issue #CDSEG-4086
@tag equipo: 5
@local
@Sprint 9

Narrative:
Como usuario de negocio
Quiero validar sin un tomador o asegurado requiere sarlaft al momento de expedir una poliza de autos o MRC

Scenario: Validar si requiere sarlaft – Tomador / Asegurado (Diferente  DNI y No. Identificacion)
Meta: @manual
Given estoy expidiendo una poliza con tomador y asegurado o diferentes
And sin sarlaft en la compania
When seleccione la opcion expedir poliza
Then el sistema debe informar que se requiere sarlaft para el tomador y asegurado

Scenario: Validar Si requiere Sarlaft  - Tomador / Asegurado (Mismo DNI y No. Identificacion)
Meta: @manual
Given estoy expidiendo una poliza con el mismo DNI  y No. Identificacion para el tomador, asegurado y beneficiario gratuito
When seleccione la opcion expedir poliza
Then el sistema debe informar que es requerido el sarlaft para un solo DNI y numero de identificacion

Scenario: No requiere sarlaft Tomador / Asegurado (Diferente DNI y No. Identificacion)
Meta: @manual
Given estoy expidiendo una poliza con el mismo DNI  y No. Identificacion para el tomador, asegurado y beneficiario gratuito
When seleccione la opcion expedir poliza
Then el sistema debe informar que no se requiere el sarlaft

Scenario: Validar Sarlaft MRC - Licitacion publica
Meta: @manual
Given estoy expidiendo una poliza identificada como Licitacion publica con el mismo o diferente DNI y No. Identificacion para el tomador, asegurado y beneficiario
When seleccione la opcion expedir poliza
Then no se debe solicitar sarlaft

Scenario: Validar Sarlaft MRC - Coaseguro
Meta: @manual
Given estoy expidiendo una poliza identificada como CoaSeguro y sura no es lider, con el mismo o diferente DNI y No. Identificacion para el tomador, asegurado y beneficiario
When seleccione la opcion expedir poliza
Then no se debe solicitar sarlaft