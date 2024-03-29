package com.mateusjose98.ca.dataprovider;

import com.mateusjose98.ca.core.dataprovider.FindAddressByZipCode;
import com.mateusjose98.ca.core.domain.Address;
import com.mateusjose98.ca.dataprovider.client.FindAddressByZipCodeClient;
import com.mateusjose98.ca.dataprovider.client.mapper.AddressResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {
    private final FindAddressByZipCodeClient findAddressByZipCodeClient;
    private final AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        return addressResponseMapper.toAddress(findAddressByZipCodeClient.find(zipCode));
    }
}
