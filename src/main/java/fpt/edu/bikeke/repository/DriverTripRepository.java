package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.CustomerTrip;
import fpt.edu.bikeke.entity.DriverTrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverTripRepository extends JpaRepository<DriverTrip, Long> {
//    Optional<CustomerTrip> findCustomerByAccount(Account account);
}
