package com.company;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("Victory", "Soborniy str 167");
        store.open();
        store.getEmployee().comeWork();
        store.sellGoods();
        store.getClient().findProduct();
        store.getManager().work();
        store.getClient().buy();
        store.getCashier().work();
        store.getGuard().work();
        store.breakLunch();
        store.getEmployee().goLunch();
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
