package com.company;

public class Employee extends Human {
    public String dataEmployment;
    public double salary;
    public String presence;

    void comeWork () {
        System.out.println("Работники пришли на работу");
    }

    void goLunch () {
        System.out.println("Работники вышли на обед");
    }

    void work () {
        System.out.println("Работники усердно работают");
    }

    public Employee(String name, String surname, String patronymic, String dataBirth, String numberTel, String dataEmployment, double salary, String presence) {
        super(name, surname, patronymic, dataBirth, numberTel);
        this.dataEmployment = dataEmployment;
        this.salary = salary;
        this.presence = presence;
    }

    public Employee() {
    }

    public String getDataEmployment() {
        return dataEmployment;
    }

    public void setDataEmployment(String dataEmployment) {
        this.dataEmployment = dataEmployment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }
}
