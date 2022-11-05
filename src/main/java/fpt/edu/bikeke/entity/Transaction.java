package fpt.edu.bikeke.entity;

import fpt.edu.bikeke.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "walletId")
    private Wallet wallet;

    @ManyToOne
    @JoinColumn(name = "paymentId")
    private Payment payment;
    private Float amount;
    private String currency;
    private Timestamp createdDate;
    private String name;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}
