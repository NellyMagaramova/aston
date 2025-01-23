package org.test.resources;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String phoneNumber;
    int salary;
    int age;

    public Person(String fio, String position,
           String email, String phoneNumber, int salary, int age){
       this.fio = fio;
       this.position = position;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.salary = salary;
       this.age = age;
    }

    public void info(){
        System.out.println("Фамилие имя отчество.: " + fio +", " + "должность: " + position  + ", " + "email: " + email + ", " +
                "телефон: "+ phoneNumber + ", " + "зарплата: " + salary + ", " + "возраст: " + age);
    }

}
