package com.mateusjose98.ca.core.usecase.impl;

import com.mateusjose98.ca.core.dataprovider.FindAddressByZipCode;
import com.mateusjose98.ca.core.dataprovider.UpdateCustomer;
import com.mateusjose98.ca.core.domain.Address;
import com.mateusjose98.ca.core.domain.Customer;
import com.mateusjose98.ca.core.usecase.FindCustomerByIdUseCase;
import com.mateusjose98.ca.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAddressByZipCode findAddressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressByZipCode findAddressByZipCode, UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        Customer existingCustomer = findCustomerByIdUseCase.find(customer.getId());
        Address address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
