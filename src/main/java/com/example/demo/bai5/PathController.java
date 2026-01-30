package com.example.demo.bai5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bai5")
public class PathController {

    // 1. Trang danh sách (có các đường link mẫu)
    @GetMapping("/index")
    public String showIndex() {
        return "bai5/index";
    }

    // 2. Trang chi tiết (Hứng tham số từ URL)
    // {name} ở đây là một biến, nó sẽ hứng bất cứ chữ gì người dùng gõ vào
    @GetMapping("/profile/{name}")
    public String showProfile(@PathVariable("name") String name, Model model) {

        // Gửi cái tên vừa hứng được sang giao diện
        model.addAttribute("name", name);

        return "bai5/profile";
    }
}