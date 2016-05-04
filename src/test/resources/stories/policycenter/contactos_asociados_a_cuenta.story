Meta:

Narrative: Modificación de la lista de los  filtros de búsqueda de los contactos de la cuenta (Rol y tipo de persona)

Scenario: Detalle de la consulta para persona jurídica
Given que existe una cuenta con contactos de tipo persona jurídica asociados
When  quiera ver el detalle del contacto de la cuenta
Then debo ver el detalle del contacto de tipo persona jurídica

Examples:
      | TIPO DOCUMENTO      | NUMERO DOCUMENTO | RAZÓN SOCIAL        | NOMBRE COMERCIAL | DIRECCION                        |  TELEFONO | EMAIL            | CIUDAD    |
      | NIT                 | 8909015307       | INIVERSIONES JAJAJA | MOTEL LOS DOS    | KMT 0 AUTOPISTA MEDELLÍN BOGOTA  |           |compañia@une.com  | MEDELLEÍN |
      | NIT                 | 8005080014       | FERERTERIA LA TUERCA|                  | CARRERA 28 # 45 A 30             |  1234567  |                  | MANIZALES |

Scenario: Detalle de la consulta para persona natural
Given que existe una cuenta con contactos de tipo persona natural asociados
When quiera ver el detalle del contacto de la cuenta
Then debo ver el detalle del contacto de tipo persona natural
Examples:
      | TIPO DOCUMENTO      | NUMERO DOCUMENTO | PRIMER NOMBRE | SEGUNDO NOMBRE | PRIMER APELLIDO | SEGUNDO APELLIDO | DIRECCION | TELEFONO | EMAIL            | CIUDAD   |
      | CÉDULA              | 43513752         | BLANCA        | NUBIA          | HERRERA         | GARCÍA           | CALLE 20  | 1234567  |                  | MEDELLÍN |
      | CÉDULA EXTRANJERÍA  | 43513            | RAY           |                | NEWTON          |                  | CALLE 1   |          | NOTIENE@XXX.COM  | PEREIRA  |
      | TARJETA DE IDENTIDAD| 8811243513752    | ALEJANDRO     |                | PEREZ           | LARREA           | CARRERA 20| 7894562  |                  | BOGOTÁ   |
      | PASAPORTE           | 7354852-3        | SANDRA        | MILENA         | GUERRA          |                  | CALLE SUR | 3654789  | GUERRA@GMAIL.COM | MANIZALES|
      | DPLOMÁTICO          | ABC123456        | PABLO         | EMILIO         | ESCOBAR         | GUERRA           | CALLE SUR | 1478523  |                  | CUCUTA   |
      | NUIP                | 7354852-3        | PATRICIA      |                | GUERRA          |                  | CALLE SUR |          |                  | CARTAGENA|

Scenario: Detalle de roles de los contactos asociados a una cuenta
Given que existen varios contactos de tipo persona natural y/o jurídica asociados a una cuenta
When quiera ver el detalle de los roles de un contacto seleccionado
Then debo ver los roles del contacto

      | ROLES       | INFOMACIÓN ADICIONAL |
      | TITULA      |                      |

Scenario: Detalle de direcciones asociadas a un contacto
Given que existen varios contactos de tipo persona natural y/o jurídica asociados a una cuenta
And el contacto tiene mínimo una dirección
When  quiera ver las direcciones del contacto seleccionado
Then debo ver las direcciones del contacto

Examples:
      | PRINCIPAL | TIPO DIRECCIÓN | DIRECCIÓN             |
      |    X      | RESIDENCIA     | CALLE 20 # 38 A 40    |
      |           | OFICINA PPAL   | CALLE 65 # 48 122     |
      |           | OTRA           | CARRERA 27 A 78 PISO 7|
      |           | TRABAJO        | CARRERA 85 # 23       |

Scenario: Detalle de transacciones de un contacto
Given que existen varios contactos de tipo persona natural y/o jurídica asociados a una cuenta
And el contacto tiene mínimo una transacción
When quiera ver las transacciones del contacto seleccionado
Then debo ver las transacciones de contacto
Examples:
      | FECHA DE CREACIÓN | # TRANSACCIÓN | ESTADO   | # PÓLIZA   | PRODUCTO                | TIPO             | ASEGURADOR       |
      | 22/02/2016        | 0006872940    | BORRADOR | 3672569151 | AUTOS                   | CAMBIO DE PÓLIZA | SURAMERICANA S.A |
      | 23/02/16          | 0009453276    | COTIZADO | 6741979387 | MULTIRIESGO CORPORATIVO | REHABILITACIÓN   | RSA              |

Scenario: Detalle de las pólizas de un contacto en una cuenta
Given que existe un contacto de tipo persona natural y/o jurídica asociado a una cuenta
And el contacto tiene varias pólizas asociadas
When quiera ver las pólizas de un contacto
Then debo ver el detalle de las pólizas del contacto seleccionado
Examples:
      | # DE PÓLIZA | PRODUCTO                | ESTADO | FECHA INICIO VIGENCIA | FECHA DE EXPIRACIÓN |
      | 6512105591  | AUTOS                   | VIGENTE| 23/02/2016            | 23/02/2017          |
      | 6512105591  | MULTIRIESGO CORPORATIVO | VIGENTE| 23/02/2016            | 23/02/2017          |
      |
