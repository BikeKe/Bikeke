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
@Table(name = "Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id", nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "AccountId")
	private Account account;
	
	@Column(name = "TotalTrip")
	private int totalTrip;
	
	@Column(name = "Status")
	private String status;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<CustomerTrip> getCustomerTrip;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<CustomerRouteRate> getCustomerRouteRate;
	
	public Customer() {
		super();
	}

	public Customer(long id, Account account, int totalTrip, String status) {
		super();
		this.id = id;
		this.account = account;
		this.totalTrip = totalTrip;
		this.status = status;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public int getTotalTrip() {
		return totalTrip;
	}


	public void setTotalTrip(int totalTrip) {
		this.totalTrip = totalTrip;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	
	
	
}
	

