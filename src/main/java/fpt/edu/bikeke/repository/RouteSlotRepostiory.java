package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.Role;
import fpt.edu.bikeke.entity.RouteSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteSlotRepostiory extends JpaRepository<RouteSlot, Long> {
}
