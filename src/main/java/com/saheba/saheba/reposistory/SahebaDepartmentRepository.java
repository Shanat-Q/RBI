package com.saheba.saheba.reposistory;

import com.saheba.saheba.entity.Saheba;

import com.saheba.saheba.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SahebaDepartmentRepository extends JpaRepository<Saheba, Integer> {

	@Query(value = "SELECT * FROM saheba s JOIN department d ON s.villagename = d.villagename", nativeQuery = true)
    List<Object[]> findAllSahebaAndDepartment();
    
    
}





