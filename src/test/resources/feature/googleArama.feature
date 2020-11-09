@googleArama
Feature: Google Arama

  Background: Google sayfasina gider
    Given kullanici google sayfasina gider

    @cucumberArama
  Scenario: TC01_Kullanici google cucumber aramsi yap
      And arama kutusuna cucumber yazar
     Then arama sonuclari sayfasinin basligini kontrol eder

  @seleniumArama
  Scenario: TC02_kullanici google da selenium aramasi yapar
    And arama kutusuna selenium yazar
    Then arama sonuclari sayfasinin sonuc sayisini kontrol eder