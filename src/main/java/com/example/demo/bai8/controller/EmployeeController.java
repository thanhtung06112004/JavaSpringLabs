package com.example.demo.bai8.controller;

import com.example.demo.bai8.entity.Employee;
import com.example.demo.bai8.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai8/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("employees", service.findAll());
        return "bai8/employee-list";
    }

    @PostMapping("/save")
    public String save(Employee employee) {
        service.save(employee);
        return "redirect:/bai8/employees";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/bai8/employees";
    }
}
