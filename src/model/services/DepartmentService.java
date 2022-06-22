package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	//list mockada
	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		
		list.add(new Department(1, "RH"));
		list.add(new Department(2, "TI"));
		list.add(new Department(3, "Operation"));
		return list;
	}

}
