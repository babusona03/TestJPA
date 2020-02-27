<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
	<h3>1<c:out value='${param.data }'></c:out></h3>
	<h3>2<c:out value='${data }'></c:out></h3>
	<table class="showform" id="showcontact" border="1">
		<tr><th><h3 class="rowheader">Serial</h3></th><th><h3 class="rowheader">Name</h3></th><th><h3 class="rowheader">Contact</h3></th></tr>
					
		<c:forEach var="listItem" items="${requestScope.result}">
			<tr>
				<td><c:out value='${listItem.id}' 			default="No Data.">		</c:out>	</td>					
				<td><c:out value='${listItem.contactName}' 	default="No Data.">		</c:out>	</td>
				<td><c:out value='${listItem.phoneNo}' 		default="No Data.">		</c:out>	</td>
			</tr>		
		</c:forEach>					
	</table>
</body>
</html>