package aula.runner;

import aula.capabilities.AndroidCapabilities;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE,
        features = "src/test/features",
        glue = "aula/stepsdefinitions",
        tags = {"@teste","~@unit", "~@notIntegrated"})


public class CucumberRunner {

    @BeforeClass
    public static void tearUp(){
        AndroidCapabilities.getDriver();

    }

    @AfterClass
    public static void tearDown(){
        AndroidCapabilities.closeDriver();

    }

}
