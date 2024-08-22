// SupplierRepository.java
package com.Makersharks.repository;

import com.Makersharks.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long>, CrudRepository<Supplier, Long> {
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses(
            String location, String natureOfBusiness, String manufacturingProcesses);
    boolean existsById(Long supplierId);
}
