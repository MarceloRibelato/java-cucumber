package br.com.frame.util.reports;


import com.rajatthareja.reportbuilder.Color;
import com.rajatthareja.reportbuilder.ReportBuilder;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HtmlReport {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static DateFormat dateFormatFile = new SimpleDateFormat("dd-M-yyyy");
    private static Date date = new Date();

    public static void main(String[] args) {

        // Create ReportBuilder Object
        ReportBuilder reportBuilder = new ReportBuilder();

        reportBuilder.setReportDirectory("evidence/html/");

        // Set output report file name
        reportBuilder.setReportFileName(dateFormatFile.format(date));

        // Set Report Title
        reportBuilder.setReportTitle("Sr.Barriga");
        reportBuilder.setReportColor(Color.CYAN);

        // Enable voice control for report
        reportBuilder.enableVoiceControl();

        // Add additional info for Report
        reportBuilder.setAdditionalInfo("Environment", "My Environment");
        reportBuilder.setAdditionalInfo("Date", dateFormat.format(date));

        // Create list or report Files or Directories or URLs or JSONObject or JSONString
        List<Object> cucumberJsonReports = new ArrayList<>();
        cucumberJsonReports.add(new File("target/cucumber.json"));
        cucumberJsonReports.add(new File("target/"));

        // Build your report
        reportBuilder.build(cucumberJsonReports);
    }
}
