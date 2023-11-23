<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Authors List</title>
</head>
<body>
<center>
<h1>Authors List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Name</td>
		<td></td>
	</tr>
<%
Authors[] authorss = AuthorsDAO.listAuthorsByQuery(null, null);
for(int i = 0; i < authorss.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(authorss[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(authorss[i].getName());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Authors.jsp?action=search&ID=");
		out.print(authorss[i].getORMID());
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
<a href="Authors.jsp">Add Authors</a>
</center>
</body>
</html>
