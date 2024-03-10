<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new member</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <br><br>
        <h2 class="display-4">New Member Detail</h2>
        <hr>
        <form action="addmemberlib" method="post">
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" required autocomplete="off" class="form-control"></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td><input type="text" name="gender" required autocomplete="off" class="form-control"></td>
                </tr>
                <tr>
                    <td>age</td>
                    <td><input type="number" name="age" required autocomplete="off" class="form-control"></td>
                </tr>
                <tr>
                    <td>Mobile</td>
                    <td><input type="text" name="mobile" required autocomplete="off" class="form-control"></td>
                </tr>
                <tr>
                    <td>Join Year</td>
                    <td><input type="number" name="joinYear" required autocomplete="off" class="form-control"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit" class="btn btn-primary"></td>
                    <td></td>
                </tr>
            </table>
        </form>

    </div>

</body>
</html>