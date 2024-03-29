package com.mateusjose98.ca.dataprovider.repository.db;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class AddressModel {
    private String street;
    private String city;
    private String state;

}
