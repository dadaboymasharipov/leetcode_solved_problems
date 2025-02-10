package annotations;

import annotations.enums.Status;

import java.lang.annotation.Documented;

@Documented
public @interface Solved {
    Status value();
}
