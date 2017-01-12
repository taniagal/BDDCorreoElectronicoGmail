Excepciones Sarlaft Autos

Meta:
@lote1
@issue #CDSEG-5577
@tag automator: tania_grajales_alzate
@Sprint 12

Narrative:
Como usuario de policy center
Quiero  que al momento de validar si una persona requiere o no sarlaft, se realicen algunas validaciones
Para que en el caso de que alguna se cumpla no se debe solicitar sarlaft para ninguna de las figuras asi se requiera.

Scenario: Validar sarlaft con validaciones de autos en tomador
Meta:@manual
Given se esta cotizando una poliza nueva
When adicione un segundo tomador que requiera sarlaft
And se adicione alguna validacion de autos
And se expida la poliza
Then no se debe frenar la expediciion

Scenario: Validar sarlaft con validaciones de autos en asegurado-modificacion
Meta:@manual
Given se tiene un poliza expedida de autos
When entre a modificar la poliza
And se adicione un asegurado que requiera salaft
And se adicione alguna validacion de autos
And se expida la poliza
Then no se debe frenar la expedicion


Scenario: Validar sarlaft en modificacion con tomador y/o asegurado
Meta:@manual
Given se tiene un poliza expedida de autos
When entre a modificar la poliza
And se adicione un tomador secundario que requiera salaft
And se expida la poliza
Then debe de sacar un mensaje requiriendo sarlaft

