// SupplierController.java
package com.Makersharks.controller;

import com.Makersharks.model.Supplier;
import com.Makersharks.service.SupplierService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/add")
    public ResponseEntity<Supplier> addSupplier(@Valid @RequestBody Supplier supplier) {
        try {
            Supplier savedSupplier = supplierService.addSupplier(supplier);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedSupplier);
        } catch (Exception e) {
            // Handle the exception, e.g., log it and return an appropriate HTTP status
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    @PostMapping("/query")
    public ResponseEntity<List<Supplier>> querySuppliers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam String manufacturingProcesses) {
        List<Supplier> suppliers = supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcesses);
        return ResponseEntity.ok().body(suppliers);
    }
}
