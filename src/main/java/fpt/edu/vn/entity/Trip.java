package fpt.edu.vn.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Trip")
public class Trip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "CustomerTripId")
	private CustomerTrip customerTrip;

	@ManyToOne
	@JoinColumn(name = "DriverTripId")
	private DriverTrip driverTrip;

	@Column(name = "Amount")
	private Float amount;

	@Column(name = "DriverComment")
	private String driverComment;

	@Column(name = "DriverRate")
	private int driverRate;

	@Column(name = "CustomerComment")
	private String customerComment;

	@Column(name = "CustomerRate")
	private int customerRate;

	@Column(name = "CreatedDate", columnDefinition = "DATETIME2  DEFAULT GETDATE()")
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());;

	@Column(name = "PickedUpTime", columnDefinition = "DATETIME2  DEFAULT GETDATE()")
	private Timestamp pickedUpTime = new Timestamp(System.currentTimeMillis());;

	@Column(name = "ArrivedTime", columnDefinition = "DATETIME2  DEFAULT GETDATE()")
	private Timestamp arrivedTime = new Timestamp(System.currentTimeMillis());;

	@Column(name = "Status")
	private String status;

	@OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Payment> payList;

	public Trip() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomerTrip getCustomerTrip() {
		return customerTrip;
	}

	public void setCustomerTrip(CustomerTrip customerTrip) {
		this.customerTrip = customerTrip;
	}

	public DriverTrip getDriverTrip() {
		return driverTrip;
	}

	public void setDriverTrip(DriverTrip driverTrip) {
		this.driverTrip = driverTrip;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getDriverComment() {
		return driverComment;
	}

	public void setDriverComment(String driverComment) {
		this.driverComment = driverComment;
	}

	public int getDriverRate() {
		return driverRate;
	}

	public void setDriverRate(int driverRate) {
		this.driverRate = driverRate;
	}

	public String getCustomerComment() {
		return customerComment;
	}

	public void setCustomerComment(String customerComment) {
		this.customerComment = customerComment;
	}

	public int getCustomerRate() {
		return customerRate;
	}

	public void setCustomerRate(int customerRate) {
		this.customerRate = customerRate;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getPickedUpTime() {
		return pickedUpTime;
	}

	public void setPickedUpTime(Timestamp pickedUpTime) {
		this.pickedUpTime = pickedUpTime;
	}

	public Timestamp getArrivedTime() {
		return arrivedTime;
	}

	public void setArrivedTime(Timestamp arrivedTime) {
		this.arrivedTime = arrivedTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
