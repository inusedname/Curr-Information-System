<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Customer List</title>
</head>
<body>
<center>
<h1>Customer List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Name</td>
		<td>Phone</td>
		<td>Email</td>
		<td>Username</td>
		<td>Password</td>
		<td>Create</td>
		<td>Cart(FK)</td>
		<td></td>
	</tr>
<%
Customer[] customers = CustomerDAO.listCustomerByQuery(null, null);
for(int i = 0; i < customers.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(customers[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(customers[i].getName());
		out.println("</td>");
		out.print("<td>");
		out.print(customers[i].getPhone());
		out.println("</td>");
		out.print("<td>");
		out.print(customers[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print(customers[i].getUsername());
		out.println("</td>");
		out.print("<td>");
		out.print(customers[i].getPassword());
		out.println("</td>");
		out.print("<td>");
		out.print(customers[i].getCreate());
		out.println("</td>");
		
		Cart cart = customers[i].getCart();
		if(cart != null) {
			out.print("<td>");
			out.print("<a href=\"Cart.jsp?action=search&ID=");
			out.print(cart.getORMID());
			out.print("\">");
			out.print(cart.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Customer.jsp?action=search&ID=");
		out.print(customers[i].getORMID());
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
<a href="Customer.jsp">Add Customer</a>
</center>
</body>
</html>
