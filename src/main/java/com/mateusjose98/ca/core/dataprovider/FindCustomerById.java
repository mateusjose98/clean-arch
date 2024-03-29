package com.mateusjose98.ca.core.dataprovider;

import com.mateusjose98.ca.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(String id);
}
