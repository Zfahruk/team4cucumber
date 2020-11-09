package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ExplicitPage;
import utilities.Driver;

public class B_ExplicitStepDefinitions {

    ExplicitPage explicitPage =new ExplicitPage();

    @Given("kullanici {string} sayfaya gider")
    public void kullanici_sayfaya_gider(String string) {
        Driver.getDriver().get(string);

    }

    @Given("kullanici add element butonuna tiklar")
    public void kullanici_add_element_butonuna_tiklar() {
        explicitPage.addElementButonu.click();

    }

    @Then("kullanici delete webelementini gorur")
    public void kullanici_delete_webelementini_gorur() {

    }


}
