<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="MobilePhoneBean" scope="page" class="MobilePhoneProcessor" />
<jsp:setProperty name="MobilePhoneBean" property="*" />
<% String result = MobilePhoneBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'MobilePhoneList.jsp';
		return true;
	}
// -->
</script>
<head><title>MobilePhone</title>
</head>
<body>
<h1>MobilePhone</h1>
<form method="POST" name="form1" action=MobilePhone.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="MobilePhoneBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>HardwareSpecs : </td>
			<td><input type=text name="hardwareSpecs" value="<jsp:getProperty name="MobilePhoneBean" property="hardwareSpecs"/>" /></td>
		</tr>
		<tr>
			<td>Ram : </td>
			<td><input type=text name="ram" value="<jsp:getProperty name="MobilePhoneBean" property="ram"/>" /></td>
		</tr>
		<tr>
			<td>Cpu : </td>
			<td><input type=text name="cpu" value="<jsp:getProperty name="MobilePhoneBean" property="cpu"/>" /></td>
		</tr>
		<tr>
			<td>Memory : </td>
			<td><input type=text name="memory" value="<jsp:getProperty name="MobilePhoneBean" property="memory"/>" /></td>
		</tr>
		<tr>
			<td>Price : </td>
			<td><input type=text name="price" value="<jsp:getProperty name="MobilePhoneBean" property="price"/>" /></td>
		</tr>
		<tr>
			<td>Brand_mobilePhoneBrandID : </td>
			<td><input type=text name="brand_mobilePhoneBrandID" value="<jsp:getProperty name="MobilePhoneBean" property="brand_mobilePhoneBrandID"/>" /></td>
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
