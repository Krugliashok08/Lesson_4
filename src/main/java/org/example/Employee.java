package org.example;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                "position='" + position + '\'' +
                "email='" + email + '\'' +
                "phone='" + phone + '\'' +
                "salary=" + salary +
                ",age=" + age +
                '}';
    }
    public void printInfo() {

        System.out.println("ФИО: " + name);

        System.out.println("Должность: " + position);

        System.out.println("Email: " + email);

        System.out.println("Телефон: " + phone);

        System.out.println("Зарплата: " + salary);

        System.out.println("Возраст: " + age);

        System.out.println("------------------------------------------");

    }

}



