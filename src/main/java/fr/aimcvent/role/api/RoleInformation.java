package fr.aimcvent.role.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RoleInformation {

    String name();

    String description();

    int count() default 1;

    int minimumCount() default 0;

}
