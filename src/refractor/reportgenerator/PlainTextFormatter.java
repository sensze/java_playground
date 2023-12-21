package refractor.reportgenerator;

public class PlainTextFormatter implements ReportFormatter{
    @Override
    public void formatAndPrint(String title, String content) {
        System.out.println("Printing plain text report:");
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }
}
