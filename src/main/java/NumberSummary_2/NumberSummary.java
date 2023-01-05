package NumberSummary_2;

import java.time.LocalDateTime;

public class NumberSummary {
    public static void main(String[] args){

        double db = 1;

        Integer val = 234567;

        System.out.println(val.doubleValue());
        System.out.println(val.intValue());
        System.out.println(val.byteValue());
        System.out.println(val.floatValue());
        System.out.println(val.shortValue());
        System.out.println(val.longValue());

        // val 이 더 작으면 (-1) 반환
        // val 이 더 크면 (1) 반환
        // val 과 값이 같으면 (0) 반환
        System.out.println(val.compareTo(1));

        System.out.println(val.getClass().getSimpleName());
        System.out.println(val.toString().getClass().getSimpleName());

    }
}
