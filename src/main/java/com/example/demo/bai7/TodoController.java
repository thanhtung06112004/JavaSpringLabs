package com.example.demo.bai7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/bai7")
public class TodoController {

    // Đây là cái "Database" giả, lưu tạm trong RAM
    // Dùng static để dữ liệu không bị mất khi reload trang
    private static List<String> todoList = new ArrayList<>();

    // 1. Hiển thị trang To-Do
    @GetMapping("/todo")
    public String showTodo(Model model) {
        model.addAttribute("todos", todoList);
        return "bai7/todo";
    }

    // 2. Xử lý thêm công việc mới
    @PostMapping("/add")
    public String addTodo(@RequestParam("task") String task) {
        // Thêm vào danh sách
        if (task != null && !task.trim().isEmpty()) {
            todoList.add(task);
        }

        // QUAN TRỌNG: Sau khi thêm xong, phải dùng "redirect:"
        // để quay về trang danh sách. Nếu dùng "return" thường thì khi F5 sẽ bị lỗi gửi lại form.
        return "redirect:/bai7/todo";
    }
}