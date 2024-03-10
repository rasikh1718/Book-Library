<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update book price </title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">
<br><br>
<h2 class="display-4">Seatch On Genre</h2>
<hr>
<form action="GenreSearch" method="post">
<table>
    <tr>
        <td>Genre</td>
        <td><input type="text" name="genre" required autocomplete="off" class="form-control"></td>
    </tr>
    <tr>
        <td><input type="submit" value="Search" class="btn btn-primary"></td>
        <td></td>
    </tr>
</table>

</form>

</div>
</body>
</html>