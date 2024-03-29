package com.mateusjose98.ca.dataprovider.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponse {
    @JsonProperty("logradouro")
    private String street;
    @JsonProperty("localidade")
    private String city;
    @JsonProperty("uf")
    private String state;
}
