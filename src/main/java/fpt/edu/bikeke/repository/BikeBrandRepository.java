package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.Account;
import fpt.edu.bikeke.entity.BikeBrand;
import fpt.edu.bikeke.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BikeBrandRepository extends JpaRepository<BikeBrand, Long> {
//    Optional<Account> findAccountByEmail(String email);
//    Page<Account> findAllByRole(Role role, Pageable pageable);
//    Boolean existsAccountByEmail(String email);
}
