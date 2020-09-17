package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature file",
                  glue="com.stepdefinition",
                  monochrome=true,
                  dryRun=false,
                  plugin="html:target/reports.html")
public class TestRunner {

}
