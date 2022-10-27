package fpt.edu.vn.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class StationDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String address;

	private String img;

	private Float latitude;

	private Float longtitude;

	private String status;

	public StationDTO() {
		super();
	}

	public StationDTO(Long id, String name, String address, String img, Float latitude, Float longtitude,
			String status) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.img = img;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(Float longtitude) {
		this.longtitude = longtitude;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
