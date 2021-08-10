package main.valueObjects;

import main.entity.Driver;

public class ResponseTemplateVO {
	
	private Cab cab;
	
	private Driver driver;

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseTemplateVO(Cab cab, Driver driver) {
		super();
		this.cab = cab;
		this.driver = driver;
	}
	
	

}
