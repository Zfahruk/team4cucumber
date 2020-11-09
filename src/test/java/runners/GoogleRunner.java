package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

        @RunWith(Cucumber.class)
        @CucumberOptions(

                plugin = {"html:target/default-cucumber-reports",
                        "json:target/json-reports/cucumber.json",
                        "junit:target/xml/cucumber.xml"
                },


                features="src/test/resources/feature",
                   glue ="stepdefinitions", //testlerimizi yazdigimiz paket ismi yazilir
                tags= "@googleArama",
                dryRun =  // false
                          true
)

public class GoogleRunner {


}
