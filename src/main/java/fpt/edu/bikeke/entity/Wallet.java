package fpt.edu.bikeke.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import fpt.edu.bikeke.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;
    private float balance;

    private String currency;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
    private Timestamp createdDate;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    private List<CustomerTrip> cusTrip;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Transaction> transactionList;

}
