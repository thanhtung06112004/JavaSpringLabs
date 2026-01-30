<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hồ Sơ Cá Nhân</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="p-5">
    <div class="container text-center mt-5">
        <div class="card shadow p-4 mx-auto" style="max-width: 400px;">
            <div class="card-body">
                <h1 class="display-1">👤</h1>
                <h2 class="text-primary">Xin chào, ${name}!</h2>
                <p class="text-muted">Đây là trang hồ sơ cá nhân của bạn.</p>
                <a href="/bai5/index" class="btn btn-outline-secondary mt-3">⬅ Quay lại danh sách</a>
            </div>
        </div>
    </div>
</body>
</html>