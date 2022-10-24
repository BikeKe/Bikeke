package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.Account;
import fpt.edu.bikeke.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findCustomerByAccount(Account account);
}
