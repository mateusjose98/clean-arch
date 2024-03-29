package com.mateusjose98.ca.entrypoint.controller.response;


import com.mateusjose98.ca.dataprovider.client.response.AddressResponse;
import lombok.Data;

@Data
public class CustomerResponse {
    private String name;
    private String cpf;
    private String isValidCPF;
    private AddressResponse address;
}
