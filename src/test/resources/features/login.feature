Feature: Login

  @test
  Scenario: Iniciar sesion

    Given que me enuentro en la pagina de login de Swaglabs con usuario standard
    Then valido que deberia aparecer el titulo de "PRODUCTS"
    And tambien valido que al menos exista un item