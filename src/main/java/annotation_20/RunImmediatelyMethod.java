package annotation_20;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface RunImmediatelyMethod {

    // TODO 1. 어노테이션의 파라미터를 정의할때는 Primitive, Class, String, Array 타입만 가능하다.
    // TODO 2. default 값을 정의하지 않으면, 어노테이션을 사용할 때 꼭 인자를 주어야한다.

    int times() default 10;

    int seconds() default 3;




}
