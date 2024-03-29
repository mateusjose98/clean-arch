package com.mateusjose98.ca.core.dataprovider;

import com.mateusjose98.ca.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
