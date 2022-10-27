package fpt.edu.vn.DTO;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerTripDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long customerId;
	private Long routeSlotId;
	private Long pickupStationId;
	private Long headtoStationId;
	private Float amount;
	private Long paymentMethodId;
	private Timestamp createdDate;
	private String status;

	public CustomerTripDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}



	public Long getRouteSlotId() {
		return routeSlotId;
	}

	public void setRouteSlotId(Long routeSlotId) {
		this.routeSlotId = routeSlotId;
	}

	public Long getPickupStationId() {
		return pickupStationId;
	}

	public void setPickupStationId(Long pickupStationId) {
		this.pickupStationId = pickupStationId;
	}

	public Long getHeadtoStationId() {
		return headtoStationId;
	}

	public void setHeadtoStationId(Long headtoStationId) {
		this.headtoStationId = headtoStationId;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Long getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(Long paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
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
