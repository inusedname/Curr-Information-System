<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>MobilePhone List</title>
</head>
<body>
<center>
<h1>MobilePhone List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>HardwareSpecs</td>
		<td>Ram</td>
		<td>Cpu</td>
		<td>Memory</td>
		<td>Price</td>
		<td>Brand(FK)</td>
		<td></td>
	</tr>
<%
MobilePhone[] mobilePhones = MobilePhoneDAO.listMobilePhoneByQuery(null, null);
for(int i = 0; i < mobilePhones.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(mobilePhones[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(mobilePhones[i].getHardwareSpecs());
		out.println("</td>");
		out.print("<td>");
		out.print(mobilePhones[i].getRam());
		out.println("</td>");
		out.print("<td>");
		out.print(mobilePhones[i].getCpu());
		out.println("</td>");
		out.print("<td>");
		out.print(mobilePhones[i].getMemory());
		out.println("</td>");
		out.print("<td>");
		out.print(mobilePhones[i].getPrice());
		out.println("</td>");
		
		MobilePhoneBrand brand = mobilePhones[i].getBrand();
		if(brand != null) {
			out.print("<td>");
			out.print("<a href=\"MobilePhoneBrand.jsp?action=search&ID=");
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
		
		out.print("<td>");
		out.print("<a href=\"MobilePhone.jsp?action=search&ID=");
		out.print(mobilePhones[i].getORMID());
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
<a href="MobilePhone.jsp">Add MobilePhone</a>
</center>
</body>
</html>
