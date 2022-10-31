package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.CustomerRouteRate;
import fpt.edu.bikeke.entity.DriverRouteRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRouteRateRepository extends JpaRepository<DriverRouteRate, Long> {
}
