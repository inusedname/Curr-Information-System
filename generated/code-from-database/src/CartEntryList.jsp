<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>CartEntry List</title>
</head>
<body>
<center>
<h1>CartEntry List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Quantity</td>
		<td>Product(FK)</td>
		<td>Cart(FK)</td>
		<td></td>
	</tr>
<%
CartEntry[] cartEntrys = CartEntryDAO.listCartEntryByQuery(null, null);
for(int i = 0; i < cartEntrys.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(cartEntrys[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(cartEntrys[i].getQuantity());
		out.println("</td>");
		
		Product product = cartEntrys[i].getProduct();
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
		
		
		Cart cart = cartEntrys[i].getCart();
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
		out.print("<a href=\"CartEntry.jsp?action=search&ID=");
		out.print(cartEntrys[i].getORMID());
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
<a href="CartEntry.jsp">Add CartEntry</a>
</center>
</body>
</html>
