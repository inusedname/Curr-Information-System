<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>MobilePhoneBrand List</title>
</head>
<body>
<center>
<h1>MobilePhoneBrand List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Name</td>
		<td>Phone(FK)</td>
		<td></td>
	</tr>
<%
MobilePhoneBrand[] mobilePhoneBrands = MobilePhoneBrandDAO.listMobilePhoneBrandByQuery(null, null);
for(int i = 0; i < mobilePhoneBrands.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(mobilePhoneBrands[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(mobilePhoneBrands[i].getName());
		out.println("</td>");
		
		MobilePhone phone = mobilePhoneBrands[i].getPhone();
		if(phone != null) {
			out.print("<td>");
			out.print("<a href=\"MobilePhone.jsp?action=search&ID=");
			out.print(phone.getORMID());
			out.print("\">");
			out.print(phone.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"MobilePhoneBrand.jsp?action=search&ID=");
		out.print(mobilePhoneBrands[i].getORMID());
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
<a href="MobilePhoneBrand.jsp">Add MobilePhoneBrand</a>
</center>
</body>
</html>
