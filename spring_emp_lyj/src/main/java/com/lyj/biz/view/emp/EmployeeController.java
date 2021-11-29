package com.lyj.biz.view.emp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lyj.biz.emp.EmployeeVO;
import com.lyj.biz.emp.impl.EmployeeDAO;

@Controller
public class EmployeeController {

	public EmployeeController() {
	}
	
	//1.�� ��� ��ȸ
	@RequestMapping(value="/getEmpList.do")
	public ModelAndView getEmpList(EmployeeVO vo , EmployeeDAO employeeDAO,ModelAndView mav){
		mav.addObject("employeeList", employeeDAO.getEmpList(vo));
		mav.setViewName("getEmpList.jsp");
		return mav;
	}
	
	
	
	//2.�� �� ��ȸ
		@RequestMapping(value="/getEmp.do")
		public ModelAndView getEmp(EmployeeVO vo, EmployeeDAO employeeDAO,ModelAndView mav){
		
			mav.addObject("employee", employeeDAO.getEmp(vo));
			mav.setViewName("getEmp.jsp");
			return mav;
		}
	
	
	//3.�� ��� ó��
	@RequestMapping(value="/insertEmp.do")
	public void insertEmp(EmployeeVO vo, EmployeeDAO employeeDAO){
		
		employeeDAO.insertEmp(vo);
		
		
	}
	
	//4.�� ���� ó��
		@RequestMapping(value="/updateEmp.do")
		public void updateEmp(EmployeeVO vo, EmployeeDAO employeeDAO){
			
			employeeDAO.updateEmp(vo);
		
	}
	//5.�� ���� ó��
		@RequestMapping(value="/deleteEmp.do")
		public void deleteEmp(EmployeeVO vo, EmployeeDAO employeeDAO){
			employeeDAO.deleteEmp(vo);
			
		
	}
}
