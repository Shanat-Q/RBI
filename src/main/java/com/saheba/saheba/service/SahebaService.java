package com.saheba.saheba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saheba.saheba.entity.Department;
import com.saheba.saheba.entity.Saheba;
import com.saheba.saheba.reposistory.DepartmentRepo;
import com.saheba.saheba.reposistory.SahebaDepartmentRepository;
import com.saheba.saheba.reposistory.SahebaRepo;

@Service
public class SahebaService {

	@Autowired
	private SahebaRepo sahebaRepo;

	@Autowired
	private DepartmentRepo departmentRepo;

	@Autowired
	private SahebaDepartmentRepository sahebaDepartmentRepository;

	public Saheba save(Saheba saheba) {
		return sahebaRepo.save(saheba);
	}

	public Department savedepartment(Department department) {
		return departmentRepo.save(department);
	}

	public List<Saheba> getall() {
		return sahebaRepo.findAll();
	}

	public List<Department> getalll() {
		return departmentRepo.findAll();
	}

	public List<Object[]> getAllSahebaAndDepartment() {
		return sahebaDepartmentRepository.findAllSahebaAndDepartment();
	}

	public void deleteById(Integer id) {
		sahebaRepo.deleteById(id);
	}

	public void deleteByIdd(Integer id) {
		departmentRepo.deleteById(id);
	}

	public Saheba updateById(Integer id, Saheba u) {
		Saheba e = sahebaRepo.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
		e.setVillagename(u.getVillagename());
		e.setTotelpopulation(u.getTotelpopulation());
		e.setSarpanchname(u.getSarpanchname());
		e.setAge(u.getAge());
		return sahebaRepo.save(e);
	}

}
