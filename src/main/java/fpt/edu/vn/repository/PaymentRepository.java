package fpt.edu.vn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fpt.edu.vn.entity.BikeBrand;
import fpt.edu.vn.entity.Payment;
import fpt.edu.vn.entity.PaymentMethod;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}