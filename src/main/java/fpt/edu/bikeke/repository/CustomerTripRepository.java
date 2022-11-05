package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.Account;
import fpt.edu.bikeke.entity.Customer;
import fpt.edu.bikeke.entity.CustomerTrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerTripRepository extends JpaRepository<CustomerTrip, Long> {
//    Optional<CustomerTrip> findCustomerByAccount(Account account);
}
