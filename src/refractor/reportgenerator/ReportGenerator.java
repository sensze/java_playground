package refractor.reportgenerator;

public class ReportGenerator {
    private String reportTitle;
    private String reportContent;
    private ReportFormatter reportFormatter;

    public ReportGenerator(String title, String content, ReportFormatter reportFormatter) {
        this.reportTitle = title;
        this.reportContent = content;
        this.reportFormatter = reportFormatter;
    }

    public void generateReport() {
        reportFormatter.formatAndPrint(reportTitle, reportContent);
    }
}
