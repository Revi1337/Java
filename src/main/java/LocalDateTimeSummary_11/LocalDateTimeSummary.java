package LocalDateTimeSummary_11;

import java.time.LocalDateTime;

public class LocalDateTimeSummary {
    public static void main(String[] args){
        System.out.println();
        LocalDateTime dt = LocalDateTime.now().minusDays(1L);
        // 전체 날짜 정보
        System.out.println(dt);

        // Date 만 갖고오기
        System.out.println(dt.toLocalDate());

        // Date 에서 Year 갖고오기
        System.out.println(dt.toLocalDate().getYear());

        // Date 에서 Month 갖고오기. (Month 의 이름이 나옴)
        // Date 에서 Month 갖고오기. (int 가 출력됨)
        System.out.println(dt.toLocalDate().getMonth());
        System.out.println(dt.toLocalDate().getMonth().getValue());

        // Date 에서 오늘이 몇일 인지 출력
        System.out.println(dt.toLocalDate().getDayOfMonth());

        // Date 에서 오늘이 무슨 요일인지 출력
        // Date 에서 오늘이 무슨 요일인지 출력  (int 로 출력 0~6)
        System.out.println(dt.toLocalDate().getDayOfWeek());
        System.out.println(dt.toLocalDate().getDayOfWeek().getValue());

        // ---------------------------------------------------------------------------
        // Time 정보들만 갖고 오기
        System.out.println(dt.toLocalTime());

        // Time 에서 Hour 만 출력
        System.out.println(dt.toLocalTime().getHour());

        // Time 에서 Minute 출력
        System.out.println(dt.toLocalTime().getMinute());

        // Time 에서 Seconds 출력
        // Time 에서 Seconds 뒤에 ms 출력
        System.out.println(dt.toLocalTime().getSecond());
        System.out.println(dt.toLocalTime().getNano());
        System.out.println(LocalDateTime.class);



    }
}
