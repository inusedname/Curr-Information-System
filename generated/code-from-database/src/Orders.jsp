<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="OrdersBean" scope="page" class="OrdersProcessor" />
<jsp:setProperty name="OrdersBean" property="*" />
<% String result = OrdersBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'OrdersList.jsp';
		return true;
	}
// -->
</script>
<head><title>Orders</title>
</head>
<body>
<h1>Orders</h1>
<form method="POST" name="form1" action=Orders.jsp>
	<table>
		<tr>
			<td>*ID2 : </td>
			<td><input type=text name="ID2" value="<jsp:getProperty name="OrdersBean" property="ID2"/>" /></td>
		</tr>
		<tr>
			<td>ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="OrdersBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>ShipFee : </td>
			<td><input type=text name="shipFee" value="<jsp:getProperty name="OrdersBean" property="shipFee"/>" /></td>
		</tr>
		<tr>
			<td>PaymentDetail : </td>
			<td><input type=text name="paymentDetail" value="<jsp:getProperty name="OrdersBean" property="paymentDetail"/>" /></td>
		</tr>
		<tr>
			<td>CartFee : </td>
			<td><input type=text name="cartFee" value="<jsp:getProperty name="OrdersBean" property="cartFee"/>" /></td>
		</tr>
		<tr>
			<td>Status : </td>
			<td><input type=text name="status" value="<jsp:getProperty name="OrdersBean" property="status"/>" /></td>
		</tr>
		<tr>
			<td>Customer_customerID : </td>
			<td><input type=text name="customer_customerID" value="<jsp:getProperty name="OrdersBean" property="customer_customerID"/>" /></td>
		</tr>
		<tr>
			<td>Shipment_shipmentID : </td>
			<td><input type=text name="shipment_shipmentID" value="<jsp:getProperty name="OrdersBean" property="shipment_shipmentID"/>" /></td>
		</tr>
		<tr>
			<td>Payment_paymentID : </td>
			<td><input type=text name="payment_paymentID" value="<jsp:getProperty name="OrdersBean" property="payment_paymentID"/>" /></td>
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
