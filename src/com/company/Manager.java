package com.company;

public class Manager extends Employee {
    public String department;

    public Manager(String name, String surname, String patronymic, String dataBirth, String numberTel, String dataEmployment, double salary, String presence, String department) {
        super(name, surname, patronymic, dataBirth, numberTel, dataEmployment, salary, presence);
        this.department = department;
    }

    void consult() {
        System.out.println("Менеджер рассказывает о товаре");
    }

    void talkDiscounts() {
        System.out.println("Менеджер информирует про скидки");
    }

    void giveAdvice() {
        System.out.println("Менеджер дал совет о покупке товара");
    }

    public Manager() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    void work() {
        System.out.println("Менеджер предлагает товар магазина покупателю");
    }
}
