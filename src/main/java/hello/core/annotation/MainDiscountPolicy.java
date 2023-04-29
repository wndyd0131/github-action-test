package hello.core.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Qualifier("mainDiscountPolicy") // Qualifier 쓸 때 문자열이 아닌 어노테이션으로 사용하도록 해줌 (컴파일 에러 유도를 위함)
public @interface MainDiscountPolicy {
}

//c