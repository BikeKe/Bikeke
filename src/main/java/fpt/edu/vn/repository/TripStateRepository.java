package fpt.edu.vn.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Trip;
import fpt.edu.vn.entity.TripState;

@Repository
public interface TripStateRepository extends JpaRepository<TripState, Long> {
	
}
