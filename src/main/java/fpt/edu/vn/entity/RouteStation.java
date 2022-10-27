package fpt.edu.vn.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RouteStation	")
public class RouteStation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "RouteId")
	private Route route;
	
	@ManyToOne
	@JoinColumn(name="StationId")
	private Station station;
	
	@Column(name="PreviousStationDistance")
	private Float previousStationDistance;
	
	@Column(name="OrderIndex")
	private Time orderIndex;
	
	@Column(name="Status")
	private String status;

	public RouteStation() {
		super();
	}

	public RouteStation(Long id, Route route, Station station, Float previousStationDistance, Time orderIndex,
			String status) {
		super();
		this.id = id;
		this.route = route;
		this.station = station;
		this.previousStationDistance = previousStationDistance;
		this.orderIndex = orderIndex;
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

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Float getPreviousStationDistance() {
		return previousStationDistance;
	}

	public void setPreviousStationDistance(Float previousStationDistance) {
		this.previousStationDistance = previousStationDistance;
	}

	public Time getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(Time orderIndex) {
		this.orderIndex = orderIndex;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

}
