package com.projectRaj.EmployeeAddress.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long addressId;
    @NotEmpty
    String street;
    @NotBlank
    String city;
    @NotBlank
    String state;
    @Pattern(regexp ="^\\d{6}$", message = "Not a valid Indian PIN code. Length must be 6 digits.")
    String zipCode;
}
