package optional_9;

import java.util.Optional;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // Optional 의 팩토리메서드인 of 는 null 을 허용하지 않음.
        // Optional<String> hello2 = Optional.of(null);

        // Optional 의 ofNullable 메서드는 null 을 허용함. (NullPointException 이 발생하지 않음)
        Optional<String> hello = Optional.ofNullable(null);


        // 값이 존재하는지, 비어있는지 확인
        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        // Optional 의 map 과 orElse 활용 (단순 문자열 반환) (Optional 에도 map 이 있다.)
        String orElse = hello.map(String::toUpperCase)
                .orElse("is it null?");
        System.out.println(orElse);

        // Optional 의 map 과 orElseGet 활용 (특정 행동들을 수행하고 그 결과를 반환할 수 있음.)
        String orElseGet = hello.map(String::toUpperCase)
                .orElseGet(() -> "world");
        System.out.println(orElseGet);

        // Optional 의 map 과 orElseThrow 활용
//        String orElseThrow = hello.map(String::toUpperCase)
//                .orElseThrow(IllegalArgumentException::new);


        // Optional 의 ifPresent 활용
        hello.ifPresent(word -> {
            System.out.println(word.toUpperCase());
        });

        // Optional 의 ifPresentOrElse 활용
        hello.ifPresentOrElse(System.out::println, () -> {
            System.out.println("12312");
        });

        // Function 인터페이스 연습
        String result = oneLineFunction.apply("revi1337");
        System.out.println(result);
    }

    private static Function<String, String> oneLineFunction = String::toUpperCase;


}
