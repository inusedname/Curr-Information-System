<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>BookCategory List</title>
</head>
<body>
<center>
<h1>BookCategory List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Name</td>
		<td></td>
	</tr>
<%
BookCategory[] bookCategorys = BookCategoryDAO.listBookCategoryByQuery(null, null);
for(int i = 0; i < bookCategorys.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(bookCategorys[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(bookCategorys[i].getName());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"BookCategory.jsp?action=search&ID=");
		out.print(bookCategorys[i].getORMID());
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
<a href="BookCategory.jsp">Add BookCategory</a>
</center>
</body>
</html>
