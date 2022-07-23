package hello.core.annotion;


import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

// 직접 annotation 만들어서 쓰기
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER,
        ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Qualifier("mainDiscountPolicy")
public @interface MainDiscountPolicy {
}
