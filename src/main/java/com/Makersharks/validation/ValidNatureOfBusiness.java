package com.Makersharks.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = NatureOfBusinessValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidNatureOfBusiness {
    String message() default "Invalid nature of business. Possible values: small_scale, medium_scale, large_scale.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}