package com.chess4math.MyBankingApp.services;

import com.chess4math.MyBankingApp.dto.AccountDTO;
import com.chess4math.MyBankingApp.dto.CustomerDTO;

public interface CustomerSelfService {
   CustomerDTO registerCustomer(CustomerDTO customerDTO);

   CustomerDTO updateCustomerProfile(Long customerId, CustomerDTO customerDTO);

   CustomerDTO getCustomerProfile(Long customerId);

   void deactivateCustomerAccount(Long customerId);

   AccountDTO createCustomerAccount(AccountDTO accountDTO);


}
