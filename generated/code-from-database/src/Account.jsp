<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="AccountBean" scope="page" class="AccountProcessor" />
<jsp:setProperty name="AccountBean" property="*" />
<% String result = AccountBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'AccountList.jsp';
		return true;
	}
// -->
</script>
<head><title>Account</title>
</head>
<body>
<h1>Account</h1>
<form method="POST" name="form1" action=Account.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="AccountBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><input type=text name="email" value="<jsp:getProperty name="AccountBean" property="email"/>" /></td>
		</tr>
		<tr>
			<td>Username : </td>
			<td><input type=text name="username" value="<jsp:getProperty name="AccountBean" property="username"/>" /></td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type=text name="password" value="<jsp:getProperty name="AccountBean" property="password"/>" /></td>
		</tr>
		<tr>
			<td>Create : </td>
			<td><input type=text name="create" value="<jsp:getProperty name="AccountBean" property="create"/>" /></td>
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
