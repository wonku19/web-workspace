  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	
 	오늘 선택할 수 있는 저녁 메뉴들 입니다.
 	
 	<ul>
 		<c:forEach items="${arr}" var="dish">
 			<li>${dish}</li>
 		</c:forEach>
 		
 	</ul>
 
 
</body>
</html>