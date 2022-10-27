package fpt.edu.vn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerRouteRate")
public class CustomerRouteRate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "CustomerId")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "RouteId")
	private Route route;

	@Column(name = "TotalTrip")
	private int totalTrip;

	public CustomerRouteRate() {
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

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public int getTotalTrip() {
		return totalTrip;
	}

	public void setTotalTrip(int totalTrip) {
		this.totalTrip = totalTrip;
	}

}
