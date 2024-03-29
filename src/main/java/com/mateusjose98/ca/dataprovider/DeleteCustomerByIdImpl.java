package com.mateusjose98.ca.dataprovider;

import com.mateusjose98.ca.dataprovider.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements com.mateusjose98.ca.core.dataprovider.DeleteCustomerById {

    final CustomerRepository customerRepository;

    public DeleteCustomerByIdImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void delete(String id) {
        customerRepository.deleteById(id);
    }

}
