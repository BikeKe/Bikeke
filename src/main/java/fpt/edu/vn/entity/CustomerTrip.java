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

import net.bytebuddy.utility.nullability.MaybeNull;

@Entity
@Table(name = "CustomerTrip")
public class CustomerTrip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id", nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "CustomerId")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "RouteSlotId")
	private RouteSlot routeSlot;

	@ManyToOne
	@JoinColumn(name = "PickupStationId")
	private Station pickupStation;

	@ManyToOne
	@JoinColumn(name = "HeadtoStationId")
	private Station headtoStation;

	@Column(name = "Amount")
	private Float amount;

	@ManyToOne
	@JoinColumn(name = "PaymentMethodId")
	private PaymentMethod paymentMethod;

	@Column(name = "CreatedDate", columnDefinition = "DATETIME2  DEFAULT GETDATE()")
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());;

	@Column(name = "Status")
	private String status;

	@OneToMany(mappedBy = "customerTrip", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Trip> tripList;
	
	
	public CustomerTrip() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public RouteSlot getRouteSlot() {
		return routeSlot;
	}

	public void setRouteSlot(RouteSlot routeSlot) {
		this.routeSlot = routeSlot;
	}

	public Station getPickupStation() {
		return pickupStation;
	}

	public void setPickupStation(Station pickupStation) {
		this.pickupStation = pickupStation;
	}

	public Station getHeadtoStation() {
		return headtoStation;
	}

	public void setHeadtoStation(Station headtoStation) {
		this.headtoStation = headtoStation;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
