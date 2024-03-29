package com.mateusjose98.ca.dataprovider.repository;

import com.mateusjose98.ca.core.domain.Customer;
import com.mateusjose98.ca.dataprovider.repository.db.CustomerModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerModel, String>{
}
