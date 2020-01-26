package com.company;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Oleg", "Moroz", "Vicktorovich", "19.10.92", "0678885987", "21.02.2002", 4500, "yes");
        Client client = new Client("Vladymyr", "Logvinov", "Vadimovich", "10.10.95", "0997789878", 125666489, 10065);
        Manager manager = new Manager("Elena", "Voytich", "Andreevna", "12.06.1996", "0936665879", "10.03.2004", 7500, "yes", "Sales");
        Cashier cashier = new Cashier("Oksana", "Popovich", "Sergeevna", "12.04.1995", "0639878896", "11.10.2013", 6000, "yes", 6);
        Guard guard = new Guard("Petro", "Savenko", "Vasiliovich", "25.02.1980", "0994445568", "12.04.1998", 6200, "yes");
        Store store = new Store("Victory", "Soborniy str 167", manager, cashier, guard, client);
        store.open();
        employee.comeWork();
        store.sellGoods();
        client.findProduct();
        manager.work();
        client.buy();
        cashier.work();
        guard.work();
        store.breakLunch();
        employee.goLunch();
        System.out.println("_________________________________");
        System.out.println(store.getCashier().equals(store.getClient()));
        System.out.println(store.getClient().equals(store.getGuard()));
        System.out.println(store.getGuard().equals(store.getCashier()));
        System.out.println("_________________________________");
        System.out.println(store.getCashier().hashCode());
        System.out.println(store.getClient().hashCode());
        System.out.println(store.getGuard().hashCode());
        System.out.println("_________________________________");
        System.out.println(store.getCashier().toString());
        System.out.println(store.getClient().toString());
        System.out.println(store.getGuard().toString());

    }
}
