package cardGameExer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CardInfo {
    String type() default "Enumeration";
    String category() default "";
    String description() default "";
}
