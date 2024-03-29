package com.mateusjose98.ca.dataprovider.client.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponse {
    private String street;
    private String city;
    private String state;
}
