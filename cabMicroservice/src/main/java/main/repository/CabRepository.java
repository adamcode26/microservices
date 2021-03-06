package main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import main.entity.Cab;


@Repository
public interface CabRepository extends JpaRepository<Cab, Integer>{
	
	@Query("SELECT COUNT(c) FROM Cab c WHERE LOWER(c.carType) = LOWER(:carType)")
	int countCab(@Param("carType") String carType);
	
	@Query("SELECT c FROM Cab c WHERE LOWER(c.carType) = LOWER(:carType)")
	List<Cab> viewCab(@Param("carType") String carType);
	
}
