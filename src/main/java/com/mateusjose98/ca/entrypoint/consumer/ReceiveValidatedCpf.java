package com.mateusjose98.ca.entrypoint.consumer;

import com.mateusjose98.ca.core.usecase.UpdateCustomerUseCase;
import com.mateusjose98.ca.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.mateusjose98.ca.entrypoint.consumer.messages.CustomerMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ReceiveValidatedCpf {

    final UpdateCustomerUseCase updateCustomerUseCase;
    final CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "eu")
    public void receive(CustomerMessage customerMessage) {
       log.info("CPF {} was validated", customerMessage.getCpf());
       var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());

    }

}
