<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Kết Quả Đăng Ký</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="p-5">
    <div class="container border p-4 rounded shadow bg-light" style="max-width: 500px;">
        <h3 class="text-success text-center">✅ ${message}</h3>
        <hr>
        <p><strong>Họ tên:</strong> ${sv.name}</p>
        <p><strong>Email:</strong> ${sv.email}</p>
        <p><strong>Điểm:</strong> ${sv.mark}</p>
        <p><strong>Giới tính:</strong> ${sv.gender}</p>

        <a href="/bai4/form" class="btn btn-primary w-100 mt-3">Nhập lại</a>
    </div>
</body>
</html>