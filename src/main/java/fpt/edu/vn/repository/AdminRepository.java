package fpt.edu.vn.repository;

import fpt.edu.vn.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    @Query(value = "SELECT id, accountId, isSuper, status FROM Admin WHERE accountId = ?1 AND status = ?2", nativeQuery = true)
    public Admin findByAccountIdStatus(Long accountId, String status);
}
