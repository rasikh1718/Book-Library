<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>


<div class="container">
    <br><br>
    <h2 class="display-4">All Book by Name ${book.name}</h2>
    <hr>
    <table class="table table-bordered table-hover">
        <tr>
            <th>MemberId</th>
            <th>name</th>
            <th>gender</th>
            <th>age</th>
            <th>Mobile</th>
            <th>joinYear</th>
        </tr>
        
        <c:forEach items="${lstbyYr}" var="member">
        <tr>
           <td>${member.memberid}</td>
           <td>${member.name}</td>
           <td>${member.gender}</td>
           <td>${member.age}</td>
           <td>${member.joinYear}</td>
         
        </tr>
        
        </c:forEach>
<br>
<a href="index.jsp">Home</a>
</div>
</body>
</html>