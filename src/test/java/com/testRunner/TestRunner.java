package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\shaki\\eclipse-workspace\\FidelisCareBDD\\src\\test\\resources\\Fidelis\\FidelisCare.feature",
glue = "com.stepDefination",monochrome = true,dryRun = false,tags = "@SanityTest",
plugin = {"pretty","html:reportBdd/cucumber.html"})


public class TestRunner {

}
