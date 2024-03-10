<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book-Library</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
  
</head>
<body>
    <div class="container">
        <br><br>
        <h2 class="display-4">Home Page</h2>
        <hr>
        <a href="allbooks"> <i class="bi bi-book"></i> All Books </a>
        <br><br>
        <a href="addbook">Add new book to Book-Library</a>
        <br><br>
        <a href="updatebookprice">Update book price</a>
        <br><br>
        <a href="delete">Delete book from Book-Library</a>
        <br><br>
        <a href="SearchonGenre">search Book on basis of Genre</a>
        <br><br>
        <a href="PriceRange">search Book on basis of Price range</a>
        <br><br>
        <a href="addmember">Add new Member to Library</a>
        <br><br>
        <a href="Searchmember">Search member</a>
        <br><br>
        <a href="SearchmemberByYear"> Search Member by joinYear</a>
    



        <br><br>
         <form name="frm" method="post" action="searchauthor">
         Auther Name :<input type="text" name="author" required class="form-control" >
         <br>
         <input type="submit" value="Search" class="btn btn-primary">
         </form>
    </div>
</body>
</html>