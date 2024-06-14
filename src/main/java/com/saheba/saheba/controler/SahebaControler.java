package com.saheba.saheba.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saheba.saheba.entity.Department;
import com.saheba.saheba.entity.Saheba;
import com.saheba.saheba.service.SahebaService;

@RestController
@RequestMapping("/saheba")

public class SahebaControler {

	@Autowired
	private SahebaService sahebaService;

	@PostMapping(value = "/save")
	Saheba save(@RequestBody Saheba saheba) {
		return sahebaService.save(saheba);
	}

	@PostMapping(value = "/savedepartment")
	Department savedepartment(@RequestBody Department department) {
		return sahebaService.savedepartment(department);
	}

	@GetMapping(value = "/getall")
	List<Saheba> getall() {
		return sahebaService.getall();
	}

	@GetMapping("/sahebadepartmentdata")
	public List<Object[]> getAllSahebaAndDepartment() {
		return sahebaService.getAllSahebaAndDepartment();
	}

	@DeleteMapping(value = "/delete/{id}")
	String deleteById(@PathVariable Integer id) {
		sahebaService.deleteById(id);
		return "Deleted!!";
	}

	@PutMapping(value = "/update/{id}")
	public Saheba update(@PathVariable Integer id, @RequestBody Saheba saheba) {
		return sahebaService.updateById(id, saheba);
	}

}


