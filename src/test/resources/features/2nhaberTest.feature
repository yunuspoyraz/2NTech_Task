Feature: 2nhaber_test

  Background:
    Given 2nhaber websitesine git

    @navbarTest
    Scenario: TC01_navbar_menu_test
      When navbar menu tiklanabilir oldugunu kontrol et ve dogrula

    @haberSearchTest
    Scenario Outline: TC02_haber_search_Test
    When search butonuna tikla
    Then  "<icerik>" için arama yap
    And  "<sayi>" inci habere git ve teyit et.


    Examples: data
      | icerik    | sayi |
      | istanbul  |   8  |



