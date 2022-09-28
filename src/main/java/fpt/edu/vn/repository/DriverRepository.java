package fpt.edu.vn.repository;

import fpt.edu.vn.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    @Query(value = "SELECT id, accountId, status FROM Driver WHERE accountId = ?1 AND status = ?2", nativeQuery = true)
    public Driver findByAccountIdStatus(Long accountId, String status);
}
