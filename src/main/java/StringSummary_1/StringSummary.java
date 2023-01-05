package StringSummary_1;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class StringSummary {
    public static void main(String[] args) {
        String filename = "D:\\fast_java1\\fast_java_prac";

        // 문자열의 길이 확인
        System.out.println(filename.length());

        // 문자열 합치기
        System.out.println(filename.concat("whoami"));

        // slicing idx 1 부터 끝까지
        // slicing idx 1 부터 idx 8 까지
        System.out.println(filename.substring(1));
        System.out.println(filename.substring(1, 8));

        // 대문자로
        // 소문자로
        System.out.println(filename.toUpperCase());
        System.out.println(filename.toLowerCase());

        // filename 이 특정 문자 혹은 문자와 동일한지 확인.
        // 정규식으로 일치하는지 확인 가능
        // 특정 문자열이 filename 에 포함되는지 확인.
        System.out.println(filename.equals("D:\\fast_java1\\fast_java_prac"));
        System.out.println(filename.matches(".^"));
        System.out.println(filename.contains("\\"));

        // 공백 문자 제거. (유감스럽게도 오른쪽 왼쪽 공백만 지워줄 뿐 가운데 공백문자는 지워주지 않음 )
        // 따라서 replace 로 지워줘야 함
        String containEmptyString = "   who am i   ";
        System.out.println(containEmptyString.trim());
        System.out.println(containEmptyString.replace(" ", ""));

        // 문자 혹은 문자열 모두 치환
        // 문자 혹은 문자열 모두 치환 (정규식)
        // 첫번째로 해당하는 문자 혹은 문자열 치환
        System.out.println(filename.replace("\\", "/"));
        System.out.println(filename.replaceAll(".^", "/"));
        System.out.println(filename.replaceFirst("\\\\", "/"));

        // 특정 문자열을 기준으로 split (정규식이 들어감)
        String[] splits = filename.split("\\\\", filename.length());
        for(String split : splits)
            System.out.println(split);

        // 특정 값의 index 반환
        // 특정 값의 index 반환 (범위 지정 가능)
        // 특정 값의 마지막 index 반환
        // 특정 값의 마지막 index 반환 (범위 지정 가능)
        System.out.println(filename.indexOf('D'));
        System.out.println(filename.indexOf('D', 5));
        System.out.println(filename.lastIndexOf("\\"));
        System.out.println(filename.lastIndexOf("\\", 8));

        // 특정 index 에 위치하는 요소 반환.
        System.out.println(filename.charAt(1));
        System.out.println(filename.codePointAt(1));

        // 문자열이 속한 클래스의 fullName 출력
        // 문자열이 속한 클래스의 simpleName 출력
        System.out.println(filename.getClass());
        System.out.println(filename.getClass().getSimpleName());

        // 문자열이 비어있는지 확인
        String emptyTest = "a ";
        System.out.println(emptyTest.isBlank());
        System.out.println(emptyTest.isEmpty());

        // 문자열이 특정 문자 혹은 문자로 끝나는지 확인
        // 문자열이 특정 문자 혹은 문자열로 시작하는지 확인
        System.out.println(filename.endsWith("prac"));
        System.out.println(filename.startsWith("D:\\"));

        // Bytes 로 인코딩
        System.out.println(filename.getBytes());

        // Base64 로 인코딩
        System.out.println(Base64.getEncoder().encodeToString(filename.getBytes()));

        System.out.println(Arrays.toString(Base64.getDecoder().decode("RDpcZmFzdF9qYXZhMVxmYXN0X2phdmFfcHJhYw==")));

        // URL 인코딩
        System.out.println(URLEncoder.encode(filename, StandardCharsets.UTF_8));

        String test = "D:/fast_java1/fast_java_prac";

        System.out.println(test.substring(test.lastIndexOf("/")));

    }

}
