<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>OrderEntry List</title>
</head>
<body>
<center>
<h1>OrderEntry List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID2(PK)</td>
		<td>Quantity</td>
		<td>ID</td>
		<td>Orders(FK)</td>
		<td>Product(FK)</td>
		<td></td>
	</tr>
<%
OrderEntry[] orderEntrys = OrderEntryDAO.listOrderEntryByQuery(null, null);
for(int i = 0; i < orderEntrys.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(orderEntrys[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(orderEntrys[i].getQuantity());
		out.println("</td>");
		out.print("<td>");
		out.print(orderEntrys[i].getID());
		out.println("</td>");
		
		Orders orders = orderEntrys[i].getOrders();
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
		
		
		Product product = orderEntrys[i].getProduct();
		if(product != null) {
			out.print("<td>");
			out.print("<a href=\"Product.jsp?action=search&ID=");
			out.print(product.getORMID());
			out.print("\">");
			out.print(product.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"OrderEntry.jsp?action=search&ID2=");
		out.print(orderEntrys[i].getORMID());
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
<a href="OrderEntry.jsp">Add OrderEntry</a>
</center>
</body>
</html>
