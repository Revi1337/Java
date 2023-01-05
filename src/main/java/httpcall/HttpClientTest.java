package httpcall;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class HttpClientTest {

    public static void main(String[] args) throws IOException, InterruptedException {

        // TODO HttpClient 를 만드는 방법 두가지. (같은 것임.)
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpClient httpClient1 = HttpClient.newHttpClient();


        // TODO HttpClient 로 요청을 보내고 HttpResponse 를 받자
        HttpResponse<String> response = httpClient.send(
                HttpRequest.newBuilder().uri(URI.create("https://www.naver.com")).GET().build(),
                HttpResponse.BodyHandlers.ofString()
        );

        // TODO HttpResponse 값을 추출하여 정보를 얻자.
        System.out.println(response.request());
        System.out.println(response.uri());
        System.out.println(response.version());
        System.out.println(response.statusCode());
        System.out.println(response.headers());

        HttpHeaders headers = response.headers();
        Optional<String> firstValue = headers.firstValue("content-type");
        System.out.println(firstValue.get());
//        System.out.println(response.body());
    }

}
