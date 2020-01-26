package com.company;

public class Cashier extends Employee {
    public int numberCashbox;

    public Cashier(String name, String surname, String patronymic, String dataBirth, String numberTel, String dataEmployment, double salary, String presence, int numberCashbox) {
        super(name, surname, patronymic, dataBirth, numberTel, dataEmployment, salary, presence);
        this.numberCashbox = numberCashbox;
    }

    void countMoney () {
        System.out.println("Кассир считает деньги");
    }

    @Override
    void work() {
        System.out.println("Кассир пробивает товар на кассе");
    }

    public Cashier() {
    }

    public int getNumberCashbox() {
        return numberCashbox;
    }

    public void setNumberCashbox(int numberCashbox) {
        this.numberCashbox = numberCashbox;
    }
}
