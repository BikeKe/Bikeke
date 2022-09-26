package fpt.edu.vn.bikeke.repository;

import fpt.edu.vn.bikeke.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
