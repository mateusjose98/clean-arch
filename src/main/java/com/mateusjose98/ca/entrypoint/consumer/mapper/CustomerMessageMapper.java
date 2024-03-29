package com.mateusjose98.ca.entrypoint.consumer.mapper;

import com.mateusjose98.ca.core.domain.Customer;
import com.mateusjose98.ca.entrypoint.consumer.messages.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {
    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
