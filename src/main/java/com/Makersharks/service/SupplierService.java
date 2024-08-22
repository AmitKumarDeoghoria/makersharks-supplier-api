// SupplierService.java
package com.Makersharks.service;
import com.Makersharks.model.Supplier;
import com.Makersharks.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcesses) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(location, natureOfBusiness, manufacturingProcesses);
    }
}
