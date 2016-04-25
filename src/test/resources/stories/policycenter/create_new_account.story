Meta:

Narrative:
Como usuario, quiero ser capaz de crear nuevas cuentas en policy center

Scenario: crear una cuenta para un contacto persona natural.
Given que me encuentro en el sistema de policy center como usuario <user> , contrasena <pass> y Pais <country>
When Quiera crear una cuenta para un contacto persona natural e ingrese la informacion en los campos tipo de documento <tipo_documento>, numero de documento <documento>, Primer nombre <primer_nombre>, primer apellido <primer_apellido>, tipo de direccion <tipo_direccion> y direccion <direccion>
Then se debe crear la cuenta con el cliente persona natural

Examples:

|user|pass|country|tipo_documento|documento|primer_nombre|primer_apellido|tipo_direccion|direccion|
|pedrvevi|pedrvevi|Colombia|cc|95011512020|Nelson|Mosquera|Vivienda|Calle 44A|