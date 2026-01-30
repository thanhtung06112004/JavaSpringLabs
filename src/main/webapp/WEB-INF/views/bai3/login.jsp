<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Đăng Nhập Hệ Thống</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background-color: #f0f2f5; display: flex; justify-content: center; align-items: center; height: 100vh; }
        .login-card { width: 400px; padding: 30px; border-radius: 10px; background: white; box-shadow: 0 4px 8px rgba(0,0,0,0.1); }
        .btn-login { width: 100%; font-weight: bold; }
    </style>
</head>
<body>

    <div class="login-card">
        <h3 class="text-center text-primary mb-4">🔐 ĐĂNG NHẬP</h3>

        <% if (request.getAttribute("message") != null) { %>
            <div class="alert alert-${alertClass} text-center" role="alert">
                ${message}
            </div>
        <% } %>

        <form action="/bai3/login" method="post">
            <div class="mb-3">
                <label class="form-label">Tên đăng nhập</label>
                <input type="text" name="username" class="form-control" placeholder="Nhập admin" value="${username}" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Mật khẩu</label>
                <input type="password" name="password" class="form-control" placeholder="Nhập 123" required>
            </div>

            <button type="submit" class="btn btn-primary btn-login">ĐĂNG NHẬP</button>
        </form>
    </div>

</body>
</html>