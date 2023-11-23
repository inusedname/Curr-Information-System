<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Account List</title>
</head>
<body>
<center>
<h1>Account List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Email</td>
		<td>Username</td>
		<td>Password</td>
		<td>Create</td>
		<td></td>
	</tr>
<%
Account[] accounts = AccountDAO.listAccountByQuery(null, null);
for(int i = 0; i < accounts.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(accounts[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(accounts[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print(accounts[i].getUsername());
		out.println("</td>");
		out.print("<td>");
		out.print(accounts[i].getPassword());
		out.println("</td>");
		out.print("<td>");
		out.print(accounts[i].getCreate());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Account.jsp?action=search&ID=");
		out.print(accounts[i].getORMID());
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
<a href="Account.jsp">Add Account</a>
</center>
</body>
</html>
