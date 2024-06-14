package com.saheba.saheba.reposistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.saheba.saheba.entity.Saheba;

@Repository
public interface SahebaRepo extends JpaRepository<Saheba, Integer> {

	List<Saheba> findByVillagename(String villagename);

	// Custom query method using JPQL
	@Query("SELECT s FROM Saheba s JOIN Department d ON s.villagename = d.villagename WHERE s.villagename = ?1")
	List<Saheba> findByVillagenameWithDepartment(String villagename);
	
	//@Query("select * from saheba where villagename=?1 and villagenamee=?2")
	//List<Saheba> findByVillagenameWithDepartmentt(String villagename,String villagenamee);

}


