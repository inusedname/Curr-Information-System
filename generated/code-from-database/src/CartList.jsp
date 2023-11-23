<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Cart List</title>
</head>
<body>
<center>
<h1>Cart List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Customer(FK)</td>
		<td></td>
	</tr>
<%
Cart[] carts = CartDAO.listCartByQuery(null, null);
for(int i = 0; i < carts.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(carts[i].getORMID());
		out.print("</td>");
		
		Customer customer = carts[i].getCustomer();
		if(customer != null) {
			out.print("<td>");
			out.print("<a href=\"Customer.jsp?action=search&ID=");
			out.print(customer.getORMID());
			out.print("\">");
			out.print(customer.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Cart.jsp?action=search&ID=");
		out.print(carts[i].getORMID());
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
<a href="Cart.jsp">Add Cart</a>
</center>
</body>
</html>
