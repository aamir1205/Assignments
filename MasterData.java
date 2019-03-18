package com.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

@Controller
public class MasterData {
	
	private  Map<Organisation,List<Employee>> orgList=new HashMap<>();
	private List<Employee> empList= new ArrayList<>();
	
	public void setUpData()
	{
		Organisation o1=new Organisation("Org001", "Hyd", "123");
		empList.add(new Employee("1", "abc", "pune", 123213, "34234234"));
		empList.add(new Employee("2", "xyz", "pune", 234, "35345345"));
		empList.add(new Employee("3", "fdg", "pune", 4353, "5656456"));
		empList.add(new Employee("4", "dfg", "pune", 435345, "546546546"));
		orgList.put(o1,empList);
	}

	public Map<Organisation, List<Employee>> getOrgList() {
		return orgList;
	}

	public void setOrgList(Map<Organisation, List<Employee>> orgList) {
		this.orgList = orgList;
	}

	
	
}
