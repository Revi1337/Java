package stream_8_2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Alex", "revi1337", "Amigoscode", "root");
        Stream<String> stream = names.stream();
        Stream<String> namesStream = Stream.of("Amigoscode", "Alex", "Zara");

        // limit && count
        long cnt = stream.limit(2)
                        .count();

        // Array to Stream
        String[] namesArray = {"revi1337", "rookan1337", "roorun1337"};
        Stream<String> stream1 = Arrays.stream(namesArray);

    }
}
