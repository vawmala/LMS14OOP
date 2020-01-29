package com.company;

public class Store {
    public String title;
    public String address;
    Manager manager;
    Cashier cashier;
    Guard guard;
    Client client;
    Employee employee;

    public Store (String title, String address) {
        this.title = title;
        this.address = address;
        this.manager = new Manager();
        this.cashier = new Cashier();
        this.client = new Client();
        this.guard = new Guard();
        this.employee = new Employee();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Store(String title) {
        this.title = title;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Guard getGuard() {
        return guard;
    }

    public void setGuard(Guard guard) {
        this.guard = guard;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    void open() {
        System.out.println("Магазин открылся");
    }

    void breakLunch() {
        System.out.println("Магазин закрылся на обед");
    }
    void sellGoods () {
        System.out.println("Магазин начинает продавать товары");
    }

 }
