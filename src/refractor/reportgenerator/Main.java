package refractor.reportgenerator;

public class Main {
    public static void main(String[] args) {
        ReportGenerator generatePDF = new ReportGenerator("Title PDF", "Content PDF", new PDFFormatter());
        generatePDF.generateReport();

        ReportGenerator generateHTML = new ReportGenerator("Title HTML", "Content HTML", new PDFFormatter());
        generateHTML.generateReport();

        ReportGenerator generatePlainText = new ReportGenerator("Title Plain Text", "Content Plain Text", new PDFFormatter());
        generatePlainText.generateReport();
    }
}
