package com.example.demo.bai4;

// Class này đại diện cho Sinh Viên
public class Student {
    private String name;
    private String email;
    private Double mark; // Điểm số
    private String gender; // Giới tính

    // Bắt buộc phải có Constructor rỗng
    public Student() {}

    // Constructor có tham số
    public Student(String name, String email, Double mark, String gender) {
        this.name = name;
        this.email = email;
        this.mark = mark;
        this.gender = gender;
    }

    // --- GETTER & SETTER (Bắt buộc phải có để Spring đọc/ghi dữ liệu) ---
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Double getMark() { return mark; }
    public void setMark(Double mark) { this.mark = mark; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
}