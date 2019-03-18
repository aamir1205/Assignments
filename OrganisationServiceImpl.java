package com.spring.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class OrganisationServiceImpl implements OrganisationService {
	
	@Autowired
	private MasterData master;
	
	
	public void setMaster(MasterData master) {
		this.master = master;
	}




	@Override
	public List<Employee> getOrgDetailsById(String id) {
		// TODO Auto-generated method stub
		Organisation o1=new Organisation(id);
		List<Employee> list = null;
		master.setUpData();
		/*
		 * if(master.getOrgList().containsKey(o1)) {
		 * for(Map.Entry<Organisation,List<Employee>>
		 * temp:master.getOrgList().entrySet()) { temp.getKey(); }
		 * 
		 * list=new HashMap<>(); Organisation o= master.getOrgList().getKey(); master.
		 * 
		 * }
		 */
		
		return list;
		

	}

}
