package com.mateusjose98.ca.config.beans;

import com.mateusjose98.ca.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.mateusjose98.ca.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdConfig(DeleteCustomerByIdImpl deleteCustomerByIdImpl) {
        return new DeleteCustomerByIdUseCaseImpl(deleteCustomerByIdImpl);
    }
}
