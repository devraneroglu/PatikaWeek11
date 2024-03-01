package dev.patika.ecommerce.dto.request.supplier;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class SupplierUpdateRequest {
    @Positive
    private int id;
    @NotNull
    private String companyName;
    private String contactName;
    private String address;
    @Email
    private String contactMail;

}
