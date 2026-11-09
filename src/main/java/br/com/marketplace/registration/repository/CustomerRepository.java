package br.com.marketplace.registration.repository;

import br.com.marketplace.registration.domain.Customer;
import br.com.marketplace.registration.domain.CustomerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, CustomerId> {
}
