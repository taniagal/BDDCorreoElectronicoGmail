Expedicion De Poliza

Meta:

@issue #SUGWUSC-15128

Narrative:
Como usuario de policy center
quiero ser capaz de emitir cambios para las pólizas de auto en PolicyCenter.

Scenario: Validacion de resumen de la poliza expedirla
Given Que tengo una cotizacion <cotizacion>
When quiera realizar una modificacion permitida
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debe mostrar el resumen de la poliza expedida con la informacion de cotizacion <infoCotizacion>, poliza <infoPoliza>, administrador de contizaciones <admorCotizacion>, nueva cotizacion <nuevaCotizacion>, escritorio <escritorio>

Examples:
|cotizacion|infoCotizacion|infoPoliza|admorCotizacion|nuevaCotizacion|escritorio|
|22222225|Ver cotización (N.° 22222225)|Ver póliza (N.°|Ir al administrador de cotizaciones para esta cuenta|Hacer una cotización para una cuenta diferente|Ir al escritorio|
