<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>PaymentCOD List</title>
</head>
<body>
<center>
<h1>PaymentCOD List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>ShipFee</td>
		<td>ProductFee</td>
		<td>Status</td>
		<td>Orders(FK)</td>
		<td></td>
	</tr>
<%
PaymentCOD[] paymentCODs = PaymentCODDAO.listPaymentCODByQuery(null, null);
for(int i = 0; i < paymentCODs.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(paymentCODs[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(paymentCODs[i].getShipFee());
		out.println("</td>");
		out.print("<td>");
		out.print(paymentCODs[i].getProductFee());
		out.println("</td>");
		out.print("<td>");
		out.print(paymentCODs[i].getStatus());
		out.println("</td>");
		
		Orders orders = paymentCODs[i].getOrders();
		if(orders != null) {
			out.print("<td>");
			out.print("<a href=\"Orders.jsp?action=search&ID2=");
			out.print(orders.getORMID());
			out.print("\">");
			out.print(orders.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"PaymentCOD.jsp?action=search&ID=");
		out.print(paymentCODs[i].getORMID());
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
<a href="PaymentCOD.jsp">Add PaymentCOD</a>
</center>
</body>
</html>
