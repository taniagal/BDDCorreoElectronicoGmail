Meta:

Narrative:
Quiero ser capaz de crear un participante de una cuenta y obtener toda su informacion

Scenario: scenario description
GivenStories: stories/policycenter/login_policy.story
Given que existe una cuenta <numCuenta>
When quiera crear participantes
Then debo poder visualizar el participante asociado en el listado de
participante de la cuenta

Examples:
|numCuenta|
|C000888888|