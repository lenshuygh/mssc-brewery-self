package be.lens.mssc_brewery_self.web.service;

import be.lens.mssc_brewery_self.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Thor Huygh").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
      log.info("updating customer with id {}",customerId);
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.info("deleting customer with id {}",customerId);
    }
}
