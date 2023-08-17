<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h1{
		text-align: center;
	}
	table {
		margin: 0 auto;
	}
	table img {
		width: 100px;
		height: 100px;
		object-fit: cover;
		}
	h2 {
		text-align: center;
	}
</style>
<body>
	<h1>Fruit Total List</h1>
	<table>
	<thead>
		<tr>
			<c:forEach items="${item}" var="item">
                    <td>
                    	<a href="itemView.do?item_id=${item.itemId}">
                        <p><img src="${item.pictureUrl}"></p>
						</a>
                        <p>상품명 : ${item.itemName}</p>
                        <p>가 격 : ${item.price}원 </p>

                    </td>
            </c:forEach>
		</tr>
	</thead>
	</table>
<hr>   
		 
    	<c:if test="${not empty fruits}">
    	<h2>오늘 본 상품</h2>
 		
 		<table>
 				<tr>
 					<c:forEach items="${fruits}" var="fruit">
 						<td>
 						<img src="${fruit}">
 						</td>
 					</c:forEach>
 				</tr>
 		</table>
    	
    	</c:if>
        
    	    
</body>
</html> 