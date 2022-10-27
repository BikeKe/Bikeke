package fpt.edu.vn.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="WalletId")
	private Wallet wallet;
	
	@ManyToOne
	@JoinColumn(name="PaymentId")
	private Payment payment;
	
	@Column(name="Amount")
	private Float amount;
	
	@Column(name="Currency")
	private String currency;
	
	@Column(name = "CreatedDate", columnDefinition = "DATETIME2  DEFAULT GETDATE()")
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());;
	
	@Column(name="Status")
	private String status;

	
	

}
