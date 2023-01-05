package multithread_16;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("==============================================================");

        // TODO Thread 클래스에서 원하는 method 가 있나 검색
        Thread thread = new Thread();
        Method[] methods =  thread.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().toLowerCase().contains("lock")) {
                System.out.println(method.getName());
            }
        }
        System.out.println();

        System.out.println("==============================================================");

        // TODO Thread 리스트들 생성
        List<MultiThreadExtends> multiThreadExtendsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            multiThreadExtendsList.add(new MultiThreadExtends(i));
        }


//        // TODO 일반스레드
//        // TODO 서브스레드들을 시작해놓고 메인스레드(JVM)의 할일을 함.
//        // TODO 즉, 메인스레드(JVM) 이 종료되어도 서브스레드들은 계속 할 일 함.
//        // TODO 하지만, join 을 걸면 메인스레드(JVM) 는 서브스레드들이 끝날때까지 기다림)
//        for (MultiThreadThing multiThreadThing : multiThreadThingList) {
//            multiThreadThing.setDaemon(false);
//            multiThreadThing.start();
//        }
//        for (MultiThreadThing multiThreadThing : multiThreadThingList) {    // 이부분 주석, 해제 해보면서 확인해 볼 것.
//            multiThreadThing.join();
//        }                                                                   // 여기까지 주석, 해제
//        System.out.println("[+] Main Thread (DIE)");



        // TODO 데몬스레드
        // TODO 서브스레드들을 시작해놓고 메인스레드(JVM)의 할일을 함.
        // TODO 하지만, 메인스레드(JVM) 가 종료되면 서브스레드들도 모두 종료됨 (일반스레드 + join 과 같은 효과)
        // TODO 한마디로 메인스레드가 살아있는 동안에만 서브스레드들이 동작하는 것임.
        // TODO 데몬스레드를 걸어두고 join 을 거는것은 굉장히 좋지 못한 코딩이라는것을 명심해야 함.
        for (MultiThreadExtends multiThreadExtends : multiThreadExtendsList) {
            multiThreadExtends.setDaemon(true);
            multiThreadExtends.start();
        }
        Thread.sleep(10000); // 메인스레드 10 초동안 수행
        for (MultiThreadExtends multiThreadExtends : multiThreadExtendsList) {
            System.out.println(multiThreadExtends.isAlive()); // 서브스레드들은 메인스레드 라이프사이플 안에 종료되기 때문에 false 로 뜸
        }
        System.out.println("[+] Daemon Thread Complete~!");
    }



    private static final Function<String, String> oneLineFunction = String::toUpperCase;

    private static final Predicate<String> oneLinePredicate = string -> string.toLowerCase().contains("hello");

}
