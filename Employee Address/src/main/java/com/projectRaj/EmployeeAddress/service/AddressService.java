package com.projectRaj.EmployeeAddress.service;

import com.projectRaj.EmployeeAddress.models.Address;
import com.projectRaj.EmployeeAddress.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Object getAddressById(Long addressId) {
        Optional<Address> optionalAddress = addressRepo.findById(addressId);
        if(optionalAddress.isPresent()){
            return optionalAddress;
        }
        return "Address with id : "+addressId + " not available";
    }

    public String addAddresses(List<Address> addresses) {
        addressRepo.saveAll(addresses);
        return addresses.size()+" addresses has been added";
    }

    public String updateAddressById(Long addressId, Address newAddress) {
        Optional<Address> optionalAddress = addressRepo.findById(addressId);
        if(optionalAddress.isPresent()){
            addressRepo.save(newAddress);
            return "Address with id : "+addressId + " is updated";
        }
        return "Address with id : "+addressId + " not available";
    }


    public String deleteAddressById(Long addressId) {
        Optional<Address> optionalAddress = addressRepo.findById(addressId);
        if(optionalAddress.isPresent()){
            addressRepo.deleteById(addressId);
            return "Address with id : "+addressId + " has been deleted";
        }
        return "Address with id : "+addressId + " not available";
    }
}
