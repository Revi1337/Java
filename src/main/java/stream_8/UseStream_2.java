package stream_8;

import stream_8_1.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UseStream_2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Eric", "Elena", "Java");

        // TODO Filtering
        // 요소 하나씩 평가해서 걸러내는 작업. (인자로 받는 Predicate 는 boolean 을 리턴하는 함수형 인터페이스로 평가식이 들어가게 됨.)
//        Stream<String> stream = names.stream()
//                .filter(name -> name.contains("a"));    // [Elena, Java]


        // TODO Mapping
        // map 은 스트림 내 요소들을 하나씩 특정값으로 변환해줌. 이 때 값을 변환하기 위한 람다식을 인자로 받음
//        List<String> lst = List.of("whoami", "revi1337", "roorun1337");
//        Stream<String> stream = lst.stream()
//                .map(String::toUpperCase);


        // TODO forEach
        // forEach 는 스트림 뿐만아니라, 콜렉션, iterator 에 모두 사용 가능
        // 하지만, filter, map 과 다르게 최종 작업을 함. 그 뒤에 체이닝을 이어갈 수 없음.
//        List<String> lst = List.of("whoami", "revi1337", "roorun1337");
//        lst.forEach(System.out::println);           // List 도 가능
//        lst.stream().forEach(System.out::println);  // List 를 stream 으로 변환 후도 가능


        // TODO Filtering & Mapping & forEach
//        IntStream intStream = IntStream.builder()
//                .add(1).add(4).add(5).add(6)
//                .build();
//        intStream.filter(v -> v % 2 == 0)
//                .map(operand -> operand * 2)
//                .forEach(System.out::println);


        // TODO map 보다 조금더 복잡한 flatMap
        // flatMap 은 중첩 구조를 한단계 제거하고 단일 컬렉션으로 만들어주는 역할을 함. (중첩 리스트 -> 스트림)
        // 인자는 mapper 를 받고, 리턴타입이 Stream 임. 즉, 새로운 Stream 을 생성해서 리턴하는 람다식을 넘기는 것임.
//        List<List<String>> doubleList = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
//        List<String> flatList = doubleList.stream()
//                .flatMap(Collection::stream)    // 새로운 Stream 을 생성해서 리턴하는 람다식
//                .collect(Collectors.toList());  // 마지막으로 단일 컬렉션으로 만들어줌.


        // TODO 정렬 sorted()
        List<String> lang = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");
//        lang.stream()
//                .sorted()                       // 인자가 없으면 오름차순 정렬
//                .collect(Collectors.toList())   // List 로 변환
//                .forEach(System.out::println);  // List 는 Collection 이므로 forEach 가능
//        lang.stream()
//                .sorted(Comparator.reverseOrder())  // 내림차순 정렬
//                .collect(Collectors.toList())       // List 로 변환
//                .forEach(System.out::println);      // List 는 Collection 이므로 forEach 가능
        lang.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);

    }
}

