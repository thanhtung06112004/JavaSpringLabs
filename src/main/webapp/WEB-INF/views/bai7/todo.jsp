<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>To-Do List Đơn Giản</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light p-5">
    <div class="container bg-white p-4 rounded shadow" style="max-width: 500px;">
        <h3 class="text-center text-primary mb-4">✅ DANH SÁCH CÔNG VIỆC</h3>

        <form action="/bai7/add" method="post" class="d-flex gap-2 mb-4">
            <input type="text" name="task" class="form-control" placeholder="Nhập việc cần làm..." required>
            <button type="submit" class="btn btn-primary">Thêm</button>
        </form>

        <ul class="list-group">
            <c:if test="${empty todos}">
                <li class="list-group-item text-center text-muted">Chưa có công việc nào!</li>
            </c:if>

            <c:forEach items="${todos}" var="t" varStatus="status">
                <li class="list-group-item d-flex justify-content-between align-items-center">
                    <span>${status.index + 1}. ${t}</span>
                    <span class="badge bg-secondary rounded-pill">Mới</span>
                </li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>