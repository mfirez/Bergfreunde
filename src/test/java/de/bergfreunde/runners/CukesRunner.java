package de.bergfreunde.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "de.monochromata.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "de/bergfreunde/step_definitions",
        dryRun = false,
        tags = "@mf"


)



public class CukesRunner {



}
