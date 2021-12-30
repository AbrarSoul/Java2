package Loop_and_String;

public class Task_5 {
    public static void main(String[] args) {
        String html = "<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";

        int position = html.indexOf("TXN");
        System.out.println(html.substring(position,72));
    }
}
