package org.example.customerservice.mappers;


import org.example.customerservice.dtos.CustomerRequest;
import org.example.customerservice.dtos.CustomerResponse;
import org.example.customerservice.models.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toCustomerWithOutId(CustomerRequest customer) {
        return Customer.builder()
                .firstName(customer.firstname())
                .lastName(customer.lastname())
                .email(customer.email())
                .address(customer.address())
                .build();
    }

    public CustomerResponse toCustomerResponse(Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .email(customer.getEmail())
                .firstname(customer.getFirstName())
                .lastname(customer.getLastName())
                .build();
    }
}
