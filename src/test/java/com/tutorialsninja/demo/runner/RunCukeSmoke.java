package com.tutorialsninja.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", //content rout from resources package inside the resources package
        glue = "com/tutorialsninja/demo/steps", //source rout path from steps package
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@smoke"
)

public class RunCukeSmoke extends AbstractTestNGCucumberTests {
}
