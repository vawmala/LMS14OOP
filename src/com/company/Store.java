package com.company;

public class Store {
    public String title;
    public String address;
    Manager manager;
    Cashier cashier;
    Guard guard;
    Client client;

    public Store(String title, String address, Manager manager, Cashier cashier, Guard guard, Client client) {
        this.title = title;
        this.address = address;
        this.manager = manager;
        this.cashier = cashier;
        this.guard = guard;
        this.client = client;
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
