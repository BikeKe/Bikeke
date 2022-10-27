package fpt.edu.vn.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Role;
import fpt.edu.vn.entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
	
}
