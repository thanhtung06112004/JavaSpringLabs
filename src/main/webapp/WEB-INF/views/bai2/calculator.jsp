<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bài 2: Máy Tính Cá Nhân</title>
    <style>
        body { font-family: Tahoma, sans-serif; background-color: #f4f4f4; display: flex; justify-content: center; padding-top: 50px; }
        .container {
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            width: 350px;
            text-align: center;
        }
        h2 { color: #007bff; margin-bottom: 20px; }
        input, select, button {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        button { background-color: #28a745; color: white; border: none; font-weight: bold; cursor: pointer; }
        button:hover { background-color: #218838; }
        .result-box {
            margin-top: 20px;
            padding: 15px;
            background-color: #e9ecef;
            border-radius: 4px;
        }
        .error { color: red; font-weight: bold; }
        .success { color: blue; font-weight: bold; font-size: 1.2em; }
    </style>
</head>
<body>

    <div class="container">
        <h2>🧮 MÁY TÍNH (BÀI 2)</h2>

        <form action="/bai2/calculator" method="post">
            <input type="number" name="so1" step="any" placeholder="Nhập số thứ nhất" value="${so1}" required>

            <select name="pheptinh">
                <option value="+">Cộng (+)</option>
                <option value="-">Trừ (-)</option>
                <option value="*">Nhân (*)</option>
                <option value="/">Chia (/)</option>
            </select>

            <input type="number" name="so2" step="any" placeholder="Nhập số thứ hai" value="${so2}" required>

            <button type="submit">TÍNH KẾT QUẢ</button>
        </form>

        <div class="result-box">
            Kết quả: <span class="success">${ketQua}</span> <br>
            <span class="error">${thongBao}</span>
        </div>
    </div>

</body>
</html>