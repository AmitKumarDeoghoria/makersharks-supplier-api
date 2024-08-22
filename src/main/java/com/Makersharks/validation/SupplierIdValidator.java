package com.Makersharks.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.Makersharks.service.SupplierService;

public class SupplierIdValidator implements ConstraintValidator<UniqueSupplierId, Long> {

    @Autowired
    private SupplierService supplierService;

    @Override
    public boolean isValid(Long supplierId, ConstraintValidatorContext context) {
        if (supplierId == null) {
            return false; // Consider null valid unless you want to enforce a non-null constraint
        }
        // Check if the supplier ID already exists
        return !supplierService.existsById(supplierId);
    }
}