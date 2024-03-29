package com.mateusjose98.ca.core.usecase.impl;

import com.mateusjose98.ca.core.dataprovider.DeleteCustomerById;
import com.mateusjose98.ca.core.usecase.DeleteCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(DeleteCustomerById deleteCustomerById) {
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(String id) {
        deleteCustomerById.delete(id);
    }
}
