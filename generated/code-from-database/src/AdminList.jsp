<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Admin List</title>
</head>
<body>
<center>
<h1>Admin List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>LastLogin</td>
		<td>Email</td>
		<td>Username</td>
		<td>Password</td>
		<td>Create</td>
		<td></td>
	</tr>
<%
Admin[] admins = AdminDAO.listAdminByQuery(null, null);
for(int i = 0; i < admins.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(admins[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(admins[i].getLastLogin());
		out.println("</td>");
		out.print("<td>");
		out.print(admins[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print(admins[i].getUsername());
		out.println("</td>");
		out.print("<td>");
		out.print(admins[i].getPassword());
		out.println("</td>");
		out.print("<td>");
		out.print(admins[i].getCreate());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Admin.jsp?action=search&ID=");
		out.print(admins[i].getORMID());
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
<a href="Admin.jsp">Add Admin</a>
</center>
</body>
</html>
