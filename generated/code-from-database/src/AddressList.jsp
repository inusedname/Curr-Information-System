<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Address List</title>
</head>
<body>
<center>
<h1>Address List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>City</td>
		<td>Detail</td>
		<td>Phone</td>
		<td>Customer(FK)</td>
		<td></td>
	</tr>
<%
Address[] addresss = AddressDAO.listAddressByQuery(null, null);
for(int i = 0; i < addresss.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(addresss[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(addresss[i].getCity());
		out.println("</td>");
		out.print("<td>");
		out.print(addresss[i].getDetail());
		out.println("</td>");
		out.print("<td>");
		out.print(addresss[i].getPhone());
		out.println("</td>");
		
		Customer customer = addresss[i].getCustomer();
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
		out.print("<a href=\"Address.jsp?action=search&ID=");
		out.print(addresss[i].getORMID());
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
<a href="Address.jsp">Add Address</a>
</center>
</body>
</html>
