package com.mateusjose98.ca.config.beans;

import com.mateusjose98.ca.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.mateusjose98.ca.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.mateusjose98.ca.dataprovider.FindAddressByZipCodeImpl;
import com.mateusjose98.ca.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateConfig(FindCustomerByIdUseCaseImpl findCustomerByIdUseCaseImpl,
                                                      FindAddressByZipCodeImpl findAddressByZipCodeImpl,
                                                      UpdateCustomerImpl updateCustomerImpl) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCaseImpl,
                                             findAddressByZipCodeImpl,
                                             updateCustomerImpl);
    }

}
