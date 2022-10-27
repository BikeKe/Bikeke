package fpt.edu.vn.DTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerRouteRateDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long customerId;
	private Long routeId;
	private int totalTrip;

	public CustomerRouteRateDTO() {
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

	public Long getRouteId() {
		return routeId;
	}

	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}

	public int getTotalTrip() {
		return totalTrip;
	}

	public void setTotalTrip(int totalTrip) {
		this.totalTrip = totalTrip;
	}

}
