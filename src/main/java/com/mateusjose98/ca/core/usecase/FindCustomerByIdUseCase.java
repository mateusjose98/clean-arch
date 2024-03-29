package com.mateusjose98.ca.core.usecase;

import com.mateusjose98.ca.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(String id);
}
