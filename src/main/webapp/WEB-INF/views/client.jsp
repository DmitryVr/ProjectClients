<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The Client</title>
</head>
<body>

<table width="700" border="2" cellspacing="5" cellpadding="5" bgcolor="#eaeaea" align="center">
    <tr align="left" bgcolor=orange>
        <th>id</th>
        <th>name</th>
        <th>telephone</th>
        <th>email</th>
    </tr>
    <tr>
        <td>${client.id}</td>
        <td>${client.name}</td>
        <td>${client.telephone}</td>
        <td>${client.email}</td>
    </tr>
</table>

</body>
</html>
