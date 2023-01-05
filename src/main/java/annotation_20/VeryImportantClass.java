package annotation_20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Target 은 Annotation 을 걸 위치를 명시. FIELD(필드), METHOD(메서드), TYPE(클래스), 등등 여러가지가 많음
// @Retention C RUNTIME (프로그램이 실행할때동안에도 실행), SOURCE(컴파일 시점에 떼짐)
@Target(value = {ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface VeryImportantClass {

}
