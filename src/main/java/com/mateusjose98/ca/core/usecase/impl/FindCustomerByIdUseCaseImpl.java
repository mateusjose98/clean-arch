package com.mateusjose98.ca.core.usecase.impl;

import com.mateusjose98.ca.core.dataprovider.FindCustomerById;
import com.mateusjose98.ca.core.domain.Customer;
import com.mateusjose98.ca.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {
    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
