package com.lyj.biz.emp.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.lyj.biz.emp.EmployeeVO;

public class EmployeeDAO {

	
	
	private final String EMP_INSERT = "insert into emp_tbl(eno,ename,job,hiredate,sale,commission,deptno) values(?,?,?,?,?,?,?)";
	private final String EMP_UPDATE = "update emp_tbl set job=?, sale=? where eno=?";
	private final String ENP_DELETE = "delete from emp_tbl where eno=?";
	private final String ENP_GET = "select * from emp_tbl where eno=?";
	private final String EMP_LIST ="select * from emp_tbl order by eno desc";


	public EmployeeDAO() {
	}

	public void insertEmp(EmployeeVO vo){
		
	}
	
	public void updateEmp(EmployeeVO vo){
		
	}
	public void deleteEmp(EmployeeVO vo){
		
	}
	public EmployeeVO getEmp(EmployeeVO vo){
		
		EmployeeVO employee = null;
		
		return employee;
	}
	public List<EmployeeVO> getEmpList(EmployeeVO vo){
	
		List<EmployeeVO> employeeList = new ArrayList<EmployeeVO>();
		
		return employeeList;
	}
}
