@examples
Feature: Google da Birden cok veri
  Scenario Outline: TC04_google arama testi
    Given kullanici google sayfasina gider
    And kullanici "<kelimeler>" arar
    Then kullanici sayfa basliginda "<kelimeler>" kelimelerini kontrol eder

    Examples: Test verileri
    |kelimeler|
    |cucumber |
    |selenium |
    |webdriver|
