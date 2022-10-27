package fpt.edu.vn.DTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DriverDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long accountId;
	private int idNumber;
	private int idImg;
	private String status;

	public DriverDTO(Long id, Long accountId, int idNumber, int idImg, String status) {
		this.id = id;
		this.accountId = accountId;
		this.idNumber = idNumber;
		this.idImg = idImg;
		this.status = status;
	}

	public DriverDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
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
