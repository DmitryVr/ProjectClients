<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Clients</title>
</head>
<body>

<h3 align="center">Hello!</h3>
<h4 align="center">You can add, update, delete and get client by id</h4>

<c:set var="action" value="/addorupdate" />
<%--Spring form--%>
<form:form method="POST" commandName="client" action="${action}">
    <table>

        <c:if test="${client.id != 0}">
            <rt>
                <td>
                    <h3>Update client</h3>
                </td>
            </rt>
            <tr>
                <td>
                    <form:label path="id">id:</form:label>
                </td>
                <td>
                    <%--<form:input path="id" />--%>
                    <form:input path="id" readonly="true" />
                </td>
            </tr>
        </c:if>

        <c:if test="${client.id == 0}">
        <rt>
            <td>
                <h3>Add client</h3>
            </td>
        </rt>
        </c:if>

        <tr>
            <td>
                <form:label path="name">name:</form:label>
            </td>
            <td>
                <form:input path="name" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="telephone">telephone:</form:label>
            </td>
            <td>
                <form:input path="telephone" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="email">email:</form:label>
            </td>
            <td>
                <form:input path="email" />
            </td>
        </tr>
        <tr>
            <td>
                <c:if test="${client.id == 0}">
                    <input type="submit" value="Add">
                </c:if>

                <c:if test="${client.id != 0}">
                    <input type="submit" value="Update">
                </c:if>
            </td>
        </tr>
    </table>
</form:form>

<table width="700" border="2" cellspacing="5" cellpadding="5" bgcolor="#eaeaea" align="center">
    <tr align="left" bgcolor=orange>
        <th>id</th>
        <th>name</th>
        <th>telephone</th>
        <th>email</th>
        <th>delete</th>
        <th>update</th>
    </tr>
    <c:forEach var="clientVar" items="${listclient}">
        <tr>
            <td>
                <a href="<c:url value='/getbyid/${clientVar.id}'/>">${clientVar.id}</a>
            </td>
            <td>${clientVar.name}</td>
            <td>${clientVar.telephone}</td>
            <td>${clientVar.email}</td>
            <td>
                <a href="<c:url value='/delete/${clientVar.id}'/>">Delete</a>
            </td>
            <td>
                <a href="<c:url value='/update/${clientVar.id}'/>">Update</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>



