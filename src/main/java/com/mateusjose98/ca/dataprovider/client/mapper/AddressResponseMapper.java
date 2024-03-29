package com.mateusjose98.ca.dataprovider.client.mapper;

import com.mateusjose98.ca.core.domain.Address;
import com.mateusjose98.ca.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
