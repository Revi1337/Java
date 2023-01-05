package stream_8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class GenerateStream_1 {
    public static void main(String[] args ){

        // TODO Primitive Type (기본형 타입) -> Stream (1)
        // IntStream, LongStream, DoubleStream 이 있음
        IntStream intStream = IntStream.of(1,2,3,4,5);

        // TODO Primitive Type (기본형 타입) -> Stream (2)
        // range() 와 rangeClosed() 메서드의 차이는 마지막 요소를 포함하느냐 안하느냐의 차이임.
        IntStream intStream2 = IntStream.range(1,5); // [1,2,3,4]
        LongStream longStream = LongStream.rangeClosed(1,5); // [1,2,3,4,5]

        // TODO Java 8 부터는 Random 클래스를 가지고 세가지타입의 스트림(IntStream, LongStream, DoubleStream)을 만들 수 있음.
        IntStream stream = new Random().ints(4); // 난수 4개 생성


        // TODO 배열 -> 스트림 생성
        // 배열은 Arrays.stream() 메서드로 스트림을 만들 수 있음.
        String[] arr = new String[]{"a", "ab", "c", "bcd", "abcd"};
        Stream<String> stream3 = Arrays.stream(arr);


        // TODO 컬렉션 -> 스트림 생성
        // 컬렉션타입 (Collection, List, Set) 의 경우, 인터페이스에 추가된 디폴트 메서드 stream 을 이용해서 스트림을 만들 수 있음
        List<String> list = Arrays.asList("a", "b", "c", "d");
        Stream<String> stream2 = list.stream();


        // TODO 문자열 -> 스트림
        IntStream charStream = "Stream".chars(); // [83, 116, 114, 101, 17, 109]


        // TODO empty 스트림 생성
        // Builder 를 사용하면 스트림에 직접적으로 원하는 값을 넣을 수 있음. 마지막에 build 메서드로 스트림을 리턴할 수 있음.
        Stream<String> builderStream = Stream.<String>builder()
                .add("Eric")
                .add("revi1337")
                .build();


        // TODO 무한대로 스트림 생성
        // 생성되는 스트림은 크기가 정해져있지 않고 무한하기 때문에 limit 메서드로 사이즈를 제한해야함
        Stream<String> stream4 = Stream.generate(() -> "revi1337").limit(10);


        // TODO Stream.iterate()
        // iterate() 메셔드를 사용해서 초기값과 해당 값을 다루는 람다식을 이용해서 스트림에 들어갈 요소를 만듬.
        Stream<Integer> iteratedStream = Stream.iterate(30, n -> n + 2).limit(5); // [30,32,34,36,38]


        // TODO 스트림 연결
        Stream<String> stream5 = Stream.of("Java", "Scala", "Groovy");
        Stream<String> stream6 = Stream.of("Python", "Go", "Swift");
        Stream<String> concat = Stream.concat(stream5, stream6);


    }
}
