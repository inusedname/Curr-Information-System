<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Shipment List</title>
</head>
<body>
<center>
<h1>Shipment List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>IsRabbit</td>
		<td>Status</td>
		<td>Order(FK)</td>
		<td>OrderAddress(FK)</td>
		<td></td>
	</tr>
<%
Shipment[] shipments = ShipmentDAO.listShipmentByQuery(null, null);
for(int i = 0; i < shipments.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(shipments[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(shipments[i].getIsRabbit());
		out.println("</td>");
		out.print("<td>");
		out.print(shipments[i].getStatus());
		out.println("</td>");
		
		Orders order = shipments[i].getOrder();
		if(order != null) {
			out.print("<td>");
			out.print("<a href=\"Orders.jsp?action=search&ID2=");
			out.print(order.getORMID());
			out.print("\">");
			out.print(order.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		OrderAddress orderAddress = shipments[i].getOrderAddress();
		if(orderAddress != null) {
			out.print("<td>");
			out.print("<a href=\"OrderAddress.jsp?action=search&ID=");
			out.print(orderAddress.getORMID());
			out.print("\">");
			out.print(orderAddress.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Shipment.jsp?action=search&ID=");
		out.print(shipments[i].getORMID());
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
<a href="Shipment.jsp">Add Shipment</a>
</center>
</body>
</html>
