package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.Station;
import fpt.edu.bikeke.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
}
