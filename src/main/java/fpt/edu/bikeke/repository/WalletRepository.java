package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.TripState;
import fpt.edu.bikeke.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
