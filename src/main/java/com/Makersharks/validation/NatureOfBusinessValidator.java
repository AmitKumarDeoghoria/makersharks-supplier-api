package com.Makersharks.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NatureOfBusinessValidator implements ConstraintValidator<ValidNatureOfBusiness, String> {

    private static final Set<String> VALID_VALUES = new HashSet<>(Arrays.asList("small_scale", "medium_scale", "large_scale"));

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value == null || VALID_VALUES.contains(value);
    }
}