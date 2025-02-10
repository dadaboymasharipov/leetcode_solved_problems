package annotations;

import annotations.enums.Status;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Unsolved {
    Status value();
}
