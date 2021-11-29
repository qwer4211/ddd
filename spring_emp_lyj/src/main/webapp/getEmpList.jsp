<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글 목록</h1>
	
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<th>사원번호</th>
					<th>사원이름</th>
					<th>직책</th>
					<th>입사일</th>
					<th>급여</th>
					<th>성과급</th>
					<th>부서번호</th>
				</tr>
			<c:forEach items ="${employeeList}" var ="employee">
		
			<tr>
				<td>${employee.eno }</td>
				<td>${employee.ename }</td>
				<td>${employee.job }</td>
				<td>${employee.hiredate }</td>
				<td>${employee.sale}</td>
				<td>${employee.commission }</td>
				<td>${employee.deptno }</td>
			</tr>
			</c:forEach>			
			</table>
	
	<br />
	<a href="insertEmp.jsp">새글 등록</a>
</body>
</html>