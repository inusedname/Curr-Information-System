<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="ClothBean" scope="page" class="ClothProcessor" />
<jsp:setProperty name="ClothBean" property="*" />
<% String result = ClothBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ClothList.jsp';
		return true;
	}
// -->
</script>
<head><title>Cloth</title>
</head>
<body>
<h1>Cloth</h1>
<form method="POST" name="form1" action=Cloth.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="ClothBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Size : </td>
			<td><input type=text name="size" value="<jsp:getProperty name="ClothBean" property="size"/>" /></td>
		</tr>
		<tr>
			<td>Color : </td>
			<td><input type=text name="color" value="<jsp:getProperty name="ClothBean" property="color"/>" /></td>
		</tr>
		<tr>
			<td>Price : </td>
			<td><input type=text name="price" value="<jsp:getProperty name="ClothBean" property="price"/>" /></td>
		</tr>
		<tr>
			<td>Brand_clothBrandID : </td>
			<td><input type=text name="brand_clothBrandID" value="<jsp:getProperty name="ClothBean" property="brand_clothBrandID"/>" /></td>
		</tr>
		<tr>
			<td>Category_clothCategoryID : </td>
			<td><input type=text name="category_clothCategoryID" value="<jsp:getProperty name="ClothBean" property="category_clothCategoryID"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>
