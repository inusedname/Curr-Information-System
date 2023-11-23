<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="CartEntryBean" scope="page" class="CartEntryProcessor" />
<jsp:setProperty name="CartEntryBean" property="*" />
<% String result = CartEntryBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'CartEntryList.jsp';
		return true;
	}
// -->
</script>
<head><title>CartEntry</title>
</head>
<body>
<h1>CartEntry</h1>
<form method="POST" name="form1" action=CartEntry.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="CartEntryBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Quantity : </td>
			<td><input type=text name="quantity" value="<jsp:getProperty name="CartEntryBean" property="quantity"/>" /></td>
		</tr>
		<tr>
			<td>Product_productID : </td>
			<td><input type=text name="product_productID" value="<jsp:getProperty name="CartEntryBean" property="product_productID"/>" /></td>
		</tr>
		<tr>
			<td>Cart_cartID : </td>
			<td><input type=text name="cart_cartID" value="<jsp:getProperty name="CartEntryBean" property="cart_cartID"/>" /></td>
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
