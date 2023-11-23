<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>OrderAddress List</title>
</head>
<body>
<center>
<h1>OrderAddress List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>City</td>
		<td>Detail</td>
		<td>Phone</td>
		<td>Shipment(FK)</td>
		<td></td>
	</tr>
<%
OrderAddress[] orderAddresss = OrderAddressDAO.listOrderAddressByQuery(null, null);
for(int i = 0; i < orderAddresss.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(orderAddresss[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(orderAddresss[i].getCity());
		out.println("</td>");
		out.print("<td>");
		out.print(orderAddresss[i].getDetail());
		out.println("</td>");
		out.print("<td>");
		out.print(orderAddresss[i].getPhone());
		out.println("</td>");
		
		Shipment shipment = orderAddresss[i].getShipment();
		if(shipment != null) {
			out.print("<td>");
			out.print("<a href=\"Shipment.jsp?action=search&ID=");
			out.print(shipment.getORMID());
			out.print("\">");
			out.print(shipment.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"OrderAddress.jsp?action=search&ID=");
		out.print(orderAddresss[i].getORMID());
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
<a href="OrderAddress.jsp">Add OrderAddress</a>
</center>
</body>
</html>
