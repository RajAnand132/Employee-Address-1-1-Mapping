package com.projectRaj.EmployeeAddress.repo;

import com.projectRaj.EmployeeAddress.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
