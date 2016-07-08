Polizas de primera perdida
Meta:
@issue #SUGWUSC-14470

Narrative:
Como usuario de PolicyCenter quiero poder registrar pólizas de primera perdida para el producto MRC


Scenario: Ingresar poliza sin primera perdida.
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When ingrese un limite de cobertura inferior al valor asegurable del articulo
|valor |limite|
|350000|300000|
Then se debe mostrar el mensaje <mensaje>

Examples:
|cuenta     |producto               |mensaje                                                                                   |
|C001888888 |Multiriesgo corporativo|Debe seleccionar un tipo de primera perdida para la cobertura Danos materiales en Edificio|



Scenario: Ingresar poliza con primera perdida.
Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When ingrese un limite de cobertura inferior al valor asegurable del articulo
|valor |limite|
|450000|300000|
And seleccionde el tipo de primera perdida <tipo>
Then se debe mostrar el mensaje <mensaje>

Examples:
|cuenta     |producto               |tipo    |mensaje|
|C001888888 |Multiriesgo corporativo|Absoluta|Recuerde que para la primera perdida absoluta, debe relacionar el avaluo del bien|