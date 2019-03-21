package br.com.frame.util.reports;

public class ReportVariables {

    static String nome_cT;
    static String expected_result;
    static String actual_result;
    static String status;
    static String objetivo;
    static String ambiente;
    static String ciclo;
    static String sprint;
    static String executor;


    public static String getExecutor() {
        return executor;
    }

    public static void setExecutor(String executor) {
        ReportVariables.executor = executor;
    }

    public static String getObjetivo() {
        return objetivo;
    }

    public static void setObjetivo(String objetivo) {
        ReportVariables.objetivo = objetivo;
    }

    public static String getAmbiente() {
        return ambiente;
    }

    public static void setAmbiente(String ambiente) {
        ReportVariables.ambiente = ambiente;
    }

    public static String getCiclo() {
        return ciclo;
    }

    public static void setCiclo(String ciclo) {
        ReportVariables.ciclo = ciclo;
    }

    public static String getSprint() {
        return sprint;
    }

    public static void setSprint(String sprint) {
        ReportVariables.sprint = sprint;
    }

    public static String getNome_cT() {
        return nome_cT;
    }

    public static void setNome_cT(String nome_cT) {
        ReportVariables.nome_cT = nome_cT;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        ReportVariables.status = status;
    }

    public static String getValor_esperado() {
        return expected_result;
    }

    public static void setValor_esperado(String valor_esperado) {
        ReportVariables.expected_result = valor_esperado;
    }

    public static String getActual_result() {
        return actual_result;
    }

    public static void setActual_result(String actual_result) {
        ReportVariables.actual_result = actual_result;
    }

    public static void setCommunValues() {
        setExecutor("Teste Automatizado");
        setObjetivo("Garantir a integridade dos valores recebidos e enviados para o SalesForce");
        setAmbiente("QA");
        setSprint("NA");
        setCiclo("NA");
    }


    public void cleanAllVariables() {
        setActual_result("");
        setValor_esperado("");
        setStatus("");
        setNome_cT("");
    }
}


