package com.mateusjose98.ca.core.usecase;

import com.mateusjose98.ca.core.domain.Customer;

public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipCode);
}
