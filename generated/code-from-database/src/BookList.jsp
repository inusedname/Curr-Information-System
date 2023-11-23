<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Book List</title>
</head>
<body>
<center>
<h1>Book List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>PublisherName</td>
		<td>Pages</td>
		<td>FirstRelease</td>
		<td>Price</td>
		<td>Bookcategory(FK)</td>
		<td>Authors(FK)</td>
		<td></td>
	</tr>
<%
Book[] books = BookDAO.listBookByQuery(null, null);
for(int i = 0; i < books.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(books[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(books[i].getPublisherName());
		out.println("</td>");
		out.print("<td>");
		out.print(books[i].getPages());
		out.println("</td>");
		out.print("<td>");
		out.print(books[i].getFirstRelease());
		out.println("</td>");
		out.print("<td>");
		out.print(books[i].getPrice());
		out.println("</td>");
		
		BookCategory bookcategory = books[i].getBookcategory();
		if(bookcategory != null) {
			out.print("<td>");
			out.print("<a href=\"BookCategory.jsp?action=search&ID=");
			out.print(bookcategory.getORMID());
			out.print("\">");
			out.print(bookcategory.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		Authors authors = books[i].getAuthors();
		if(authors != null) {
			out.print("<td>");
			out.print("<a href=\"Authors.jsp?action=search&ID=");
			out.print(authors.getORMID());
			out.print("\">");
			out.print(authors.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Book.jsp?action=search&ID=");
		out.print(books[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Book.jsp">Add Book</a>
</center>
</body>
</html>
