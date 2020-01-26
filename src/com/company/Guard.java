package com.company;

public class Guard extends Employee {

    public Guard(String name, String surname, String patronymic, String dataBirth, String numberTel, String dataEmployment, double salary, String presence) {
        super(name, surname, patronymic, dataBirth, numberTel, dataEmployment, salary, presence);
    }

    void talkRadioSet () {
        System.out.println("Охранник разоваривает по рации");
    }

    @Override
    void work() {
        System.out.println("Охранник наблюдает за магазином");
    }

    public Guard() {
    }

}

