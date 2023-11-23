<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Cloth List</title>
</head>
<body>
<center>
<h1>Cloth List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Size</td>
		<td>Color</td>
		<td>Price</td>
		<td>Brand(FK)</td>
		<td>Category(FK)</td>
		<td></td>
	</tr>
<%
Cloth[] cloths = ClothDAO.listClothByQuery(null, null);
for(int i = 0; i < cloths.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(cloths[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(cloths[i].getSize());
		out.println("</td>");
		out.print("<td>");
		out.print(cloths[i].getColor());
		out.println("</td>");
		out.print("<td>");
		out.print(cloths[i].getPrice());
		out.println("</td>");
		
		ClothBrand brand = cloths[i].getBrand();
		if(brand != null) {
			out.print("<td>");
			out.print("<a href=\"ClothBrand.jsp?action=search&ID=");
			out.print(brand.getORMID());
			out.print("\">");
			out.print(brand.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ClothCategory category = cloths[i].getCategory();
		if(category != null) {
			out.print("<td>");
			out.print("<a href=\"ClothCategory.jsp?action=search&ID=");
			out.print(category.getORMID());
			out.print("\">");
			out.print(category.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Cloth.jsp?action=search&ID=");
		out.print(cloths[i].getORMID());
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
<a href="Cloth.jsp">Add Cloth</a>
</center>
</body>
</html>
