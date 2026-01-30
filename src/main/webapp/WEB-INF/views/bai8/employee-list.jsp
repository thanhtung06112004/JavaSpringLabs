<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Employee Management</title>
</head>
<body>
<h2>Employee List</h2>

<form action="/bai8/employees/save" method="post">
    Name: <input type="text" name="name" required />
    Email: <input type="email" name="email" required />
    Salary: <input type="number" step="0.01" name="salary" required />
    <button type="submit">Save</button>
</form>

<hr/>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Salary</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${employees}" var="e">
        <tr>
            <td>${e.id}</td>
            <td>${e.name}</td>
            <td>${e.email}</td>
            <td>${e.salary}</td>
            <td>
                <a href="/bai8/employees/delete/${e.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
