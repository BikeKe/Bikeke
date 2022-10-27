package fpt.edu.vn.DTO;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class AccountDTO<T> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String email;
	private String phone;
	private String name;
	private String gender;
	private String img;
	private String password;
	private Long roleId;
	private Timestamp createdDate;
	private List<T> listResult = new ArrayList<>();	
	
	public AccountDTO() {
	}

	public AccountDTO(Long id, String email, String phone, String name, String gender, String img, String password,
			Long roleId, Timestamp createdDate) {
		super();
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.name = name;
		this.gender = gender;
		this.img = img;
		this.password = password;
		this.roleId = roleId;
		this.createdDate = createdDate;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getRoleId() {
		return roleId;
	}


	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public Timestamp getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}


	
	@Override
	public String toString() {
		return "AccountDTO{" + 
				"id=" + id + 
				", email=' " + email + '\'' +
				", phone=' " + phone + '\'' + 
				", name=' " + name + '\'' + 
				", gender=' " + gender + '\'' + 
				", img=' " + img + '\'' + 
				", password=' " + password + '\'' +
				", roleId=' " + roleId + '\'' +
				", CreatedDate=' " + createdDate + '\'' +
				'}';
	}
	

	
	
	
	
}
