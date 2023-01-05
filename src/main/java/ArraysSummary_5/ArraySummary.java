package ArraysSummary_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraySummary {
    public static void main(String[] args){
        // 배열 선언 1
        int[] arr = new int[]{1,2,3,4};
        // 배열 선언 2
        String[] arr2 = new String[]{"whoami", "lsb_release -a", "uname -a", "ls -l /etc/*-release"};

        // 배열 길이
        System.out.println(arr.length);
        System.out.println(arr2.length);

        // 향상된 for 문으로 출력
        for(String val : arr2)
            System.out.println(val);
        System.out.println();

        // Iterator 로 변환
        Iterator<String> iterator = Arrays.stream(arr2).iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();


        // Stream 으로 변환
        Stream<String> stream = Arrays.stream(arr2);
        // Stream 을 다시 Array 로 변환
        List<String> strings = Arrays.asList("whoami", "whoami2");
        List<String> lst = new ArrayList<>();


        IntStream stream2 = Arrays.stream(arr);
        stream2.filter(value -> value % 2 == 0).forEach(System.out::println);
        stream2 = Arrays.stream(arr);
        int res = Arrays.stream(arr).filter(value -> value % 2 == 0).sum();
        int res2 = Arrays.stream(arr).filter(value -> value % 2 == 0).min().orElse(0);
        int res3 = Arrays.stream(arr).filter(value -> value % 2 == 0).max().orElse(Integer.MAX_VALUE);
        Long res4 = Arrays.stream(arr).filter(value -> value % 2 == 0).count();
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);





    }
}
