<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="PaymentBean" scope="page" class="PaymentProcessor" />
<jsp:setProperty name="PaymentBean" property="*" />
<% String result = PaymentBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'PaymentList.jsp';
		return true;
	}
// -->
</script>
<head><title>Payment</title>
</head>
<body>
<h1>Payment</h1>
<form method="POST" name="form1" action=Payment.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="PaymentBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>ShipFee : </td>
			<td><input type=text name="shipFee" value="<jsp:getProperty name="PaymentBean" property="shipFee"/>" /></td>
		</tr>
		<tr>
			<td>ProductFee : </td>
			<td><input type=text name="productFee" value="<jsp:getProperty name="PaymentBean" property="productFee"/>" /></td>
		</tr>
		<tr>
			<td>Status : </td>
			<td><input type=text name="status" value="<jsp:getProperty name="PaymentBean" property="status"/>" /></td>
		</tr>
		<tr>
			<td>Orders_ordersID2 : </td>
			<td><input type=text name="orders_ordersID2" value="<jsp:getProperty name="PaymentBean" property="orders_ordersID2"/>" /></td>
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
