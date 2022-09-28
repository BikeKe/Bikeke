package fpt.edu.vn.repository;

import fpt.edu.vn.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "SELECT id, accountId, status FROM Customer WHERE accountId = ?1 AND status = ?2", nativeQuery = true)
    public Customer findByAccountIdStatus(Long accountId, String status);
}
