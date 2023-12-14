Feature: Abrir una cuenta de ahorro online

  @Onboarding
  @Serenity
  @Scenario
  Scenario Outline: Abrir una cuenta como laboral dependiente
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
      | <cuenta_mas> | <valor_cta_mas> | <avisos24> |
    Then el usuario es redirigido a la pagina de contrato
    When el usuario acepta los terminos y condiciones y contratos
    Then el usuario es redirigido a la pagina de otp
    When el usuario ingresa el codigo otp
      | <codigoOtp> |
    Then el usuario es redirigido a la pagina de resumen
    And debe ver el numero de cuenta generada

    Examples:
        | dispositivo | cedula | codigoDactilar | celular | correo | ciudad | oficina  | direccion | parroquia | direccionCompleta | descripcionCasa | referenciaCasa | numeroDomicilio | situacionLaboral | dependienteLaboral | nombreEmpresa | antiguedad | ingresoMensual | gastoMensual| direccion_trabajo | referencia | telefonoTrabajo | posee_activos_ni_pasivos | activos | pasivos | tiene_otra_nacionalidad | tiene_residencia_eeuu | tiene_efectos_tributarios | cuenta_mas | valor_cta_mas| avisos24 | codigoOtp |
        | web|1706999750 |E1EEEEEEEEE|09116556555|clientedemo115@bolivariano.com|Guayaquil|9 De Octubre|Av publica|Tarqui|Av publica calle y la 023 95 AM|Casa blanca de un piso|en lado de la farmacia nueva|2325445|Dependiente  |Público|Canal uno|1|500|250|av publica|a lado de la farmacia|2232453|Si|50000|20000|No|No|No|Si|25|Si|111111 |
        | web|0601302623 |E1EEEEEEEEE|09568986555|clientedemo116@bolivariano.com|Guayaquil|9 De Octubre|Av publica|Tarqui|Av publica calle y la 023 95 AN|Casa blanca de un piso|en lado de la farmacia nueva|2325445|Dependiente  |Público|Canal uno|1|500|250|av publica|a lado de la farmacia|2232453|Si|50000|20000|No|No|No|Si|25|Si|111111 |
        | web|1801691104 |E1EEEEEEEEE|09132656655|clientedemo117@bolivariano.com|Guayaquil|9 De Octubre|Av publica|Tarqui|Av publica calle y la 023 95 AO|Casa blanca de un piso|en lado de la farmacia nueva|2325445|Dependiente  |Público|Canal uno|1|500|250|av publica|a lado de la farmacia|2232453|Si|50000|20000|No|No|No|Si|25|Si|111111 |
        | web|1400154116 |E1EEEEEEEEE|09112554555|clientedemo118@bolivariano.com|Guayaquil|9 De Octubre|Av publica|Tarqui|Av publica calle y la 023 95 AP|Casa blanca de un piso|en lado de la farmacia nueva|2325445|Dependiente  |Público|Canal uno|1|500|250|av publica|a lado de la farmacia|2232453|Si|50000|20000|No|No|No|Si|25|Si|111111 |
        | web|0801437815 |E1EEEEEEEEE|094656555656|clientedemo120@bolivariano.com|Guayaquil|9 De Octubre|Av publica|Tarqui|Av publica calle y la 023 95 AR|Casa blanca de un piso|en lado de la farmacia nueva|2325445|Dependiente  |Público|Canal uno|1|500|250|av publica|a lado de la farmacia|2232453|Si|50000|20000|No|No|No|Si|25|Si|111111 |
