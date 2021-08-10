package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import main.entity.Driver;
import main.repository.DriverRepository;
import main.valueObjects.Cab;
import main.valueObjects.ResponseTemplateVO;

@Service
public class DriverServices {
	
	@Autowired
	private DriverRepository driverRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public void insertDriver(Driver driver) {
		driverRepo.save(driver);
	}
	
	public void updateDriver(Driver driver) {
		driverRepo.save(driver);
	}
	
	public void deleteDriver(Integer id) {
		driverRepo.deleteById(id);
	}
	
	/*public List<Driver> viewBestDriver(){
        return driverRepo.viewBestDriver();
    }*/
	
	public ResponseTemplateVO viewDriver(Integer id) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Driver driver = driverRepo.findById(id).get();
		
		Cab cab = restTemplate.getForObject("http://CAB-SERVICE/cab/viewbyid/"+driver.getCab(), Cab.class);
		vo.setDriver(driver);
		vo.setCab(cab);
		return vo;
	}
	
	/*public List<Driver> viewFreeDriver(){
		return driverRepo.viewFreeDriver();
	}
	
	public Driver validateDriver(String username, String password) {
		return driverRepo.validateDriver(username, password);
	}
	
	public List<Driver> viewAllDriver(){
		return driverRepo.findAll();
	}*/


}
