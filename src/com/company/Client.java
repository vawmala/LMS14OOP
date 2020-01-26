package com.company;

public class Client extends Human {
    public int discountCard;
    public double money;

    public Client(String name, String surname, String patronymic, String dataBirth, String numberTel, int discountCard, double money) {
        super(name, surname, patronymic, dataBirth, numberTel);
        this.discountCard = discountCard;
        this.money = money;
    }

    public int getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(int discountCard) {
        this.discountCard = discountCard;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    void findProduct () {
        System.out.println("Клиент узнает информацию про товар");
    }
    void buy () {
        System.out.println("Клиент совершает покупку");
    }

    public Client() {
    }
}
