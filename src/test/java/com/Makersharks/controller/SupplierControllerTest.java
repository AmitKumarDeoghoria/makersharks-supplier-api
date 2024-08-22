// SupplierControllerTest.java
package com.Makersharks.controller;

import com.Makersharks.model.Supplier;
import com.Makersharks.service.SupplierService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class SupplierControllerTest {

    @InjectMocks
    private SupplierController supplierController;

    @Mock
    private SupplierService supplierService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testQuerySuppliers_ReturnsSuppliers() {
        // Arrange
        String location = "India";
        String natureOfBusiness = "small_scale";
        String manufacturingProcesses = "3d_printing";

        Supplier supplier = new Supplier();
        supplier.setSupplierId(1L);
        supplier.setCompanyName("ABC Moulding");
        supplier.setWebsite("http://abc-moulding.com");
        supplier.setLocation("India");
        supplier.setNatureOfBusiness("small_scale");
        supplier.setManufacturingProcesses("3d_printing");

        when(supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcesses))
                .thenReturn(Arrays.asList(supplier));

        // Act
        ResponseEntity<List<Supplier>> response = supplierController.querySuppliers(location, natureOfBusiness, manufacturingProcesses);

        // Assert
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(1, response.getBody().size());
        assertEquals("ABC Moulding", response.getBody().get(0).getCompanyName());
    }

    @Test
    public void testQuerySuppliers_ReturnsEmptyList() {
        // Arrange
        String location = "India";
        String natureOfBusiness = "large_scale";
        String manufacturingProcesses = "casting";

        when(supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcesses))
                .thenReturn(Arrays.asList());

        // Act
        ResponseEntity<List<Supplier>> response = supplierController.querySuppliers(location, natureOfBusiness, manufacturingProcesses);

        // Assert
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(0, response.getBody().size());
    }
}
