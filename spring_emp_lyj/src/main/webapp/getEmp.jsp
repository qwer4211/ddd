<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글 상세</h1>
	
	<form action="updateEmp.do" method="post"></form>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>사원번호</td>
			<td align="left">${employee.eno }</td>
		</tr>
		<tr>
			<td>사원이름</td>
			<td align="left" type="text" name="ename" value="${employee.ename }"></td>
		</tr>
		<tr>
			<td>직책</td>
			<td align="left" type="text" name="job" value="${employee.job }"></td>
		</tr>
		<tr>
			<td>입사일</td>
			<td align="left" type="text" name="hiredate" value="${employee.hiredate }"></td>
		</tr>
		<tr>
			<td>급여</td>
			<td align="left" type="text" name="sale" value="${employee.sale }"></td>
		</tr>
		<tr>
			<td>성과급</td>
			<td align="left" type="text" name="commission" value="${employee.commission }"></td>
		</tr>
		<tr>
			<td>부서번호</td>
			<td align="left" type="text" name="deptno" value="${employee.deptno }"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="글 수정" />
		</td>
		</tr>
		<hr>
			<a href="insertEmp.jsp">글 등록</a>&nbsp;&nbsp;&nbsp;
			<a href="deleteEmp.do?eno=${employee.eno }">글 삭제</a>&nbsp;&nbsp;&nbsp;
			<a href="getEmpList.do">글 목록</a>	
	
	</table>
</body>
</html>