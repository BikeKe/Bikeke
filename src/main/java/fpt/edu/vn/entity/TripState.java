package fpt.edu.vn.entity;

import java.sql.Date;
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

import javax.persistence.Table;

@Entity
@Table(name = "TripState")
public class TripState {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "TripId")
	private Trip trip;

	@Column(name = "CreatedDate", columnDefinition = "DATETIME2  DEFAULT GETDATE()")
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());;

	@Column(name = "StateFrom")
	private String stateFrom;

	@Column(name = "StateTo")
	private String stateTo;

	@ManyToOne
	@JoinColumn(name = "AccountId")
	private Account account;

	public TripState() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getStateFrom() {
		return stateFrom;
	}

	public void setStateFrom(String stateFrom) {
		this.stateFrom = stateFrom;
	}

	public String getStateTo() {
		return stateTo;
	}

	public void setStateTo(String stateTo) {
		this.stateTo = stateTo;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}



}
