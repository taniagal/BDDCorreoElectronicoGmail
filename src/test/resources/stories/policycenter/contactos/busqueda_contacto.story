Busqueda Contacto

Meta:
@lote1
@tag equipo: 5, sprint: 1

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de buscar elementos específicos asociados a un contacto

Scenario: Mostrar labels correctos en espaniol para persona natural
GivenStories: stories/policycenter/login_policy.story
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por primer nombre <primerNombre> y primer apellido <primerApellido>
Then los labels se deben mostrar como se indica en el UIFields para persona natural

Examples:
| tipoDoc              | primerNombre | primerApellido |
| CEDULA DE CIUDADANIA | YURLEDYS     | GALLEGO        |


Scenario: Consultar contacto de tipo persona natural unicamente por primer nombre
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por primer nombre <primerNombre>
Then no debo ver la informacion del contacto de tipo persona natural
And debo ver un mensaje <mensaje> de alerta indicando que se debe ingresar al menos dos de los campos incluido un nombre

Examples:
| tipoDoc              | primerNombre | mensaje                                                                                                                                                                                                                                                                          |
| CEDULA DE CIUDADANIA | YURLEDYS     | No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas). |

Scenario: Consultar contacto de tipo persona natural unicamente por segundo nombre
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por segundo nombre <segundoNombre>
Then no debo ver la informacion del contacto de tipo persona natural
And debo ver un mensaje <mensaje> de alerta indicando que se debe ingresar al menos dos de los campos incluido un nombre

Examples:
| tipoDoc              | segundoNombre | mensaje                                                                                                                                                                                                                                                                          |
| CEDULA DE CIUDADANIA | PAOLA         | No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas). |

Scenario: Consultar contacto de tipo persona natural unicamente por primer apellido
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por primer apellido <primerApellido>
Then no debo ver la informacion del contacto de tipo persona natural
And debo ver un mensaje <mensaje> de alerta indicando que se debe ingresar al menos dos de los campos incluido un nombre

Examples:
| tipoDoc              | primerApellido | mensaje                                                                                                                                                                                                                                                                          |
| CEDULA DE CIUDADANIA | GALLEGO        | No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas). |

Scenario: Consultar contacto de tipo persona natural unicamente por segundo apellido
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por segundo apellido <segundoApellido>
Then no debo ver la informacion del contacto de tipo persona natural
And debo ver un mensaje <mensaje> de alerta indicando que se debe ingresar al menos dos de los campos incluido un nombre

Examples:
| tipoDoc              | segundoApellido | mensaje                                                                                                                                                                                                                                                                          |
| CEDULA DE CIUDADANIA | TORRES          | No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas). |

Scenario: Consultar contacto de tipo persona natural por primer nombre y primer apellido
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por primer nombre <primerNombre> y primer apellido <primerApellido>
Then debo ver la informacion del contacto de tipo persona natural <filtro1> <filtro2>

Examples:
| tipoDoc              | primerNombre | primerApellido | filtro1  | filtro2 |
| CEDULA DE CIUDADANIA | YURLEDYS     | GALLEGO        | YURLEDYS | GALLEGO |

Scenario: Consultar contacto de tipo persona natural por segundo nombre y segundo apellido
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por segundo nombre <segundoNombre> y segundo apellido <segundoApellido>
Then debo ver la informacion del contacto de tipo persona natural <filtro1> <filtro2>

Examples:
| tipoDoc              | segundoNombre | segundoApellido | filtro1  | filtro2 |
| CEDULA DE CIUDADANIA | PAOLA         | TORRES          | YURLEDYS | GALLEGO |

Scenario: Consultar contacto de tipo persona natural por primer nombre y segundo apellido
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por primer nombre <primerNombre> y segundo apellido <segundoApellido>
Then debo ver la informacion del contacto de tipo persona natural <filtro1> <filtro2>

Examples:
| tipoDoc              | primerNombre | segundoApellido | filtro1  | filtro2 |
| CEDULA DE CIUDADANIA | YURLEDYS     | TORRES          | YURLEDYS | GALLEGO |

Scenario: Consultar contacto de tipo persona natural por segundo nombre y primer apellido
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por segundo nombre <segundoNombre> y primer apellido <primerApellido>
Then debo ver la informacion del contacto de tipo persona natural <filtro1> <filtro2>

