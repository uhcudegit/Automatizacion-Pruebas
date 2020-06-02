package com.ejemplo.base.runners.web;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "", 
		glue = "", 
		tags = "", 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE
		)


public class RunnerProject {

}
