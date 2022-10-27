package fpt.edu.vn.DTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class RouteDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String placeFrom;
	private String placeTo;
	private Float defaultCost;
	private String status;

	public RouteDTO() {
		super();
	}

	public RouteDTO(Long id, String placeFrom, String placeTo, Float defaultCost, String status) {
		super();
		this.id = id;
		this.placeFrom = placeFrom;
		this.placeTo = placeTo;
		this.defaultCost = defaultCost;
		this.status = status;
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
