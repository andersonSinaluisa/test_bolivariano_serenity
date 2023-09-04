Feature: Abrir una cuenta como laboral dependiente


  Scenario Outline:
    Given que el usuario ingresa a la pagina de inicio
      | <dispositivo> |
    When el usuario ingresa sus datos y hace click en el boton de continuar
      | <cedula> | <codigoDactilar> |
    Then el usuario es redirigido a la pagina de confirmacion de datos
    When el usuario confirma sus datos e ingresa sus datos faltantes
      | <celular> | <correo> | <ciudad> | <direccion> |
    And acepta los terminos y condiciones
    And hace click en el boton de continuar
    Then el usuario es redirigido a la pagina de ingresar domicilio
    When el usuario ingresa sus datos de domicilio
      | <ciudad> | <parroquia> | <direccionCompleta> | <descripcionCasa> | <referenciaCasa> | <numeroDomicilio> | <situacionLaboral> | <dependienteLaboral> |
    And hace click en el boton de continuar
    Then el usuario es redirigido a la pagina de ingresar datos laborales
    When el usuario ingresa sus datos laborales
      | <nombreEmpresa> | <antiguedad> | <ingresoMensual> | <direccion_trabajo> | <referencia> | <telefonoTrabajo> |
    And hace click en el boton de continuar
    Then el usuario es redirigido a la pagina de ingresar datos de declaracion patrimonial
    When el usuario ingresa sus datos de declaracion patrimonial
      | <posee_activos> | <posse_pasivos> | <activos> | <pasivos> | <tiene_otra_nacionalidad> | <tiene_residencia_eeuu> | <tiene_efectos_tributarios> |
    And hace click en el boton de continuar
    Then el usuario es redirigido a la pagina venta cruzada
    When el usuario selecciona el producto de venta cruzada si lo desea
      | <producto> |
    And hace click en el boton de continuar
    Then el usuario es redirigido a la pagina de contrato
    When el usuario acepta los terminos y condiciones y contratos
    And hace click en el boton de continuar
    Then el usuario es redirigido a la pagina de otp
    When el usuario ingresa el codigo otp
      | <codigoOtp> |
    And hace click en el boton de continuar
    Then el usuario es redirigido a la pagina de resumen
    And debe ver el numero de cuenta generada

    Examples:
      | dispositivo  | cedula  | codigoDactilar  | celular  | correo   | ciudad   | direccion   | parroquia   | direccionCompleta   | descripcionCasa   | referenciaCasa   | numeroDomicilio   | situacionLaboral   | dependienteLaboral   | nombreEmpresa   | antiguedad  | ingresoMensual  | direccion_trabajo   | referencia   | telefonoTrabajo  | posee_activos  | posse_pasivos  | activos  | pasivos  | tiene_otra_nacionalidad  | tiene_residencia_eeuu  | tiene_efectos_tributarios  | producto  | codigoOtp  | numeroCuentaGenerada  |
      | web | 0913837910 | E1EEEEEEEE         | 0953236547 | correo  | Ciudad1  | Direccion1  | Parroquia1  | DireccionCompleta1  | Descripcion1  | Referencia1  | Numero1          | Situacion1  | Dependiente1  | Empresa1  | Antiguedad1 | Ingreso1        | DireccionTrabajo1  | Referencia1  | Telefono1         | Si             | No             | 50000   | 20000   | No                       | Si                     | No                        | Producto1 | OTP1      | NumeroCuenta1          |
      | web | 0913837910 | E1EEEEEEEE         | 0932145685 | Correo1  | Ciudad1  | Direccion1  | Parroquia1  | DireccionCompleta1  | Descripcion1  | Referencia1  | Numero1          | Situacion1  | Dependiente1  | Empresa1  | Antiguedad1 | Ingreso1        | DireccionTrabajo1  | Referencia1  | Telefono1         | Si             | No             | 50000   | 20000   | No                       | Si                     | No                        | Producto1 | OTP1      | NumeroCuenta1          |


