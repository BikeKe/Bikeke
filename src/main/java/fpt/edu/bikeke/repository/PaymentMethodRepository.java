package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.DriverTrip;
import fpt.edu.bikeke.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
//    Optional<CustomerTrip> findCustomerByAccount(Account account);
}
