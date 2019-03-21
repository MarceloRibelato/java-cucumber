package br.com.runTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * @author Marcelo
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"},
        features = {"resources/Features"},
        glue = {"br.com.frame.steps"},
        tags = {"@teste"})


public class Runner {

    @BeforeClass
    public static void setup() {
        System.out.println("Ran the before");
    }

    @AfterClass
    public static void teardown() {
       // HtmlReport.main();
    }
}
