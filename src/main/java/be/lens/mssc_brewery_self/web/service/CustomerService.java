package be.lens.mssc_brewery_self.web.service;

import be.lens.mssc_brewery_self.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomer(UUID customerId);
}
