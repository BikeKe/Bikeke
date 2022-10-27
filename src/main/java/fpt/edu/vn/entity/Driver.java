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
@Table(name = "Driver")
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id", nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "AccountId")
	private Account account;
	
	@Column(name = "IdNumber")
	private int idNumber;
	
	@Column(name = "IdImg")
	private int idImg;
	
	@Column(name = "Status")
	private String status;


	
	public Driver() {
		super();
	}

	public Driver(long id, Account account, int idNumber, int idImg, String status) {
		super();
		this.id = id;
		this.account = account;
		this.idNumber = idNumber;
		this.idImg = idImg;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public int getIdImg() {
		return idImg;
	}

	public void setIdImg(int idImg) {
		this.idImg = idImg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
	

