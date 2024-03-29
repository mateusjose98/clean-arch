package com.mateusjose98.ca.dataprovider.repository.db;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
@Data
@Document(collection = "customers")
public class CustomerModel {
    @Id
    private String id;
    private String name;
    private String cpf;
    private AddressModel address;
    private boolean isValidCPF;


}
