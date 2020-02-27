<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>InputForm</title>
	</head>
	
	<body>
		<h1>Test Modules for JPA and other database activities</h1>
		<p align="center" class="paraForm" id="paraContactForm">
			<h1>Input Form</h1>
			
			<form action="createcontact.do" method="post">
				<table class="inputform" id="inputcontact" border="1">
					<tr><th>Enter Contact Data:</th><th>Insert Values:</th></tr>
					<tr><td>Enter Name:</td>	<td><input type="text" name="cname"  autofocus	maxlength="20" placeholder="maxlength 20:" required></td></tr>
					<tr><td>Enter Contact:</td>	<td><input type="text" name="cnum"   maxlength="20" placeholder="maxlength 15:" required></td></tr>
					<tr><td><input type="submit" value="Persist"></td>	<td><input type="reset" value="Reset"></td></tr>
				</table>			
			</form> 
			
			<form action="dispatch.do" method="post">
				<table class="navigateform" id="navigate" border="1">	
					<tr><td><input type="submit" value="Back"></td>	<tr>					
					<tr><td><input type="hidden" value="index.jsp"></td>	<td>
				</table>			
			</form>
			
			<form action="showcontact.do" method="post">
				<table class="showdataform" id="showcontact" border="1">	
					<tr><td><input type="submit" value="Show Data"></td>	<tr>				
				</table>			
			</form> 
			
			
	</body>
</html>