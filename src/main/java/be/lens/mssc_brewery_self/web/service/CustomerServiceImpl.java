package be.lens.mssc_brewery_self.web.service;

import be.lens.mssc_brewery_self.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Thor Huygh").build();
    }
}
