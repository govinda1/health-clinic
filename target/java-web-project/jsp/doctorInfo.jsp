<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor Details</title>
</head>
<body>

	<form:form id="docForm" modelAttribute="doctor" action="saveDoctor"
		method="post">
		<table align="center">
		    <tr>
				<td><form:label path="doc_id">ID</form:label></td>
				<td><form:input path="doc_id" name="doc_id" id="doc_id" />
				</td>
			</tr>
			<tr>
			<tr>
				<td><form:label path="doc_name">Name</form:label></td>
				<td><form:input path="doc_name" name="doc_name" id="doc_name" />
				</td>
			</tr>
			<tr>
				<td><form:label path="doc_degree">Degree</form:label></td>
				<td><form:input path="doc_degree" name="doc_degree"
						id="doc_degree" /></td>
			</tr>
			<tr>
				<td><form:label path="doc_speciality">Speciality</form:label></td>
				<td><form:input path="doc_speciality" name="doc_speciality"
						id="doc_speciality" /></td>
			</tr>
				<tr>
				<td><form:label path="doc_email">Email</form:label></td>
				<td><form:input path="doc_email" name="doc_email" id="doc_email" /></td>
			</tr>
			<tr>
				<td><form:label path="doc_city">City</form:label></td>
				<td><form:input path="doc_city" name="doc_city" id="doc_city" />
				</td>
			</tr>
		
			<tr>
				<td><form:label path="doc_state">State</form:label></td>
				<td><form:input path="doc_state" name="doc_state" id="doc_state" />
				</td>
			</tr>
			<tr>
				<td><form:label path="doc_ph">Phone</form:label></td>
				<td><form:input path="doc_ph" name="doc_ph" id="doc_ph" /></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button id="doc_save" name="doc_save">Save</form:button>
				</td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>