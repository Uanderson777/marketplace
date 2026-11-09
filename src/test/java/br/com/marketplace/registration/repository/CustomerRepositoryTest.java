package br.com.marketplace.registration.repository;

import br.com.marketplace.registration.domain.Customer;
import br.com.marketplace.registration.domain.CustomerId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void savesAndFindsCustomerByCustomerId() {
        Customer customer = new Customer("Ada Lovelace", "ada@example.com");
        CustomerId customerId = customer.getId();

        customerRepository.save(customer);
        customerRepository.flush();

        Customer savedCustomer = customerRepository.findById(customerId).orElseThrow();

        assertThat(savedCustomer.getId()).isEqualTo(customerId);
        assertThat(savedCustomer.getName()).isEqualTo("Ada Lovelace");
        assertThat(savedCustomer.getEmail()).isEqualTo("ada@example.com");
    }
}
