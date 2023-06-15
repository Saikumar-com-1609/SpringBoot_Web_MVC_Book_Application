<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Book Details</h1>
<form action = "book">

Book Id: <input type = "text" name = "id"/><br/>
         <input type = "submit" value = "search"/>
 </form>
<hr/>
Book Id: ${msg.bookId} <br/>
Book Name: ${msg.bookName}<br/>
Book Price: ${msg.bookPrice}<br/>

</body>
</html>