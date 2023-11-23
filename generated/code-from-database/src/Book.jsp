<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="BookBean" scope="page" class="BookProcessor" />
<jsp:setProperty name="BookBean" property="*" />
<% String result = BookBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'BookList.jsp';
		return true;
	}
// -->
</script>
<head><title>Book</title>
</head>
<body>
<h1>Book</h1>
<form method="POST" name="form1" action=Book.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="BookBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>PublisherName : </td>
			<td><input type=text name="publisherName" value="<jsp:getProperty name="BookBean" property="publisherName"/>" /></td>
		</tr>
		<tr>
			<td>Pages : </td>
			<td><input type=text name="pages" value="<jsp:getProperty name="BookBean" property="pages"/>" /></td>
		</tr>
		<tr>
			<td>FirstRelease : </td>
			<td><input type=text name="firstRelease" value="<jsp:getProperty name="BookBean" property="firstRelease"/>" /></td>
		</tr>
		<tr>
			<td>Price : </td>
			<td><input type=text name="price" value="<jsp:getProperty name="BookBean" property="price"/>" /></td>
		</tr>
		<tr>
			<td>Bookcategory_bookCategoryID : </td>
			<td><input type=text name="bookcategory_bookCategoryID" value="<jsp:getProperty name="BookBean" property="bookcategory_bookCategoryID"/>" /></td>
		</tr>
		<tr>
			<td>Authors_authorsID : </td>
			<td><input type=text name="authors_authorsID" value="<jsp:getProperty name="BookBean" property="authors_authorsID"/>" /></td>
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
