package com.example.demo.bai3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bai3")
public class LoginController {

    // Hiển thị form đăng nhập
    @GetMapping("/login")
    public String showLoginForm() {
        return "bai3/login";
    }

    // Xử lý khi bấm nút Đăng nhập
    @PostMapping("/login")
    public String checkLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {

        // Kiểm tra cứng: admin / 123
        if ("admin".equals(username) && "123".equals(password)) {
            model.addAttribute("message", "Đăng nhập thành công! Xin chào Admin.");
            model.addAttribute("alertClass", "success"); // Màu xanh
        } else {
            model.addAttribute("message", "Sai tên đăng nhập hoặc mật khẩu!");
            model.addAttribute("alertClass", "danger"); // Màu đỏ
        }

        // Giữ lại tên đăng nhập để người dùng đỡ phải gõ lại
        model.addAttribute("username", username);

        return "bai3/login";
    }
}