<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Product List</title>
</head>
<body>
<center>
<h1>Product List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Price</td>
		<td></td>
	</tr>
<%
Product[] products = ProductDAO.listProductByQuery(null, null);
for(int i = 0; i < products.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(products[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(products[i].getPrice());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Product.jsp?action=search&ID=");
		out.print(products[i].getORMID());
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
<a href="Product.jsp">Add Product</a>
</center>
</body>
</html>
