<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <h1>회원 정보 조회(회원 번호 검색)</h1>
    <div class="container">
        <form action="search" method="post"> 
            <input type="text" name="user_No" required>
            <button type="submit">조회</button>
        </form>
    </div>
</body>
</html>