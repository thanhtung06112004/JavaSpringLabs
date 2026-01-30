package com.example.demo.bai1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    // Spring tự động tiêm đối tượng EnglishGreetingService vào đây
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        // Gọi hàm xử lý logic
        String message = greetingService.sayGreeting();

        // In ra Console (như đề bài yêu cầu)
        System.out.println("Kiểm tra Console: " + message);

        // Trả về trình duyệt
        return message;
    }
}