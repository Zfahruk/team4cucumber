Feature: Google da Parametreli Arama
  @webdriverArama
  Scenario: TC03_kullanici googleda arama yapar
    Given kullanici google sayfasina gider
    And kullanici "webdriver" kelimesini arar
    Then kullanici sayfa basliginda "webdriver" kelimesini kontrol eder