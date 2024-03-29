package com.mateusjose98.ca.config.beans;

import com.mateusjose98.ca.core.usecase.InsertCustomerUseCase;
import com.mateusjose98.ca.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.mateusjose98.ca.dataprovider.FindAddressByZipCodeImpl;
import com.mateusjose98.ca.dataprovider.InsertCustomerImpl;
import com.mateusjose98.ca.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCodeImpl,
            InsertCustomerImpl insertCustomerImpl, SendCpfForValidationImpl sendCpfForValidationImpl) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCodeImpl, insertCustomerImpl, sendCpfForValidationImpl);
    }

}
