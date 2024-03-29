package com.mateusjose98.ca.dataprovider.repository.mapper;

import com.mateusjose98.ca.core.domain.Customer;
import com.mateusjose98.ca.dataprovider.repository.db.CustomerModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerModel toCustomer(Customer cutomer);
    Customer toCustomerDomain(CustomerModel model);
}
