# new feature
# Tags: optional

Feature: Carga de documentos

  Scenario: Carga de documentos
    Given el usuario ingresa a la pantalla de carga de documentos
    When el usuario carga un documento
    Then el documento se carga correctamente