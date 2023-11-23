<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>ClothBrand List</title>
</head>
<body>
<center>
<h1>ClothBrand List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Name</td>
		<td>Cloth(FK)</td>
		<td></td>
	</tr>
<%
ClothBrand[] clothBrands = ClothBrandDAO.listClothBrandByQuery(null, null);
for(int i = 0; i < clothBrands.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(clothBrands[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(clothBrands[i].getName());
		out.println("</td>");
		
		Cloth cloth = clothBrands[i].getCloth();
		if(cloth != null) {
			out.print("<td>");
			out.print("<a href=\"Cloth.jsp?action=search&ID=");
			out.print(cloth.getORMID());
			out.print("\">");
			out.print(cloth.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"ClothBrand.jsp?action=search&ID=");
		out.print(clothBrands[i].getORMID());
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
<a href="ClothBrand.jsp">Add ClothBrand</a>
</center>
</body>
</html>
