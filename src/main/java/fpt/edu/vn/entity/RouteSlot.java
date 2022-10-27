package fpt.edu.vn.entity;

import java.sql.Time;
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
@Table(name = "RouteSlot")
public class RouteSlot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "RouteId")
	private Route route;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="TimeBegin")
	private Time timeBegin;
	
	@Column(name="TimeEnd")
	private Time timeEnd;
	
	@Column(name="Status")
	private String status;

	@OneToMany(mappedBy = "routeSlot", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<DriverTrip> list;
	
	@OneToMany(mappedBy = "routeSlot", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<CustomerTrip> cuslist;
	
	public RouteSlot() {
		super();
	}

	public RouteSlot(Long id, Route route, String name, Time timeBegin, Time timeEnd, String status) {
		super();
		this.id = id;
		this.route = route;
		this.name = name;
		this.timeBegin = timeBegin;
		this.timeEnd = timeEnd;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Time getTimeBegin() {
		return timeBegin;
	}

	public void setTimeBegin(Time timeBegin) {
		this.timeBegin = timeBegin;
	}

	public Time getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Time timeEnd) {
		this.timeEnd = timeEnd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
