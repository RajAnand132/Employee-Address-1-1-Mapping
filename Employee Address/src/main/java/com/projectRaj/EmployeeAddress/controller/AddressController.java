package com.projectRaj.EmployeeAddress.controller;

import com.projectRaj.EmployeeAddress.models.Address;
import com.projectRaj.EmployeeAddress.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("api/addresses")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @GetMapping("api/addresses/{addressId}")
    public Object getAddressById( @PathVariable Long addressId){
        return addressService.getAddressById(addressId);
    }

    @PostMapping("api/addresses")
    public String addAddresses(@RequestBody @Valid List<Address> addresses){
        return addressService.addAddresses(addresses);
    }

    @PutMapping("api/addresses/{addressId}")
    public String updateAddressById(@PathVariable Long addressId, @RequestBody @Valid Address newAddress){
        return addressService.updateAddressById(addressId,newAddress);
    }

    @DeleteMapping("api/addresses/{addressId}")
    public String deleteAddressById(@PathVariable Long addressId){
        return addressService.deleteAddressById(addressId);
    }

}
