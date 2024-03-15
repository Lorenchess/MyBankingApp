package com.chess4math.MyBankingApp.services;

import com.chess4math.MyBankingApp.dto.CustomerDTO;
import com.chess4math.MyBankingApp.dto.TransactionDTO;

import java.awt.print.Pageable;
import java.util.List;

public interface CustomerManagementService {
    CustomerDTO addCustomerToSystem(CustomerDTO customerDTO);

    void removeCustomer(Long customerId);

    CustomerDTO getCustomerById(Long customerId);

    List<CustomerDTO> getAllCustomers(Pageable pageable);


}
