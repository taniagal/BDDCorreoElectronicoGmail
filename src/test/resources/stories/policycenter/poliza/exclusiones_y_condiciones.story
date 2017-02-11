Meta:
@tag equipo: 2
@lote2
@Sprint 14

Narrative:
Como usuario de PolicyCenter
Quiero seleccionar las condiciones, Exclusiones y Clausulas
Para poder establecer alcances a las polizas


Scenario: 1 Visualizacion y búsqueda de lista preliminar de exclusiones y condiciones en CP
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1973      |OZIL         |SNEIDER        |DIRECCION DE RESIDENCIA|CALLE 27F #60-69|Antioquia   |Medellin|INT-3 |
When ingrese a exclusiones y condiciones
Then se deben mostrar las siguientes opciones en exclusiones en <estadouno>
| OPCIONES_MENU                                                                                                                                                                                                   |
| Caída de globos                                                                                                                                                                                                 |
| Los costos y gastos en que incurre el asegurado para la demostración de la ocurrencia y cuantía del siniestro                                                                                                   |
| Pérdida de contenidos en tanques debido a daños materiales cubiertos por este seguro                                                                                                                            |
| Cualquier otra cobertura no especificada en estos términos y condiciones                                                                                                                                        |
| Las pérdidas provenientes de lucro cesante por rotura de maquinaria                                                                                                                                             |
| Las pérdidas provenientes de lucro cesante por daño interno de equipo electrónico                                                                                                                               |
| Las pérdidas provenientes de lucro cesante por daño interno de hurto o sustracción                                                                                                                              |
| Sustracción sin violencia                                                                                                                                                                                       |
| Hurto simple y/o desaparición misteriosa                                                                                                                                                                        |
| Incendio de algodón como materia prima, incluyendo, pero sin limitarse a algodón en pacas o en semillas                                                                                                         |
| El daño interno de vehículos automotores, motocicletas, aeronaves, embarcaciones, montacargas y cargadores                                                                                                      |
| El daño interno de equipo electrónico                                                                                                                                                                           |
| Rotura de maquinaria                                                                                                                                                                                            |
| Daños o pérdidas materiales de materiales en fusión                                                                                                                                                             |
| Obras civiles terminadas tales como pero no limitados a carreteras, puentes, embalses, represas, canales, túneles, muelles, murallas de mar, embarcaderos, malecones, diques, pozos, oleoductos y gasoducto     |
| Se excluye expresamente la obsolescencia tecnológica y/o pérdida de uso, se indemnizará únicamente los equipos que sufran daños físicos o materiales y no se indemnizarán pérdidas indirectas o consecuenciales |
| Índice variable                                                                                                                                                                                                 |
| Condiciones generales                                                                                                                                                                                           |
| Condiciones adicionales                                                                                                                                                                                         |
| Revocación de la póliza                                                                                                                                                                                         |
| Sublímite                                                                                                                                                                                                       |
| Límite                                                                                                                                                                                                          |
When ingrese a agregar exclusion o condicion
And busque la exclusion o condicion <palabraabuscar>
Then se debe mostrar en la busqueda
|busqueda|
|Condiciones aplicables a la cobertura de suelos y terrenos|



Examples:
| estadouno | palabraabuscar                                             |
| Visible   | Condiciones Aplicables A La Cobertura De Suelos Y Terrenos |


Scenario: 2 Visualizacion de la opcion exclusiones y condiciones en PA
Given estoy cotizando una poliza de autos:
|oficina|agente_oficina|organizacion|producto |tipoPoliza|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1059   |DIRECTO       |Sura        |Autos    |Individual|CEDULA DE CIUDADANIA|02/12/1990      |YEFERSON        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When ingrese a edificios y ubicaciones
Then se deben mostrar en el menu lateral las siguientes opciones en <estado>
| OPCIONES_MENU             |
| Exclusiones y Condiciones |

Examples:
| estado  | palabraabuscar                                             |
| Visible | Condiciones aplicables a la cobertura de suelos y terrenos |


