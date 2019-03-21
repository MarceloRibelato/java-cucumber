package br.com.frame.util.reports;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.frame.util.reports.FrameworkWordEvidence;
import br.com.frame.util.reports.ReportVariables;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;

public class GeradorWordSteps {
	
	 public void generateWord() throws Exception {
	        String path = "evidence/word/result/";
	        String scenary = ReportVariables.getNome_cT();
	        FrameworkWordEvidence evidence = new FrameworkWordEvidence();
	        WordprocessingMLPackage template = evidence.getTemplate("evidence/word/template/template_evidencias.docx");
		 	evidence.replacePlaceholder(template, scenary, "<scenary>");
		 	evidence.replacePlaceholder(template, ReportVariables.getAmbiente(), "<ambiente>");
	        String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
	        evidence.replacePlaceholder(template, timeStamp, "<data>");
	        evidence.replacePlaceholder(template, ReportVariables.getNome_cT(), "<id_nomeCT>");
	        evidence.replacePlaceholder(template, ReportVariables.getObjetivo(), "<objetivo>");
	        evidence.replacePlaceholder(template, ReportVariables.getValor_esperado(), "<resultado_esperado>");
	        evidence.replacePlaceholder(template, ReportVariables.getStatus(), "<resultado_obtido>");
	        evidence.replacePlaceholder(template, ReportVariables.getExecutor(), "<executor>");
	        evidence.replacePlaceholder(template, ReportVariables.getSprint(), "<sp>");
	        evidence.replacePlaceholder(template, ReportVariables.getCiclo(), "<cdt>");
	        evidence.createWordEvidence(template, path, scenary);
	    }

}
