package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import main.entity.Driver;
import main.service.DriverServices;
import main.valueObjects.ResponseTemplateVO;

@CrossOrigin
@RestController
@RequestMapping("/driver")
public class DriverController {
	
	@Autowired
	private DriverServices driverServ;
	
	@PostMapping("/new-driver")
	public void insertDriver(@RequestBody Driver driver) {
		driverServ.insertDriver(driver);
		
	}
	
	@PostMapping("/update")
	public void updateDriver(@RequestBody Driver driver) {
		driverServ.updateDriver(driver);
	}
	
	@DeleteMapping("/delete/{driverId}")
	public void deleteCustomer(@PathVariable("driverId") int driverId) {
		driverServ.deleteDriver(driverId);
	}
	
	@GetMapping("/view/{driverId}")
	public ResponseTemplateVO viewDriver(@PathVariable("driverId") int driverId) {
		return driverServ.viewDriver(driverId);
	}
	
}
