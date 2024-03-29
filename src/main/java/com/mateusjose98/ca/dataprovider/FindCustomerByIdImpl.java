package com.mateusjose98.ca.dataprovider;

import com.mateusjose98.ca.core.dataprovider.FindCustomerById;
import com.mateusjose98.ca.core.domain.Customer;
import com.mateusjose98.ca.dataprovider.repository.CustomerRepository;
import com.mateusjose98.ca.dataprovider.repository.db.CustomerModel;
import com.mateusjose98.ca.dataprovider.repository.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindCustomerByIdImpl implements FindCustomerById {

    final CustomerRepository customerRepository;
    final CustomerMapper customerMapper;

    public Optional<Customer> find(String id) {
        CustomerModel model = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        Customer customerDomain = customerMapper.toCustomerDomain(model);
        return Optional.of(customerDomain);
    }

}
