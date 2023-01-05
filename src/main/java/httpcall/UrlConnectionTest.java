package httpcall;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class UrlConnectionTest {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.naver.com");
        URLConnection urlConnection = url.openConnection();
        try (Scanner scanner = new Scanner(urlConnection.getInputStream())) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }

        System.out.println(urlConnection.getURL());
        System.out.println(urlConnection.getContentLength());
        System.out.println(urlConnection.getContentEncoding());
        System.out.println(urlConnection.getContentType());
    }
}
