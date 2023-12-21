package refractor.reportgenerator;

public class HTMLFormatter implements ReportFormatter{
    @Override
    public void formatAndPrint(String title, String content) {
        System.out.println("Printing HTML Report: ");
        System.out.println("<h1>" + title + "</h1>");
        System.out.println("<p>" + content + "</p>");
    }
}
