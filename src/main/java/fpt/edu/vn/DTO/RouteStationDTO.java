package fpt.edu.vn.DTO;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fpt.edu.vn.entity.Route;

public class RouteStationDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long routeId;
	private Long stationId;
	private Float previousStationDistance;
	private Time orderIndex;
	private String status;

	
	public RouteStationDTO() {
	}

	public RouteStationDTO(Long id, Long routeId, Long stationId, Float previousStationDistance, Time orderIndex,
			String status) {
		super();
		this.id = id;
		this.routeId = routeId;
		this.stationId = stationId;
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

	public Long getRouteId() {
		return routeId;
	}

	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}

	public Long getStationId() {
		return stationId;
	}

	public void setStationId(Long stationId) {
		this.stationId = stationId;
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
