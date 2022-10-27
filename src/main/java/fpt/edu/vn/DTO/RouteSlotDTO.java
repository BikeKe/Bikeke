package fpt.edu.vn.DTO;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

public class RouteSlotDTO<T> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long routeId;
	private String name;
	private Time timeBegin;
	private Time timeEnd;
	private String status;
	private List<T> listResult = new ArrayList<>();	
	
	
	public RouteSlotDTO() {
		super();
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
