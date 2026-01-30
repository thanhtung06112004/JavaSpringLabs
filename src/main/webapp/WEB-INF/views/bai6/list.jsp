<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Danh Sách Sản Phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="p-5">
    <div class="container">
        <h3 class="text-center text-danger mb-4">📱 KHO HÀNG DI ĐỘNG</h3>

        <table class="table table-bordered table-hover shadow">
            <thead class="table-dark">
                <tr>
                    <th>STT</th>
                    <th>Tên Sản Phẩm</th>
                    <th>Giá Tiền (VNĐ)</th>
                    <th>Hành Động</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${products}" var="p" varStatus="status">
                    <tr>
                        <td>${status.index + 1}</td> <td>${p.name}</td>
                        <td class="text-success fw-bold">${p.price}</td>
                        <td>
                            <button class="btn btn-sm btn-primary">Xem</button>
                            <button class="btn btn-sm btn-danger">Xóa</button>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>