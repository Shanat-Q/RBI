package com.saheba.saheba.entity;






import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "saheba_mp")

public class Saheba {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String villagename;
	private String totelpopulation;
	private String sarpanchname;
	//@Column(name = "age",nullable = true)
	private String age;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVillagename() {
		return villagename;
	}

	public void setVillagename(String villagename) {
		this.villagename = villagename;
	}

	public String getTotelpopulation() {
		return totelpopulation;
	}

	public void setTotelpopulation(String totelpopulation) {
		this.totelpopulation = totelpopulation;
	}

	public String getSarpanchname() {
		return sarpanchname;
	}

	public void setSarpanchname(String sarpanchname) {
		this.sarpanchname = sarpanchname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
