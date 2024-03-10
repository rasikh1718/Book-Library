<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update book price </title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">
<br><br>
<h2 class="display-4">Update book price</h2>
<hr>
<form action="priceamount" method="post">
<table>
    <tr>
        <td>Book Id</td>
        <td><input type="number" name="bookid" required autocomplete="off" class="form-control"></td>
    </tr>
    <tr>
        <td>Amount</td>
        <td><input type="number" name="amount" required autocomplete="off" class="form-control"></td>
    </tr>
    <tr>
        <td><input type="submit" value="Update" class="btn btn-primary"><i class="bi bi-book"></i></td>
        <td></td>
    </tr>
</table>

</form>

</div>
</body>
</html>