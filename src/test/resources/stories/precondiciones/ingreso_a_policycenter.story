Ingreso al módulo de PolicyCenter

Narrative:
Ingresar al módulo de PolicyCenter por medio de diferetentes roles o sistemas de logueo.

Scenario: Ingresar a Login del Módulo PolicyCenter como Super Usuario
Meta:
@id1 login_policycenter_su
Given Deseo ingresar como super usuario a PolicyCenter
When Digíto usuario pedrvevi y contraseña pedrvevi, país Colombia y enviar las credenciales
Then Debería acceder a PolicyCenter y ver página Mis actividades


