package com.example.demo.bai2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bai2") // Gom tất cả chức năng bài 2 vào link /bai2
public class CalculatorController {

    // Link chạy: http://localhost:8080/bai2/calculator
    @GetMapping("/calculator")
    public String showForm() {
        // Trả về file jsp nằm trong thư mục views/bai2/
        return "bai2/calculator";
    }

    @PostMapping("/calculator")
    public String tinhToan(
            @RequestParam("so1") double so1,
            @RequestParam("so2") double so2,
            @RequestParam("pheptinh") String phepTinh,
            Model model) {

        double ketQua = 0;
        String thongBao = "";

        // Xử lý tính toán
        switch (phepTinh) {
            case "+": ketQua = so1 + so2; break;
            case "-": ketQua = so1 - so2; break;
            case "*": ketQua = so1 * so2; break;
            case "/":
                if (so2 == 0) {
                    thongBao = "Không thể chia cho 0!";
                } else {
                    ketQua = so1 / so2;
                }
                break;
            default: thongBao = "Phép tính không hợp lệ";
        }

        // Gửi kết quả về lại giao diện
        model.addAttribute("ketQua", ketQua);
        model.addAttribute("thongBao", thongBao);
        model.addAttribute("so1", so1); // Giữ lại số đã nhập
        model.addAttribute("so2", so2);

        return "bai2/calculator";
    }
}