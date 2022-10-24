package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.CustomerRouteRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRouteRateRepository extends JpaRepository<CustomerRouteRate, Long> {
}
