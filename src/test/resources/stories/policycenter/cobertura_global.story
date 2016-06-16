Meta:

Narrative:
Como usuario PolicyCenter con el papel de agente, RSE , Suscriptor o el Administrador
Quiero ser capaz de entrar y mantener detalles de la ubicación.

Feature: Entrar y mantener detalles de la ubicación


Scenario: Agregar una multiples ubicaciones y coberturas a una cobertura global a una póliza de MRC.

Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When agregue coberturas globales con descripcion <descripcion> , tipo de cobertura <tipoCobertura> y valor <valor>
Then debe mostrarme las coberturas incluidas y las ubicaciones cubiertas

Examples:
|cuenta     |producto           |descripcion        |tipoCobertura        | valor    |
|C001888888 |Propiedad comercial|cobertura global 1 |Multiples ubicaciones| 15000000 |

Scenario: Agregar una unica cobertura a todas las ubicaciones en una cobertura global en una póliza de MRC.

Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When agregue coberturas globales con descripcion <descripcion> , tipo de cobertura <tipoCobertura> y valor <valor>
Then debe mostrarme las coberturas incluidas y las ubicaciones cubiertas

Examples:
|cuenta     |producto           |descripcion        |tipoCobertura | valor    |
|C001888888 |Propiedad comercial|cobertura global 2 |Una covertura | 15000000 |
