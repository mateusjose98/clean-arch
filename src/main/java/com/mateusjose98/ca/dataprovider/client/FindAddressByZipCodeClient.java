package com.mateusjose98.ca.dataprovider.client;

import com.mateusjose98.ca.dataprovider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "findAddressByZipCode", url = "${address.client.url}")
public interface FindAddressByZipCodeClient {

    @GetMapping(value = "/{zipCode}/json")
    AddressResponse find(@PathVariable String zipCode);
}
