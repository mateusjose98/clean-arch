package com.mateusjose98.ca.core.usecase;

import com.mateusjose98.ca.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String zipCode);
}
