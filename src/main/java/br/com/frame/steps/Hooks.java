package br.com.frame.steps;

import br.com.frame.util.BaseTest;
import br.com.frame.util.communs.Web;
import br.com.frame.util.reports.GeradorWordSteps;
import br.com.frame.util.reports.HtmlReport;
import br.com.frame.util.reports.ReportVariables;
import br.com.frame.util.reports.VideoReord;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BaseTest {

    VideoReord videoReord = new VideoReord();

    @Before()
    public void beforeScenario(Scenario scenario) {
        initializeWebApplication(Web.CHROME);
        ReportVariables.setNome_cT(scenario.getName());
        scenario.toString();
        System.out.println("Teste execução Hooks Web");
        try {
            videoReord.startRecording();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After()
    public void afterScenario(Scenario scenario) throws Exception {
        ReportVariables.setStatus(scenario.getStatus());
        GeradorWordSteps geradorWordSteps = new GeradorWordSteps();
        videoReord.stopRecording();
        geradorWordSteps.generateWord();
        closeWeb();
    }

}
