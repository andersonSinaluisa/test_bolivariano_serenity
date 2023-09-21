Feature: Abrir una cuenta como laboral dependiente

  @Onboarding
  @Serenity
  Scenario Outline:
    Given que el usuario ingresa a la pagina de inicio
      | <dispositivo> |
    When el usuario ingresa sus datos y hace click en el boton de continuar
      | <cedula> | <codigoDactilar> |
    Then el usuario es redirigido a la pagina de confirmacion de datos
    When el usuario confirma sus datos e ingresa sus datos faltantes
      | <celular> | <correo> | <ciudad> | <direccion> | <oficina> |
    And acepta los terminos y condiciones
    And hace click en el boton de continuar
    Then el usuario es redirigido a la pagina de ingresar domicilio
    When el usuario ingresa sus datos de domicilio
      | <ciudad> | <parroquia> | <direccionCompleta> | <descripcionCasa> | <referenciaCasa> | <numeroDomicilio> | <situacionLaboral> | <dependienteLaboral> |
    Then el usuario es redirigido a la pagina de ingresar datos laborales
    When el usuario ingresa sus datos laborales
      | <nombreEmpresa> | <antiguedad> | <ingresoMensual> | <gastoMensual> | <direccion_trabajo> | <referencia> | <telefonoTrabajo> |
    Then el usuario es redirigido a la pagina de ingresar datos de declaracion patrimonial
    When el usuario ingresa sus datos de declaracion patrimonial
      | <posee_activos_ni_pasivos> | <activos> | <pasivos> | <tiene_otra_nacionalidad> | <tiene_residencia_eeuu> | <tiene_efectos_tributarios> |
    Then el usuario es redirigido a la pagina venta cruzada
    When el usuario selecciona el producto de venta cruzada si lo desea
      | <producto> |
    Then el usuario es redirigido a la pagina de contrato
    When el usuario acepta los terminos y condiciones y contratos
    Then el usuario es redirigido a la pagina de otp
    When el usuario ingresa el codigo otp
      | <codigoOtp> |
    Then el usuario es redirigido a la pagina de resumen
    And debe ver el numero de cuenta generada

    Examples:
        | dispositivo | cedula | codigoDactilar | celular | correo | ciudad | oficina | direccion | parroquia | direccionCompleta | descripcionCasa | referenciaCasa | numeroDomicilio | situacionLaboral | dependienteLaboral | nombreEmpresa | antiguedad | ingresoMensual | gastoMensual| direccion_trabajo | referencia | telefonoTrabajo | posee_activos_ni_pasivos | activos | pasivos | tiene_otra_nacionalidad | tiene_residencia_eeuu | tiene_efectos_tributarios | producto | codigoOtp |
        |web|0602206443 |E1EEEEEEEE|0956856542|admin.cc@xupiv.com|Guayaquil|9 De Octubre|Av publica|Tarqui|Av publica|Casa blanca|en la esquina|2325445|Dependiente  |Público|Banco bolivariano|1|1500|400|DireccionTrabajo1|Referencia1|2232453|Si|50000|20000|No|No|No|Producto1|111111|
        |web|0602206443|E1EEEEEEEE|0932568565|admin.cc@xupiv.com|Guayaquil|9 De Octubre |Av publica|Tarqui|Av publica|Casa blanca|en la esquina|2325445|Independiente|Privado|Integrity|2|1500|400|DireccionTrabajo1|Referencia1|4523256|Si|50000|20000|No|No|No|Producto1|111111|

