package com.mateusjose98.ca.config.beans;


import com.mateusjose98.ca.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.mateusjose98.ca.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(FindCustomerByIdImpl findCustomerById) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
