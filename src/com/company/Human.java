package com.company;



public class Human {
    private String name;
    private String surname;
    private String patronymic;
    private String dataBirth;
    private String numberTel;

    public Human(String name, String surname, String patronymic, String dataBirth, String numberTel) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dataBirth = dataBirth;
        this.numberTel = numberTel;
    }

    public Human() {
    }

    void sayHello() {
        System.out.println("Всем Привет!");
    }

    void sayGoodbye () {
        System.out.println("Досвидания");
    }

  }
