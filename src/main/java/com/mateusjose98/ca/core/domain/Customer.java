package com.mateusjose98.ca.core.domain;

import java.util.Objects;

public class Customer {
    private String id;
    private String name;
    private String cpf;
    private Address address;
    private Boolean isValidCPF;

    public Customer(String id, String name, String cpf, Address address, Boolean isValidCPF) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.isValidCPF = isValidCPF;
    }

    public Customer() {
        this.isValidCPF = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean isValidCPF() {
        return isValidCPF;
    }

    public void setValidCPF(Boolean validCPF) {
        this.isValidCPF = validCPF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(cpf, customer.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf);
    }
}
