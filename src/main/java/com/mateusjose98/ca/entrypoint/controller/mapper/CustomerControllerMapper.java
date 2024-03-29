package com.mateusjose98.ca.entrypoint.controller.mapper;

import com.mateusjose98.ca.core.domain.Customer;
import com.mateusjose98.ca.entrypoint.controller.request.CustomerRequest;
import com.mateusjose98.ca.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerControllerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "validCPF", ignore = true)
    Customer toDomain(CustomerRequest customerRequest);


    CustomerResponse toResponse(Customer customer);
}
