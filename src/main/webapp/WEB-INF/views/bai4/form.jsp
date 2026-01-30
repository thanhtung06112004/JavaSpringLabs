<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Đăng Ký Sinh Viên</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="p-5">
    <div class="container border p-4 rounded shadow" style="max-width: 500px;">
        <h3 class="text-primary text-center">📝 ĐĂNG KÝ HỌC</h3>

        <form action="/bai4/save" method="post">
            <div class="mb-3">
                <label>Họ và tên:</label>
                <input type="text" name="name" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>Email:</label>
                <input type="email" name="email" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>Điểm trung bình:</label>
                <input type="number" step="0.1" name="mark" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>Giới tính:</label><br>
                <input type="radio" name="gender" value="Nam" checked> Nam
                <input type="radio" name="gender" value="Nữ" class="ms-3"> Nữ
            </div>

            <button type="submit" class="btn btn-success w-100">LƯU THÔNG TIN</button>
        </form>
    </div>
</body>
</html>