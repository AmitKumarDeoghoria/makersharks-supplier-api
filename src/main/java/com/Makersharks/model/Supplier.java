// Supplier.java
package com.Makersharks.model;
import com.Makersharks.validation.ValidManufacturingProcesses;
import com.Makersharks.validation.ValidNatureOfBusiness;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Long supplierId;
    @NotBlank(message = "Company name cannot be empty")
    private String companyName;
    @Size(max = 255, message = "Website URL can't be longer than 255 characters")
    private String website;
    @NotBlank(message = "location name cannot be empty")
    private String location;
    @ValidNatureOfBusiness
    private String natureOfBusiness; // small_scale, medium_scale, large_scale
    @ValidManufacturingProcesses
    private String manufacturingProcesses; // moulding, 3d_printing, casting, coating

    // Getters and Setters

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getManufacturingProcesses() {
        return manufacturingProcesses;
    }

    public void setManufacturingProcesses(String manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }


}
