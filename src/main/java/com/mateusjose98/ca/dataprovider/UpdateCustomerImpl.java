package com.mateusjose98.ca.dataprovider;

import com.mateusjose98.ca.core.dataprovider.UpdateCustomer;
import com.mateusjose98.ca.core.domain.Customer;
import com.mateusjose98.ca.dataprovider.repository.CustomerRepository;
import com.mateusjose98.ca.dataprovider.repository.db.CustomerModel;
import com.mateusjose98.ca.dataprovider.repository.mapper.CustomerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UpdateCustomerImpl implements UpdateCustomer {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    @Override
    public void update(Customer customer) {
        CustomerModel model = customerMapper.toCustomer(customer);
        customerRepository.save(model);
    }
}
