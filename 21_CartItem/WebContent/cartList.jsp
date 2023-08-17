<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 목록</title>
</head>
<body>
	<h1>장바구니 목록</h1>
	<table border="1">
		<tr>
			<th>상품명</th>
			<th>가격</th>
			<th>이미지</th>
		</tr>
		<c:forEach var="item" items="${item}">
			<c:if test="${item.startsWith('cart-')}">
				<c:set var="itemName" value="${item.itemName}" />
				<c:set var="price" value="${item.price}" />
				<c:set var="pictureUrl" value="${item.pictureUrl}" />
				<tr>
					<td>${itemName}</td>
					<td>${price}</td>
					<td><img src="${pictureUrl}" width="100"></td>
				</tr>
			</c:if>
		</c:forEach>
	</table>
	<br>
	<a href="itemList.do">상품 목록으로 돌아가기</a>
	<a href="itemList.do">쇼핑 계속하기</a>
</body>
</html>
