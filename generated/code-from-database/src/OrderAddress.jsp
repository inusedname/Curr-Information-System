<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="OrderAddressBean" scope="page" class="OrderAddressProcessor" />
<jsp:setProperty name="OrderAddressBean" property="*" />
<% String result = OrderAddressBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'OrderAddressList.jsp';
		return true;
	}
// -->
</script>
<head><title>OrderAddress</title>
</head>
<body>
<h1>OrderAddress</h1>
<form method="POST" name="form1" action=OrderAddress.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="OrderAddressBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>City : </td>
			<td><input type=text name="city" value="<jsp:getProperty name="OrderAddressBean" property="city"/>" /></td>
		</tr>
		<tr>
			<td>Detail : </td>
			<td><input type=text name="detail" value="<jsp:getProperty name="OrderAddressBean" property="detail"/>" /></td>
		</tr>
		<tr>
			<td>Phone : </td>
			<td><input type=text name="phone" value="<jsp:getProperty name="OrderAddressBean" property="phone"/>" /></td>
		</tr>
		<tr>
			<td>Shipment_shipmentID : </td>
			<td><input type=text name="shipment_shipmentID" value="<jsp:getProperty name="OrderAddressBean" property="shipment_shipmentID"/>" /></td>
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
