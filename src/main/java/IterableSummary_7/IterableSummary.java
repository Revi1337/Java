package IterableSummary_7;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Iterator;

public class IterableSummary {
    public static void main(String[] args){
        String[] arr = new String[]{"whoami", "lsb_release -a", "uname -a", "ls -l /etc/*-release"};

        // 배열을 Iterator 로 변환
        Iterator<String> iterator = Arrays.stream(arr).iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();

        Iterator<String> iter = Arrays.stream(arr).iterator();
        System.out.println(iter.getClass().getSimpleName());

    }
}
