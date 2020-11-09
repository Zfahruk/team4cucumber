@googleArama
Feature: Google Arama
  Scenario: TC01_Kullanici google cucumber aramsi yapar
    Given kullanici google sayfasina gider
      And arama kutusuna cucumber yazar
     Then arama sonuclari sayfasinin basligini kontrol eder