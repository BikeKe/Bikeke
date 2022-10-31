package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.Trip;
import fpt.edu.bikeke.entity.TripState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripStateRepository extends JpaRepository<TripState, Long> {
}
