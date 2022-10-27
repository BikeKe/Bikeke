package fpt.edu.vn.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.CustomerRouteRate;
import fpt.edu.vn.entity.DriverRouteRate;

@Repository
public interface DriverrRateRepository extends JpaRepository<DriverRouteRate, Long> {
	
}