Examples:
| tipoDoc              | segundoNombre | primerApellido | filtro1  | filtro2 |
| CEDULA DE CIUDADANIA | PAOLA         | GALLEGO        | YURLEDYS | GALLEGO |

Scenario: Consultar contacto de tipo persona natural por primer apellido y segundo apellido
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then no debo ver la informacion del contacto de tipo persona natural
And debo ver un mensaje <mensaje> de alerta indicando que se debe ingresar al menos dos de los campos incluido un nombre

Examples:
| tipoDoc              | primerApellido | segundoApellido | mensaje                                                                                                                                                                                                                                                                          |
| CEDULA DE CIUDADANIA | GALLEGO        | TORRES          | No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas). |

Scenario: Consultar contacto de tipo persona natural por tipo y numero de identificacion
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural por tipo <tipoDoc> y numero de identificacion <numDoc>
Then debo ver la informacion del contacto de tipo persona natural <filtro1> <filtro2>

Examples:
| tipoDoc              | numDoc     | filtro1  | filtro2 |
| CEDULA DE CIUDADANIA | 1234567890 | YURLEDYS | GALLEGO |

Scenario: Mostrar labels correctos en espaniol para persona juridica
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona juridica <tipoDoc> por razon social <razonSocial>
Then los labels se deben mostrar como se indica en el UIFields para persona juridica

Examples:
| tipoDoc | razonSocial         |
| NIT     | VARIEDADES YURLEDYS |

Scenario: Consultar contacto de tipo persona juridica unicamente por tipo de identificacion
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona juridica por tipo de documento <tipoDoc>
Then no debo ver la informacion del contacto de tipo persona juridica
And debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento

Examples:
| tipoDoc | mensaje                                                                                                                                                                                                                                                                          |
| NIT     | No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas). |

Scenario: Consultar contacto de tipo persona natural unicamente por tipo de identificacion
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural por tipo de documento <tipoDoc>
Then no debo ver la informacion del contacto de tipo persona natural
And debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento

Examples:
| tipoDoc              | mensaje                                                                                                                                                                                                                                                                          |
| CEDULA DE CIUDADANIA | No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas). |

Scenario: Consultar contacto de tipo persona juridica unicamente por numero de identificacion
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona juridica <tipoDoc> por numero de documento <numDoc>
Then no debo ver la informacion del contacto de tipo persona juridica
And debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento

Examples:
| tipoDoc   | numDoc     | mensaje                                                                                                                                                                                                                                                                          |
| <ninguno> | 9202086744 | No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas). |

Scenario: Consultar contacto de tipo persona natural unicamente por numero de identificacion
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por numero de documento <numDoc>
Then no debo ver la informacion del contacto de tipo persona natural
And debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento

Examples:
| tipoDoc   | numDoc     | mensaje                                                                                                                                                                                                                                                                          |
| <ninguno> | 1234567890 | No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas). |

Scenario: Consultar contacto a traves de la opcion del menu Contactos - Buscar
Given estoy en contactos para buscar
When quiera consultar contacto de tipo persona natural <tipoDoc> por primer nombre <primerNombre> y primer apellido <primerApellido>
Then debo ver la informacion del contacto de tipo persona natural <filtro1> <filtro2>

Examples:
| tipoDoc              | primerNombre | primerApellido | filtro1  | filtro2 |
| CEDULA DE CIUDADANIA | YURLEDYS     | GALLEGO        | YURLEDYS | GALLEGO |

Scenario: Consultar contacto de tipo persona juridica por razon social
Meta:
@manual
Given estoy buscando un contacto
When quiera consultar contacto de tipo persona juridica por razon social
Then debo ver la informacion del contacto de tipo persona juridica

Scenario: Consultar contacto de tipo persona juridica por nombre comercial
Meta:
@manual
Given estoy buscando un contacto
When quiera consultar contacto de tipo persona juridica por nombre comercial
Then debo ver la informacion del contacto de tipo persona juridica

Scenario: Opcion Contactos - Buscar, persona juridica por nombre comercial
Meta:
@manual
Given estoy buscando un contacto
When quiera consultar contacto de tipo persona juridica por nombre comercial
Then debo ver la informacion del contacto de tipo persona juridica

Scenario: Consultar contacto de tipo persona juridica por tipo y numero de identificacion
Meta:
@manual
Given estoy buscando un contacto
When quiera consultar contacto de tipo persona juridica por tipo y numero de identificacion
Then debo ver la informacion del contacto de tipo persona juridica