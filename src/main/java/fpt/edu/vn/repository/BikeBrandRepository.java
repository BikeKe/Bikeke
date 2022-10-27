package fpt.edu.vn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fpt.edu.vn.entity.BikeBrand;

@Repository
public interface BikeBrandRepository extends JpaRepository<BikeBrand, Long>{

}
