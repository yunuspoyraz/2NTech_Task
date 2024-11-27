Feature: 2ntech_basvuru_test

  Background:
    Given 2ntech websitesine git


  @basvuruTest
  Scenario Outline: TC01_basvuru_form_Test
    When ad soyad "<Ad_Soyad>" gir
    Then dogum tarihi "<Dogum_Tarihi>" gir
    Then TCKN "<TCKN>" gir
    Then cep telefonu "<Cep_Telefonu>" gir
    Then mail adresi "<Email>" gir
    Then CV yukle
    Then Egitim bilgisi "<Egitim_Bilgisi>" sec
    Then Submit butonuna tıkla
    Then Pozisyon "<Pozisyon>" sec
    Then Gonder butonuna bas
    And  Pozisyon basvurusunu teyit et




    Examples: data
      | Ad_Soyad     | Dogum_Tarihi | TCKN        | Cep_Telefonu  | Email                   | Egitim_Bilgisi | Egitim_Bilgisi  | Pozisyon |
      | Yunus Poyraz | 02.08.1989   | 13405189652 |  05454540665  | yunuspoyrazqa@gmail.com |      2         |      2          |     7     |



