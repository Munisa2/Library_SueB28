package com.librarySueB28.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },

        features = "src/test/resources/features",
        glue = "com/librarySueB28/stepDefs",
        dryRun = false,
        tags = "",
        publish = true


)





public class CukesRunner {}