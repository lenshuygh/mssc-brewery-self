package be.lens.mssc_brewery_self.web.controller;

import be.lens.mssc_brewery_self.web.model.CustomerDto;
import be.lens.mssc_brewery_self.web.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getcustomer(@PathVariable UUID customerId){
        return new ResponseEntity<>(customerService.getCustomer(customerId), HttpStatus.OK);
    }
}
