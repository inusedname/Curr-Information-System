<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="ShipmentBean" scope="page" class="ShipmentProcessor" />
<jsp:setProperty name="ShipmentBean" property="*" />
<% String result = ShipmentBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ShipmentList.jsp';
		return true;
	}
// -->
</script>
<head><title>Shipment</title>
</head>
<body>
<h1>Shipment</h1>
<form method="POST" name="form1" action=Shipment.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="ShipmentBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>IsRabbit : </td>
			<td><input type=text name="isRabbit" value="<jsp:getProperty name="ShipmentBean" property="isRabbit"/>" /></td>
		</tr>
		<tr>
			<td>Status : </td>
			<td><input type=text name="status" value="<jsp:getProperty name="ShipmentBean" property="status"/>" /></td>
		</tr>
		<tr>
			<td>Order_ordersID2 : </td>
			<td><input type=text name="order_ordersID2" value="<jsp:getProperty name="ShipmentBean" property="order_ordersID2"/>" /></td>
		</tr>
		<tr>
			<td>OrderAddress_orderAddressID : </td>
			<td><input type=text name="orderAddress_orderAddressID" value="<jsp:getProperty name="ShipmentBean" property="orderAddress_orderAddressID"/>" /></td>
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
