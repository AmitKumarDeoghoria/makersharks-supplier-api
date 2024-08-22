// SupplierController.java
package com.Makersharks.controller;

import com.Makersharks.model.Supplier;
import com.Makersharks.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<List<Supplier>> querySuppliers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam String manufacturingProcesses) {
        List<Supplier> suppliers = supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcesses);
        return ResponseEntity.ok().body(suppliers);
    }
}
