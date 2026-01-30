package com.example.demo.bai6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/bai6")
public class ProductController {

    @GetMapping("/list")
    public String showProductList(Model model) {
        // 1. Tạo một danh sách rỗng
        List<Product> list = new ArrayList<>();

        // 2. Thêm dữ liệu giả vào (thay vì lấy từ Database)
        list.add(new Product("iPhone 15 Pro Max", 30000000.0));
        list.add(new Product("Samsung Galaxy S24", 25000000.0));
        list.add(new Product("Xiaomi 14", 15000000.0));
        list.add(new Product("Sony Xperia 1", 18000000.0));

        // 3. Gửi danh sách sang giao diện
        model.addAttribute("products", list);

        return "bai6/list";
    }
}