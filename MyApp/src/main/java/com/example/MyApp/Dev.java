package com.example.MyApp;

public class Dev {

    private Laptop laptop;
    private int age;

    public Dev() {
        System.out.println("Default constructor called...");
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build() {
        laptop.compile();
        System.out.println("Developer age is: " + age);
        System.out.println("Working on awesome project...");
    }
}
