<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <h1>회원 정보 조회 결과</h1>

    <%
    	int user_No = (int) request.getAttribute("user_No");
        String user_Id = (String) request.getAttribute("user_Id");
        String user_Name = (String) request.getAttribute("user_Name");
        int user_Age = (int) request.getAttribute("user_Age");
    %>

    <%
        UserDTO dto = (UserDTO) request.getAttribute("dto");
    %>
    
    <table border="1">
        <tr>
            <th>회원번호</th>
            <th>회원아이디</th>
            <th>회원이름</th>
            <th>회원나이</th>
        </tr>
        <tr>
            <td><%= dto.getUser_No %></td>
            <td><%= dto.getUser_Id %></td>
            <td><%= dto.getUser_Name %></td>
            <td><%= dto.getUser_Age %></td>
        </tr>
    </table>

    <a href="index.jsp">메인페이지로 돌아가기</a>
</body>
</html>