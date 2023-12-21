package refractor.reportgenerator;

public class PDFFormatter implements ReportFormatter {
    @Override
    public void formatAndPrint(String title, String content) {
        System.out.println("Printing PDF report:");
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }
}
