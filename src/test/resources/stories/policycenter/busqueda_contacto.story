Meta:

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de buscar elementos específicos asociados a un contacto

Scenario: Consultar contacto de tipo persona juridica por razon social
Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
And estoy en busqueda de contactos
When quiera consultar contacto de tipo persona juridica <tipoDoc> por <razonSocial>
Then debo ver la informacion del contacto de tipo persona juridica

Examples:
|usuario|contrasena|tipoDoc |razonSocial|
|su     |gw        |NIT     |La Vaquita|