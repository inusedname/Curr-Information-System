<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Payment List</title>
</head>
<body>
<center>
<h1>Payment List</h1>
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
Payment[] payments = PaymentDAO.listPaymentByQuery(null, null);
for(int i = 0; i < payments.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(payments[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(payments[i].getShipFee());
		out.println("</td>");
		out.print("<td>");
		out.print(payments[i].getProductFee());
		out.println("</td>");
		out.print("<td>");
		out.print(payments[i].getStatus());
		out.println("</td>");
		
		Orders orders = payments[i].getOrders();
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
		out.print("<a href=\"Payment.jsp?action=search&ID=");
		out.print(payments[i].getORMID());
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
<a href="Payment.jsp">Add Payment</a>
</center>
</body>
</html>
