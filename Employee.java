package ru.geekbrains;

 public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int age;
    int salary;


    public Employee(String name,String position, String email,String phone,int age,int salary){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone, salary, age);
    }




}



