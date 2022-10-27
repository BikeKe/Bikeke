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
@Table(name = "DriverTrip")
public class DriverTrip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id", nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "RouteSlotId")
	private RouteSlot routeSlot;
	
	@Column(name = "CreatedDate", columnDefinition = "DATETIME2  DEFAULT GETDATE()")
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());;
	
	@Column(name = "Status")
	private String status;

	@OneToMany(mappedBy = "driverTrip", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Trip> tripList;
	
	
	public DriverTrip() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RouteSlot getRouteSlot() {
		return routeSlot;
	}

	public void setRouteSlot(RouteSlot routeSlot) {
		this.routeSlot = routeSlot;
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
	

