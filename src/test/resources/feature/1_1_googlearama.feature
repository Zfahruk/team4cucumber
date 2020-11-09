# Feature US olarak dusunulebilir
  @googleArama
Feature: Google Arama

  Background: Google Sayfasina gider
    Given kullanici google sayfasina gider


  # Scenario: ise o US'e ait TC'ler olarak dusunulur
  @cucumberArama
  Scenario: TC01_Kullanici google cucumber aramsi yapar
    And arama kutusuna cucumber yazar
    Then arama sonuclari sayfasinin basligini kontrol eder

    @seleniumArama
    Scenario: TC02_kullanici googleda selenium aramasi yapar
      And arama kutusuna selenium yazar
      Then arama sonuclari sayfasinin sonuc sayisini kontrol eder

