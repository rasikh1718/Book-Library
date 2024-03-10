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
    <h2 class="display-4">All Book between range </h2>
    <hr>
    <table class="table table-bordered table-hover">
        <tr>
            <th>BookId</th>
            <th>ISBN</th>
            <th>Title</th>
            <th>Author</th>
            <th>Publisher</th>
            <th>Publication-year</th>
            <th>Genre</th>
            <th>Description</th>
            <th>Pages</th>
            <th>Price</th>
            <th>Language</th>
            
        </tr>
        
        <c:forEach items="${listobj}" var="book">
        <tr>
           <td>${book.bookid}</td>
           <td>${book.isbn}</td>
           <td>${book.title}</td>
           <td>${book.author}</td>
           <td>${book.publisher}</td>
           <td>${book.publicationYear}</td>
           <td>${book.genre}</td>
           <td>${book.description}</td>
           <td>${book.pages}</td>
           <td>${book.price}</td>
           <td>${book.language}</td>
        </tr>
        
        </c:forEach>
<br>
<a href="index.jsp">Home</a>
</div>
</body>
</html>