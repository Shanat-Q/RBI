package com.saheba.saheba.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saheba.saheba.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
