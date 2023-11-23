<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Orders List</title>
</head>
<body>
<center>
<h1>Orders List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID2(PK)</td>
		<td>ID</td>
		<td>ShipFee</td>
		<td>PaymentDetail</td>
		<td>CartFee</td>
		<td>Status</td>
		<td>Customer(FK)</td>
		<td>Shipment(FK)</td>
		<td>Payment(FK)</td>
		<td></td>
	</tr>
<%
Orders[] orderss = OrdersDAO.listOrdersByQuery(null, null);
for(int i = 0; i < orderss.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(orderss[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(orderss[i].getID());
		out.println("</td>");
		out.print("<td>");
		out.print(orderss[i].getShipFee());
		out.println("</td>");
		out.print("<td>");
		out.print(orderss[i].getPaymentDetail());
		out.println("</td>");
		out.print("<td>");
		out.print(orderss[i].getCartFee());
		out.println("</td>");
		out.print("<td>");
		out.print(orderss[i].getStatus());
		out.println("</td>");
		
		Customer customer = orderss[i].getCustomer();
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
		
		
		Shipment shipment = orderss[i].getShipment();
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
		
		
		Payment payment = orderss[i].getPayment();
		if(payment != null) {
			out.print("<td>");
			out.print("<a href=\"Payment.jsp?action=search&ID=");
			out.print(payment.getORMID());
			out.print("\">");
			out.print(payment.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Orders.jsp?action=search&ID2=");
		out.print(orderss[i].getORMID());
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
<a href="Orders.jsp">Add Orders</a>
</center>
</body>
</html>
