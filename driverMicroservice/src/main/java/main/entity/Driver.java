package main.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Driver{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int driverId;
	
	private String username;
	
	private String email;
	
	private String password;
	
	private String mobile;
	
	private String licenceNo;
	
	private float rating;
	
	private int cab;

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getCab() {
		return cab;
	}

	public void setCab(int cab) {
		this.cab = cab;
	}

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Driver(int driverId, String username, String email, String password, String mobile, String licenceNo,
			float rating, int cab) {
		super();
		this.driverId = driverId;
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.licenceNo = licenceNo;
		this.rating = rating;
		this.cab = cab;
	}

	
}
