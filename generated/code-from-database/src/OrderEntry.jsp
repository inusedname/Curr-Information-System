<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="OrderEntryBean" scope="page" class="OrderEntryProcessor" />
<jsp:setProperty name="OrderEntryBean" property="*" />
<% String result = OrderEntryBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'OrderEntryList.jsp';
		return true;
	}
// -->
</script>
<head><title>OrderEntry</title>
</head>
<body>
<h1>OrderEntry</h1>
<form method="POST" name="form1" action=OrderEntry.jsp>
	<table>
		<tr>
			<td>*ID2 : </td>
			<td><input type=text name="ID2" value="<jsp:getProperty name="OrderEntryBean" property="ID2"/>" /></td>
		</tr>
		<tr>
			<td>Quantity : </td>
			<td><input type=text name="quantity" value="<jsp:getProperty name="OrderEntryBean" property="quantity"/>" /></td>
		</tr>
		<tr>
			<td>ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="OrderEntryBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Orders_ordersID2 : </td>
			<td><input type=text name="orders_ordersID2" value="<jsp:getProperty name="OrderEntryBean" property="orders_ordersID2"/>" /></td>
		</tr>
		<tr>
			<td>Product_productID : </td>
			<td><input type=text name="product_productID" value="<jsp:getProperty name="OrderEntryBean" property="product_productID"/>" /></td>
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