package crawling;

import org.jsoup.Jsoup;

import javax.swing.text.Document;
import java.io.IOException;

public class Jsoupstock {
    public static void main(String[] args) throws IOException {
        String URL = "https://finance.daum.net/domestic/all_stocks?market=KOSPI";
        Document doc = (Document) Jsoup.connect(URL).get();
        System.out.println(doc);
    }
}
