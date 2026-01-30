package com.example.demo.bai4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bai4")
public class StudentController {

    // 1. Chạy lên thì hiện form
    @GetMapping("/form")
    public String showForm(Model model) {
        // Tạo một object rỗng để hứng dữ liệu từ form
        Student sv = new Student();
        model.addAttribute("student", sv);
        return "bai4/form";
    }

    // 2. Bấm nút Submit thì nhận nguyên cục object Student
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student sv, Model model) {
        // Lúc này 'sv' đã có đầy đủ thông tin người dùng nhập
        model.addAttribute("message", "Đăng ký thành công!");
        model.addAttribute("sv", sv); // Gửi lại object qua view để hiển thị
        return "bai4/result"; // Chuyển sang trang kết quả
    }
}