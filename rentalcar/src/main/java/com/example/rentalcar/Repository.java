package com.example.rentalcar;

import java.util.List;
// import com.example.rentalcar.Carentity;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
// import org.springframework.stereotype.Repository;
// @Repository
public interface Repository extends JpaRepository<Carentity, String>{

    // @Query(value = "SELECT * FROM rentalcar WHERE id=?1", nativeQuery = true)
	// List<Carentity> display(String carId);
	
	@Query(value = "DELETE FROM rentalcar WHERE id=?1", nativeQuery = true)
	 List<Carentity> delete(String carId);
	
    //  @Modifying
	// @Query(value = "UPDATE rentalcar.Carentity SET Status='booked' WHERE id=?1", nativeQuery = true)
	// List<Carentity> print(String carId);

    @Query(value = "SELECT * FROM rentalcar WHERE id=?1", nativeQuery = true)
	List<Carentity> get(String carId);
}
