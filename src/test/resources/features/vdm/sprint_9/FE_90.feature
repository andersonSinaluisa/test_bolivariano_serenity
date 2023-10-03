Feature: Leer y descargar archivos firmados electrónicamente desde el VDM

  OverView: Como operativo
  Deseo poder leer y/o descargar archivos firmados electrónicamente desde el VDM
  Para confirmar su validez legal cuando sea necesario

  Background:
    Given que he iniciado sesión en el sistema VDM como operativo

  Scenario: Upload de documento sin modificar propiedades originales
    When cargo un documento firmado electrónicamente
    Then las propiedades originales del documento no deben modificarse

  Scenario: Mantener propiedades de firma en control de calidad
    When cargo un documento firmado electrónicamente
    And envío el documento a la etapa de control de calidad
    Then el documento debe mantener sus propiedades de firma digital

  Scenario: Mantener propiedades de firma en almacenamiento en bodega
    When cargo un documento firmado electrónicamente
    And almaceno el documento en la bodega
    Then el documento debe mantener sus propiedades de firma digital

  Scenario: Visualizar o descargar documentos sin leyenda incrustada por VDM
    Given que el check está habilitado
    When selecciono un documento y lo visualizo o descargo
    Then el documento no debe presentar la leyenda incrustada por VDM

  Scenario: Check deshabilitado en la pantalla de consulta
    When accedo a la pantalla de consulta de documentos por cliente
    Then el check debe estar deshabilitado por defecto

  Scenario: Check habilitado al realizar una consulta de documentos
    When realizo una consulta de documentos por cliente
    Then el check debe habilitarse

  Scenario: Aplicar condición del check a varios documentos seleccionados
    Given que el check está habilitado
    When selecciono más de un archivo y los visualizo o descargo
    Then la condición del check debe aplicarse a cada documento seleccionado

