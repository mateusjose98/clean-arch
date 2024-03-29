package com.mateusjose98.ca.entrypoint.controller;

import com.mateusjose98.ca.core.domain.Customer;
import com.mateusjose98.ca.core.usecase.DeleteCustomerByIdUseCase;
import com.mateusjose98.ca.core.usecase.FindCustomerByIdUseCase;
import com.mateusjose98.ca.core.usecase.InsertCustomerUseCase;
import com.mateusjose98.ca.core.usecase.UpdateCustomerUseCase;
import com.mateusjose98.ca.entrypoint.controller.mapper.CustomerMapper;
import com.mateusjose98.ca.entrypoint.controller.request.CustomerRequest;
import com.mateusjose98.ca.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@Slf4j
@AllArgsConstructor
public class CustomerController {


    private final InsertCustomerUseCase insertCustomerUseCase;
    private final FindCustomerByIdUseCase findCustomerUseCase;
    private final UpdateCustomerUseCase updateCustomerUseCase;
    private final DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;
    private final CustomerMapper customerMapper;

    @PostMapping
    ResponseEntity<Void> create(@RequestBody @Valid CustomerRequest customerRequest) {
        log.info("Creating a customer " + customerRequest);
        Customer domain = customerMapper.toDomain(customerRequest);
        insertCustomerUseCase.insert(domain, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    ResponseEntity<CustomerResponse> findById(@PathVariable String id) {
        log.info("Finding a customer by id {} ", id);
        Customer customer = findCustomerUseCase.find(id);
        CustomerResponse response = customerMapper.toResponse(customer);
        return ResponseEntity.ok(response);
    }


    @PutMapping("/{id}")
    ResponseEntity<Void> update(@PathVariable String id, @RequestBody @Valid CustomerRequest customerRequest) {
        log.info("Updating a customer by id {} ", id);
        Customer domain = customerMapper.toDomain(customerRequest);
        domain.setId(id);
        updateCustomerUseCase.update(domain, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable String id) {
        log.info("Deleting a customer by id {} ", id);
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}
