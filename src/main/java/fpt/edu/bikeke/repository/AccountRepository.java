package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findAccountByEmail(String email);

    Boolean existsAccountByEmail(String email);
}
