package fpt.edu.vn.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Route")
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@Column(name="PlaceFrom")
	private String placeFrom;
	
	@Column(name="PlaceTo")
	private String placeTo;
	
	@Column(name="DefaultCost")
	private Float defaultCost;
	
	@Column(name="Status")
	private String status;

	@OneToMany(mappedBy = "route", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<CustomerRouteRate> customerRatelist;
	
	@OneToMany(mappedBy = "route", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<DriverRouteRate> driverRatelist;
	
	
	public Route() {
		super();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaceFrom() {
		return placeFrom;
	}

	public void setPlaceFrom(String placeFrom) {
		this.placeFrom = placeFrom;
	}

	public String getPlaceTo() {
		return placeTo;
	}

	public void setPlaceTo(String placeTo) {
		this.placeTo = placeTo;
	}

	public Float getDefaultCost() {
		return defaultCost;
	}

	public void setDefaultCost(Float defaultCost) {
		this.defaultCost = defaultCost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	

}
