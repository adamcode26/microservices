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

import main.entity.Cab;
import main.service.CabServices;

@CrossOrigin
@RestController
@RequestMapping("/cab")
public class CabController {
	
	@Autowired
	private CabServices cabServ;
	
	@PostMapping("/new-cab")
	public ResponseEntity <List<Cab>> insertCab(@RequestBody Cab cab) {
		cabServ.insertCab(cab);
		return new ResponseEntity("Success", HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public void updatecab(@RequestBody Cab cab) {
		cabServ.insertCab(cab);
	}
	
	@DeleteMapping("/delete/{cabId}")
	public void deleteCab(@PathVariable("cabId") int cabId) {
		cabServ.deleteCab(cabId);
	}
	
	@GetMapping("/count/{carType}")
	public int countCab(@PathVariable("carType") String carType) {
		return cabServ.countCab(carType);
	}
	
	@GetMapping("/view/{carType}")
	public /*ResponseEntity <*/List<Cab>/*>*/ viewCab(@PathVariable("carType") String carType){
		List <Cab> cars = cabServ.viewCab(carType);
		
		return cars;
		/*if(cars.isEmpty()) {
			return new ResponseEntity("Sorry No cars available", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List <Cab>>(cars, HttpStatus.OK);*/
	}
	
	@GetMapping("/viewbyid/{cabId}")
	public ResponseEntity <Cab> viewCabById(@PathVariable("cabId") int cabId){
		Cab cab = cabServ.viewCabById(cabId);
		if(cab==null) {
			return new ResponseEntity("Sorry no cab found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Cab> (cab,HttpStatus.OK);
	}

}
