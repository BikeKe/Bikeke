package fpt.edu.vn.DTO;


import java.sql.Timestamp;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class TripDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long customerTripId;

	private Long driverTripId;

	private Float amount;

	private String driverComment;

	private int driverRate;

	private String customerComment;

	private int customerRate;

	private Timestamp createdDate;

	private Timestamp pickedUpTime;

	private Timestamp arrivedTime;

	private String status;

	public TripDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerTripId() {
		return customerTripId;
	}

	public void setCustomerTripId(Long customerTripId) {
		this.customerTripId = customerTripId;
	}

	public Long getDriverTripId() {
		return driverTripId;
	}

	public void setDriverTripId(Long driverTripId) {
		this.driverTripId = driverTripId;
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
