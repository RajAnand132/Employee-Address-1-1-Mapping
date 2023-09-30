package com.projectRaj.EmployeeAddress.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long empId;
    @NotBlank
    String firstName;
    @NotBlank
    String lastName;
    @OneToOne
    @JoinColumn(name = "fk_addressId")
    Address address;
}
