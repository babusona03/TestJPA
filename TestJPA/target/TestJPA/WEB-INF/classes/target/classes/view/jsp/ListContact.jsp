<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Index</title>
</head>
<body>
	<h1>Contact Information Retrieved from Database</h1>
	<br/><br/>
	
	<h3><a href=<c:url value="index.jsp" />>Back To Main</a></h3>
	<table class="showform" id="showcontact" border="1">
		<tr><th><h3 class="rowheader">Serial</h3></th><th><h3 class="rowheader">Name</h3></th><th><h3 class="rowheader">Contact</h3></th></tr>
				
		<c:forEach var="listItem" items="${contactInformation }">
			<tr>
				<td><c:out value="${listItem.id }" 			default="No Data." ></c:out></td>
				
				<td><c:out value='${listItem.contactName }' default="No Data"></c:out></td>
				<td><c:out value='${listItem.phoneNo }' 	default="No Data"></c:out></td>
			</tr>		
		</c:forEach>					
	</table>
</body>
</html>