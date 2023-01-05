package annotation_20;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnnotation {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Cat cat = new Cat();
        cat.setName("Cute Cats!");

        // TODO 해당 객체에 class 에 VeryImportant 어노테이션이 붙어있는지를 확인
        if(cat.getClass().isAnnotationPresent(VeryImportantClass.class))
            System.out.println("This is Very Important");
        else
            System.out.println("This is not Very Important :(");
        System.out.println("=====================================");


        // TODO 해당 객체의 class(TYPE)에 붙어있는 Annotation 들을 출력
        for (Annotation annotation : cat.getClass().getDeclaredAnnotations())
            System.out.println(annotation);
        System.out.println("=====================================");


        // TODO 해당 객체의 class 에 선언되어있는 Method 들을 출력
        for (Method method : cat.getClass().getDeclaredMethods()) {
            System.out.print(method + " ");
            // TODO 만약 메서드들 중에 RunImmediately 어노테이션이 붙어있으면
            if (method.isAnnotationPresent(RunImmediatelyMethod.class)){
                System.out.println(true);
                // TODO RunImmediately 어노테이션이 붙어있으면, 해당 객체에서 RunImmediately 가 붙어있는 메셔드를 즉시 실행
                method.invoke(cat);
            }
            System.out.println();
        }
        System.out.println("=====================================");



        // TODO 해당 객체의 class 에 선언되어있는 Method 들을 출력
        for (Method method : cat.getClass().getDeclaredMethods()) {
            // TODO 만약 Method 들 중에서 RunImmediately 어노테이션이 붙어있으면
            if (method.isAnnotationPresent(RunImmediatelyMethod.class)) {
                // TODO Method 에서 RunImmediately 어노테이션을 받아오고
                RunImmediatelyMethod annotation = method.getAnnotation(RunImmediatelyMethod.class);
                // TODO RunImmediately 어노테이션의 파라미터인 times() 만큼 받아오고
                for (int i = 0; i < annotation.times(); i++) {
                    // TODO times() 값만큼 실행한다.
                    method.invoke(cat);
                }
            }
        }
        System.out.println("=====================================");



        // TODO 해당 객체의 class 에 선언되어있는 Field 들을 출력
        for (Field field : cat.getClass().getDeclaredFields()) {
            // TODO 만약 Field 들 중에서 ImportantString 어노테이션이 붙어있으면
            if (field.isAnnotationPresent(ImportantString.class)) {
                System.out.println("Full Field Name -> " + field);      // field 의  Full 이름 (접근제어 리턴타입 다나옴)
                System.out.println("Simple Field Name -> " + field.getName());  // field 의 이름만 출력
                // TODO cat 객체에서 ImportantString 어노테이션이 붙은 Field(여기서는 name) 의 value 를 가져오고
                Object obj = field.get(cat);
                System.out.println(obj);
                // TODO Field 의 value 가 String 의 객체이면 형변환하고 대문자로 출력
                if (obj instanceof String) {
                    System.out.println(((String) obj).toUpperCase());
                }
            }
        }
        System.out.println("=====================================");

    }

}
