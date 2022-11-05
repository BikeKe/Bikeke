package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.Payment;
import fpt.edu.bikeke.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
//    Optional<CustomerTrip> findCustomerByAccount(Account account);
}
