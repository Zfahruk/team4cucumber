package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class A_1_GoogleAramaStepDefinitions {

    @Given("kullanici google sayfasina gider")
    public void kullanici_google_sayfasina_gider() {
        System.out.println("Kullanici google sayfasina gitmesini saglayacak kodlar");

        Driver.getDriver().get("https://www.google.com");


    }
    GooglePage googlePage = new GooglePage(); // Her method un icine yamaktansa buraya yazariz
    @Given("arama kutusuna cucumber yazar")
    public void arama_kutusuna_cucumber_yazar() {
        System.out.println("Kullanici google'a cucumber yazar saglayacak kodlar");


        googlePage.aramaKutusu.sendKeys("cucumber"+ Keys.ENTER);


    }

    @Then("arama sonuclari sayfasinin basligini kontrol eder")
    public void arama_sonuclari_sayfasinin_basligini_kontrol_eder() {
        System.out.println("arama sonuclari sayfasinin basligini kontrol eder kodlari");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String baslik = Driver.getDriver().getTitle();
        boolean iceriyorMu = baslik.contains("cucumber");
        Assert.assertTrue(iceriyorMu);
    }


    @Given("arama kutusuna selenium yazar")
    public void arama_kutusuna_selenium_yazar() {
        System.out.println("arama kutusuna selenium yazdiracak kodlar");
        googlePage.aramaKutusu.sendKeys("Selenium" + Keys.ENTER);




    }

    @Then("arama sonuclari sayfasinin sonuc sayisini kontrol eder")
    public void arama_sonuclari_sayfasinin_sonuc_sayisini_kontrol_eder() {
        System.out.println("arama sonuclari sayfasinin sonuc sayisini kontrol edecek kodlar");

        String sonucSayisi =googlePage.sonucSayisi.getText();
        System.out.println(sonucSayisi);

    }

    @Given("kullanici {string} kelimesini arar")
    public void kullanici_kelimesini_arar(String string) {
        googlePage.aramaKutusu.sendKeys(string + Keys.ENTER);

    }

    @Then("kullanici sayfa basliginda {string} kelimesini kontrol eder")
    public void kullanici_sayfa_basliginda_kelimesini_kontrol_eder(String string) {


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String  baslik = Driver.getDriver().getTitle();
        boolean iceriyorMu= baslik.contains(string);

        Assert.assertTrue(iceriyorMu);
    }

    @Given("kullanici {string} arar")
    public void kullanici_arar(String string) {
        System.out.println("kullanici example degerlerini calistirir");
        googlePage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }
    @Then("kullanici sayfa basliginda {string} kelimelerini kontrol eder")
    public void kullanici_sayfa_basliginda_kelimelerini_kontrol_eder(String string) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String baslikta = Driver.getDriver().getTitle();
        boolean iceriyorMu= baslikta.contains(string);

        Assert.assertTrue(iceriyorMu);
    }

}
