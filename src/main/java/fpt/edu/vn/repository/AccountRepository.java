package fpt.edu.vn.repository;

import fpt.edu.vn.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query(value = "SELECT id, email, phone, name, img, gender, password, createdDate FROM Account WHERE email = ?1 AND password = ?2", nativeQuery = true)
    public Account findByEmailPassword(String email, String password);
}
