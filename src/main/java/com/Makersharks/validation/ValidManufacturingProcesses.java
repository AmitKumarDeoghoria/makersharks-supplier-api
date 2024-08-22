package com.Makersharks.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ManufacturingProcessesValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidManufacturingProcesses {
    String message() default "Invalid manufacturing process. Possible values: moulding, 3d_printing, casting, coating.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}