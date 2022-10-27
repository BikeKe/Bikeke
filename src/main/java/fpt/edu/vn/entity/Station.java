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
@Table(name = "Station")
public class Station {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="Name")
	private String name;

	@Column(name="Address")
	private String address;

	@Column(name="Img")
	private String img;

	@Column(name="Latitude")
	private Float latitude;

	@Column(name="Longtitude")
	private Float longtitude;

	@Column(name="Status")
	private String status;

	@OneToMany(mappedBy = "pickupStation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<CustomerTrip> getCustomerTrip;
	
	@OneToMany(mappedBy = "headtoStation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<CustomerTrip> cusListt;

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

//	public List<CustomerTrip> getGetCustomerTrip() {
//		return getCustomerTrip;
//	}
//
//	public void setGetCustomerTrip(List<CustomerTrip> getCustomerTrip) {
//		this.getCustomerTrip = getCustomerTrip;
//	}
//
//	public List<CustomerTrip> getCusListt() {
//		return cusListt;
//	}
//
//	public void setCusListt(List<CustomerTrip> cusListt) {
//		this.cusListt = cusListt;
//	}
	
	
	

}
