package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepostiory extends JpaRepository<Role, Long> {
}
