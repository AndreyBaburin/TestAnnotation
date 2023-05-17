import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AgeLimit {
int minAge() default 18;
int maxAge() default 60;
}
